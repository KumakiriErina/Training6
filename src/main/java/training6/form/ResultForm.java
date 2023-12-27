package training6.form;

import java.util.List;

import org.seasar.struts.annotation.DateType;
import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Required;

import training6.omikuji.Omikuji;
/**
 * Beanです
 * @author e_kumakiri
 */
public class ResultForm {

	/**誕生日のプロパティです*/
	@Required
	@Mask(mask = "^[0-9]{4}[0-9]{2}[0-9]{2}$")
	@DateType(datePatternStrict = "yyyyMMdd")
	public String birthday;
	
	/**おみくじの結果のプロパティです*/
	public List<Omikuji> resultList;

}
