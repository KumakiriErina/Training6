package training6.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.seasar.framework.container.SingletonS2Container;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import training6.dto.SearchRatioDTO;
import training6.form.RatioForm;
import training6.omikuji.BadLuck;
import training6.omikuji.GoodBlessing;
import training6.omikuji.GreatBlessing;
import training6.omikuji.MiddleBlassing;
import training6.omikuji.Omikuji;
import training6.omikuji.SmallBlessing;
import training6.omikuji.UncertinLuck;
import training6.service.ResultService;
/**
 * 結果画面から全体の過去半年と本日の占い結果の割合画面
 * に遷移するアクションです
 * @author e_kumakiri
 *
 */
public class OmikujiRatioAction {

	/**ratioForm*/
	@Resource
	@ActionForm
	protected RatioForm ratioForm;

	/**resultService*/
	@Resource
	protected ResultService resultService;

	/**
	 * 結果画面から、全体の過去半年と本日の占い結果の割合結果画面
	 * に遷移するメソッドです
	 * @return 全体の過去半年と本日の占い結果の割合結果画面
	 */
	@Execute(validator = false)
	public String index() {

		//resultDaoの呼び出し（戻り値を変数に保存）
		List<SearchRatioDTO> ratio = resultService.omikujiRatio();

		//おみくじオブジェクト生成の準備
		Omikuji omikuji = null;

		//おみくじを入れる箱の準備
		List<Omikuji> omikujiBox = new ArrayList<>();

		//回数分行う
		for (int i = 0; i < ratio.size(); i++) {

			//値を取得
			String unsei = ratio.get(i).unsei;
			Double unseiNameRatio = ratio.get(i).unseiNameRatio;

			//switch文(具象クラスの生成)
			switch (unsei) {
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

			//おみくじオブジェクトに値をset
			omikuji.setUnsei();
			omikuji.setUnseiNameRatio(unseiNameRatio);
			
		}

		//フォームに値をセットする
		ratioForm.ratioList = omikujiBox;

		//リクエストを取得
		HttpServletRequest request = SingletonS2Container.getComponent(HttpServletRequest.class);

		//リクエストスコープに値を保存
		request.setAttribute("Ratio", omikujiBox);

		//全体の過去半年と本日の占い結果の割合画面に遷移
		return "omikujiRatio.jsp";
	}
}
