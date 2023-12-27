package training6.csv;

import java.io.Serializable;

import org.seasar.s2csv.csv.annotation.column.CSVColumn;
import org.seasar.s2csv.csv.annotation.entity.CSVEntity;

@CSVEntity(header=false)
public class FortuneCsv implements Serializable {

	@CSVColumn(columnIndex=0)
	public String omikujiCode;
	
	@CSVColumn(columnIndex=1)
	public String unsei;

	@CSVColumn(columnIndex=2)
	public String negaigoto;

	@CSVColumn(columnIndex=3)
	public String akinai;

	@CSVColumn(columnIndex=4)
	public String gakumon;
	

}
