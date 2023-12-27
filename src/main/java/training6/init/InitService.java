package training6.init;

import javax.annotation.Resource;

import training6.service.CsvService;
import training6.service.OmikujiService;

/**
 * データベースの初期化を行うサービスです
 **/
public class InitService {

	/** CSVのオブジェクトを表します */
	@Resource
	protected CsvService csvService;

	/**Omikujiのオブジェクトを表します*/
	@Resource
	protected OmikujiService omikujiService;

	/**
	 * データベースの初期化を行うメソッドです
	 */
	public void init() {

		//System.out.println(omikujiService.hoge().omikujiCode);

		//初期化処理：csvファイルの読み込みと、Omikujiテーブルへの挿入
		System.out.println("csvファイルの読み込みを行います");

		//csvファイルからDBへ登録
		csvService.insertCsv();
		
		//登録できている件数を出力
		System.out.println(omikujiService.countMax() + "件登録できています");
		
	}
}
