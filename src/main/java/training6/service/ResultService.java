package training6.service;

import static training6.entity.ResultNames.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;

import training6.dto.SearchRatioDTO;
import training6.entity.Result;
/**
 * おみくじの結果を登録、
 * 全体の過去半年と本日の占い結果の割合を取得、
 * 最初に入力された誕生日の過去半年の結果を取得
 * しています
 * 
 * @author e_kumakiri
 *
 */
public class ResultService {

	/**jdbcManager*/
	@Resource
	JdbcManager jdbcManager;

	/**
	* 2つのDate型を受け取り、おみくじの結果を登録しています
	* 
	* @param date 現在のDate型
	* @param inputBirthday 入力した誕生日のDate型
	* @param omikujiCode　おみくじコード
	*/
	public void insertResult(Date date, Date inputBirthday, String omikujiCode) {

		//エンティティの生成
		Result result = new Result();

		//占った日をjava.util.Dateから、java.sql.Dateへ変換
		java.sql.Date dateConvertDate = new java.sql.Date(date.getTime());

		//誕生日をjava.util.Dateから、java.sql.Dateへ変換
		java.sql.Date dateConvertInputDate = new java.sql.Date(inputBirthday.getTime());

		//Resultエンティティに値を入れている
		result.fortuneDate = dateConvertDate;
		result.birthday = dateConvertInputDate;
		result.omikujiCode = omikujiCode;

		//実行
		jdbcManager
				.updateBySqlFile(
						"training6/entity/resultInsertSql.sql", result)
				.execute();
	}

	/**
	 * 全体の過去半年と本日の占い結果の割合を取得するメソッドです
	 * @return ratio 割合
	 */
	public List<SearchRatioDTO> omikujiRatio() {
		
		//おみくじ情報をListに格納
		List<SearchRatioDTO> resultList = new ArrayList<>();

		//実行
		//割合の情報をListに格納
		resultList = jdbcManager.selectBySqlFile(
				SearchRatioDTO.class,"training6/entity/selectRatioSql.sql")
				.getResultList();

		//割合の情報を返却
		return resultList;
		
	}

	/**
	 * 最初に入力された誕生日の過去半年の結果を取得するメソッドです
	 * @param　birthday フォームに入力した誕生日
	 * @return resultList　最初に入力された誕生日の過去半年の結果
	 */
	public List<Result> OmikujiInformation(String birthday) {

		//おみくじ情報をListに格納
		List<Result> resultList = new ArrayList<>();
		
		//フォーマットの準備
		SimpleDateFormat simpleDateFormat = null;
	
		//入力した誕生日をDate型に変換する準備
		Date convertBirthday = null;
		

		try {

			//入力した誕生日をDate型に変換する準備（フォーマット）
			simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
			
			//入力した誕生日をDate型に変換
			convertBirthday = simpleDateFormat.parse(birthday);
			
			//実行
			resultList = jdbcManager.from(Result.class)
					.leftOuterJoin(omikuji())
					.leftOuterJoin(omikuji().mstUnsei())
					.where("fortune_date > now() - interval '6 months' AND birthday = ?",convertBirthday)
					.getResultList();
					
		}catch(ParseException pe) {
			//例外発生時に出力：Date型の変換がうまくいかなかった時
			System.out.println("変換がうまくいきませんでした");
		}

		//resultListを返却
		return resultList;
	}
}
