package training6.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.service.S2AbstractService;
import org.seasar.s2csv.csv.S2CSVParseCtrl;
import org.seasar.s2csv.csv.factory.S2CSVCtrlFactory;

import training6.csv.FortuneCsv;
import training6.entity.Omikuji;
/**
 * CSVファイルを読み込み、テーブルに値を渡しています
 * @author e_kumakiri
 *
 */
public class CsvService extends S2AbstractService<Omikuji> {

	/**s2csvCtrlFactory*/
	@Resource
	public S2CSVCtrlFactory s2csvCtrlFactory;

	/**omikujiService*/
	@Resource
	OmikujiService omikujiService;

	/**
	 * CSVファイルの中身を取り込み、OmikujiServiceで
	 * 登録するテーブルに、取り込んだ値を渡しているメソッドです
	 * @return 登録できた件数
	 */
	public void insertCsv() {

		try {

			// ファイルリーダーにファイルを登録
			Reader reader = new FileReader(
					"/Users/e_kumakiri/Desktop/workspace/Training6/src/main/webapp/data/Fortune.csv");

			// CSVデータを取得するコントローラの定義
			S2CSVParseCtrl<FortuneCsv> controller = s2csvCtrlFactory.getParseController(FortuneCsv.class, reader);

			//CSVファイルを読み込んで、最後まで実行する
			while (controller.readNext()) {

				//Omikujiテーブルの、登録するメソッドに渡す
				omikujiService.insertOmikuji(
						controller.parse().omikujiCode,
						controller.parse().unsei,
						controller.parse().negaigoto,
						controller.parse().akinai,
						controller.parse().gakumon);
			}

		} catch (FileNotFoundException fe) {

			//csvファイルが見つからない場合
			System.out.println("csvファイルが見つかりません。");
		}
	}
}
