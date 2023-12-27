package training6.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.seasar.framework.container.SingletonS2Container;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import training6.entity.Result;
import training6.form.InformationForm;
import training6.omikuji.BadLuck;
import training6.omikuji.GoodBlessing;
import training6.omikuji.GreatBlessing;
import training6.omikuji.MiddleBlassing;
import training6.omikuji.Omikuji;
import training6.omikuji.SmallBlessing;
import training6.omikuji.UncertinLuck;
import training6.service.ResultService;
/**
 * 結果画面から、入力された誕生日の過去半年の結果画面
 * に遷移するアクションです
 * @author e_kumakiri
 *
 */
public class HalfYearAllOmikujiAction {

	/**httpSession*/
	@Resource
	protected HttpSession httpSession;

	/**resultService*/
	@Resource
	protected ResultService resultService;

	/**informationForm*/
	@Resource
	@ActionForm
	protected InformationForm informationForm;

	/**
	 *  結果画面から、入力された誕生日の過去半年の結果画面
	 *  に遷移するメソッドです
	 * @return 入力された誕生日の過去半年の結果画面
	 */
			 
	@Execute(validator = false)
	public String index() {

		//リクエストを取得
		HttpServletRequest request = SingletonS2Container.getComponent(HttpServletRequest.class);

		//birthdayをsessionから取得する準備
		httpSession = request.getSession();

		//session(object型)なので、型変換（キーを指定）
		String birthday = (String) httpSession.getAttribute("birthday");

		//resultServiceのOmikujiInformationの呼び出し（戻り値を変数に保存）
		List<Result> result = resultService.OmikujiInformation(birthday);
		
		//おみくじオブジェクト生成の準備
		Omikuji omikuji = null;
		
		//おみくじを入れる箱の準備
		List<Omikuji> omikujiBox = new ArrayList<>();
		
		//回数分行う
		for(int i = 0; i < result.size(); i++) {
			
			//値を取得
			Date fortuneDate = result.get(i).fortuneDate;
			String unseiName = result.get(i).omikuji.mstUnsei.unseiName;
			String negaigoto = result.get(i).omikuji.negaigoto;
			String akinai = result.get(i).omikuji.akinai;
			String gakumon = result.get(i).omikuji.gakumon;
			
		
			//switch文(具象クラスの生成)
			switch (unseiName) {
			case "大吉":
				//それぞれのオブジェクトを生成
				omikuji = new GreatBlessing();
				break;

			case "中吉":
				omikuji = new MiddleBlassing();
				break;

			case "小吉":
				omikuji = new SmallBlessing();
				break;

			case "末吉":
				omikuji = new UncertinLuck();
				break;

			case "吉":
				omikuji = new GoodBlessing();
				break;

			case "凶":
				omikuji = new BadLuck();
				break;

			default:
				System.out.println("飛ばします");
				break;
			}

			//おみくじが回数分入る
			omikujiBox.add(omikuji);
			
			//Date型をString型に変換
			String str = new SimpleDateFormat("yyyyMMdd").format(fortuneDate);

			//おみくじオブジェクトに値をset
			omikuji.setFortuneDate(str);
			omikuji.setUnsei();
			omikuji.setNegaigoto(negaigoto);
			omikuji.setAkinai(akinai);
			omikuji.setGakumon(gakumon);
		}

		//フォームに値をセットする
		informationForm.resultList = omikujiBox;
		
		//リクエストスコープに値を保存
		request.setAttribute("result", omikujiBox);

		//入力された誕生日の過去半年の結果画面に遷移
		return "halfYearAllOmikuji.jsp";
	}
}
