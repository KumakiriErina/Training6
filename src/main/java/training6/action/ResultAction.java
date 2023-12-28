package training6.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMessage;
import org.seasar.framework.container.SingletonS2Container;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import training6.form.ResultForm;
import training6.service.OmikujiService;
import training6.service.ResultService;
/**
 * 誕生日入力画面に遷移するアクションと、
 * 誕生日入力画面から結果画面
 * に遷移するアクションです
 * @author e_kumakiri
 *
 */
public class ResultAction extend Action{

	/**resultForm*/
	@Resource
	@ActionForm
	protected ResultForm resultForm;
	
	/**resultService*/
	@Resource
	protected ResultService resultService;

	/**omikujiService*/
	@Resource
	protected OmikujiService omikujiService;

	/**
	 * 誕生日入力画面に遷移するメソッドです
	 * @return input.jsp 誕生日入力画面
	 */
	@Execute(validator = false)
	public String index() {
		//誕生日入力画面に遷移
		return "input.jsp";
	}

	/**
	 * 結果画面に遷移するメソッドです
	 * @return result.jsp 結果画面
	 */
	@Execute(validator = true, input = "input.jsp")
	public String result() {

		//ResultFormから誕生日を取得
		String birthday = resultForm.birthday;
		
		//日付入力のフォーマットの宣言
		SimpleDateFormat simpleDateFormat = null;
		
		//現在の日付を準備
		Date date = null;

		//ランダムクラスの準備
		Random rand = null;
		
		//おみくじオブジェクトの宣言
		training6.omikuji.Omikuji omikujis = null;

		try {

			//日付入力のフォーマット（yyyyMMdd）の生成
			simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

			//フォームに入力した日付をDate型に変換
			Date inputBirthday = simpleDateFormat.parse(birthday);

			//入力した日付をフォーマット
			birthday = simpleDateFormat.format(inputBirthday);

			//Date型（現在）の生成
			date = new Date();

			//Date型(現在)をString型に変換
			String now = new SimpleDateFormat("yyyyMMdd").format(date);

			//ランダムオブジェクトを生成する（本日と入力した値のString型をInteger型に変換）
			rand = new Random(Integer.parseInt(now) + Integer.parseInt(birthday));
			
			//おみくじオブジェクト：名前が被るため、おみくじオブジェクトはomikujisに変更
			omikujis = omikujiService.getOmikujiCode(rand);
			
			//今日と、入力した日付型と、おみくじオブジェクトからおみくじコードを渡す
			resultService.insertResult(date, inputBirthday, omikujis.getOmikujiCode());
			
			//リクエストを取得
			HttpServletRequest request = SingletonS2Container.getComponent(HttpServletRequest.class);
			
			//birthdayをsessionから取得する準備
			HttpSession session = request.getSession();

			//セッションスコープに入力した値（誕生日）を保存
			session.setAttribute("birthday", birthday);
			
			//おみくじの結果を/jsp/result.jspに渡す
			request.setAttribute("omikuji", omikujis);

		}catch(ParseException pe) {

			//Date型への変換がうまくいかなかった場合
			ActionErrors errors = new ActionErrors();

			//messageを格納するリストの作成して、キー値でpropertiesを検索している
			ActionMessage msg = new ActionMessage("errors.msg.key1");
			errors.add(ActionErrors.GLOBAL_MESSAGE, msg);

			//親クラスのメソッドを呼び出す
			addErrors(request, errors);	
		}
		
		//結果画面に遷移
		return "result.jsp";
	}
	
}
