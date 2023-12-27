package training6.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Omikujiエンティティクラスです
 * 
 * @author e_kumakiri
 *
 */
@Entity
public class Omikuji {
	/**おみくじコードのプロパティ*/
	@Id
	@GeneratedValue
	@Column(name = "omikuji_code")
	public String omikujiCode;

	/**運勢コードのプロパティ*/
	@Column(name = "unsei_code")
	public String unseiCode;

	/**願い事のプロパティ*/
	public String negaigoto;

	/**商いのプロパティ*/
	public String akinai;

	/**学問のプロパティ*/
	public String gakumon;
	
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
	
	/**運勢マスタテーブルとの関連*/
	@ManyToOne
	@JoinColumn(name = "unsei_code", referencedColumnName = "unsei_code")
	public MstUnsei mstUnsei;
	
	/**結果テーブルとの関連*/
	@OneToMany(mappedBy = "omikuji")
	public List<Result> resultList;
}
