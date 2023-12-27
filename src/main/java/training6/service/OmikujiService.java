package training6.service;

import java.util.Random;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;

import training6.entity.Omikuji;
import training6.omikuji.BadLuck;
import training6.omikuji.GoodBlessing;
import training6.omikuji.GreatBlessing;
import training6.omikuji.MiddleBlassing;
import training6.omikuji.SmallBlessing;
import training6.omikuji.UncertinLuck;
/**
 * 最大値を取得、
 * おみくじをOmikujiテーブルに登録、
 * ランダムオブジェクトを受け取り、
 * おみくじオブジェクトを生成しています
 * 
 * @author e_kumakiri
 *
 */
public class OmikujiService {

	/**jdbcManager*/
	@Resource
	JdbcManager jdbcManager;

	/**
	 * 最大値を取得するメソッドです
	 * @return 最大値
	 */
	public int countMax() {
		return (int) jdbcManager.from(Omikuji.class).getCount();
	}

	/**
	 * おみくじをOmikujiテーブルに登録するメソッドです
	 * @param omikujiCode おみくじコード
	 * @param unsei 運勢名
	 * @param negaigoto 願い事
	 * @param akinai 商い
	 * @param gakumon 学問
	 * @return 登録できた件数
	 */
	public void insertOmikuji(String omikujiCode, String unsei, String negaigoto, String akinai, String gakumon) {

		//最大値を取得
		int countMax = countMax();

		//最大件数が50未満だったら登録処理にすすむ
		if (countMax < 50) {

			//エンティティの生成
			Omikuji omikuji = new Omikuji();

			//Omikujiエンティティのフィールドに値を入れている
			omikuji.omikujiCode = omikujiCode;
			//運勢名を運勢コードに変換
			omikuji.unseiCode = convertUnsei(unsei);
			omikuji.negaigoto = negaigoto;
			omikuji.akinai = akinai;
			omikuji.gakumon = gakumon;

			//実行
			jdbcManager
					.updateBySqlFile(
							"training6/entity/insertSql.sql", omikuji)
					.execute();
		}
	}

	/**
	 * ランダムオブジェクトを受け取り、おみくじオブジェクトを生成するメソッドです
	 * 
	 * @param rand ランダムオブジェクト
	 * @return Omikuji おみくじオブジェクト
	 */
	public training6.omikuji.Omikuji getOmikujiCode(Random rand) {

		//最大件数の取得
		int countMax = countMax();

		/** ランダムの最小値を定義しています*/
		final int min = 1;

		//おみくじエンティティの生成
		Omikuji omikuji = new Omikuji();

		//実行
		omikuji = jdbcManager.from(Omikuji.class)
				.where("omikujiCode = ?", String.valueOf(rand.nextInt(countMax) + min))
				.getSingleResult();

		//おみくじエンティティの値を取得する
		String omikujiCode = omikuji.omikujiCode;
		String unseiCode = omikuji.unseiCode;
		String negaigoto = omikuji.negaigoto;
		String akinai = omikuji.akinai;
		String gakumon = omikuji.gakumon;

		//おみくじオブジェクト生成：名前が被るため、おみくじオブジェクトはomikujisに命名
		training6.omikuji.Omikuji omikujis = getOmikuji(unseiCode);

		//omikujisに値をset
		omikujis.setUnsei();
		omikujis.setOmikujiCode(omikujiCode);
		omikujis.setNegaigoto(negaigoto);
		omikujis.setAkinai(akinai);
		omikujis.setGakumon(gakumon);

		return omikujis;

	}

	/**
	* 運勢名によって返す値が変化するメソッドです
	* 
	* @param unseiName 運勢名
	* @return　各具象クラスの番号
	*/
	private static String convertUnsei(String unsei) {
		//data[1]の運勢名によって返す値が変化する
		switch (unsei) {
		case "大吉":
			//大吉だったら01を返す
			return "01";
		case "中吉":
			return "02";
		case "小吉":
			return "03";
		case "末吉":
			return "04";
		case "吉":
			return "05";
		case "凶":
			return "06";
		default:
			//01から06以外だったら例外を投げる
			throw new IllegalArgumentException("予想外の値です");
		}
	}

	/**
	 * 運勢コードを元にオブジェクト生成をするクラスです
	 * 
	 * @param unseiCode 運勢コード
	 * @return おみくじオブジェクト
	 */
	private static training6.omikuji.Omikuji getOmikuji(String unseiCode) {

		//取得したおみくじ情報を元にオブジェクト生成
		switch (unseiCode) {
		case "01":
			//01だったら大吉オブジェクトを生成
			return new GreatBlessing();

		case "02":
			return new MiddleBlassing();

		case "03":
			return new SmallBlessing();

		case "04":
			return new UncertinLuck();

		case "05":
			return new GoodBlessing();

		case "06":
			return new BadLuck();

		default:
			//01から06以外だったら例外を投げる
			throw new IllegalArgumentException("予想外の値です");
		}
	}
}
