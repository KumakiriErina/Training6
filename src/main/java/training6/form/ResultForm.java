package training6.form;

import java.util.List;

import org.seasar.struts.annotation.Arg;
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
	@Required(arg0 = @Arg(key = "誕生日", resource = false))
	@Mask(mask = "^[0-9]{4}[0-9]{2}[0-9]{2}$", arg0 = @Arg(key="誕生日", resource = false))
	@DateType(datePatternStrict = "yyyyMMdd", arg0 = @Arg(key="誕生日", resource = false))
	public String birthday;
	
	/**おみくじの結果のプロパティです*/
	public List<Omikuji> resultList;

}
