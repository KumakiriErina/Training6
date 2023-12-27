package training6.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Resultエンティティクラスです
 * 
 * @author e_kumakiri
 *
 */
@Entity
public class Result {

	/**占い日付のプロパティ*/
	@Temporal(TemporalType.DATE)
	@Column(name = "fortune_date")
	public Date fortuneDate;

	/**誕生日のプロパティ*/
	@Temporal(TemporalType.DATE)
	public Date birthday;

	/**おみくじコードのプロパティ*/
	@Column(name = "omikuji_code")
	public String omikujiCode;

	/**更新者のプロパティ*/
	public String changer;

	/**更新日のプロパティ*/
	@Temporal(TemporalType.DATE)
	@Column(name = "update_date")
	public Date updateDate;

	/**作成者のプロパティ*/
	public String author;

	/**作成日のプロパティ*/
	@Temporal(TemporalType.DATE)
	@Column(name = "created_date")
	public Date createdDate;
	
	/**おみくじテーブルとの関連*/
	@ManyToOne
	@JoinColumn(name = "omikuji_code", referencedColumnName = "omikuji_code")
	public Omikuji omikuji;
}
