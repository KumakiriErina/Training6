package training6.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MstUnseiエンティティクラスです
 * 
 * @author e_kumakiri
 *
 */
@Entity
public class MstUnsei {

	public static final String TABLE = "mst_unsei";

	/**運勢コードのプロパティ*/
	@Id
	@GeneratedValue
	@Column(name = "unsei_code")
	public String unseiCode;

	/**運勢名のプロパティ*/
	@Column(name = "unsei_name")
	public String unseiName;

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
	@OneToMany(mappedBy = "mstUnsei")
	public List<Omikuji> omikujiList;
}
