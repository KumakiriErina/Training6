package training6.entity;

import javax.annotation.Generated;
import training6.entity.MstUnseiNames._MstUnseiNames;
import training6.entity.OmikujiNames._OmikujiNames;
import training6.entity.ResultNames._ResultNames;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2023/12/27 13:16:50")
public class Names {

    /**
     * {@link Omikuji}の名前クラスを返します。
     * 
     * @return Omikujiの名前クラス
     */
    public static _OmikujiNames omikuji() {
        return new _OmikujiNames();
    }

    /**
     * {@link Result}の名前クラスを返します。
     * 
     * @return Resultの名前クラス
     */
    public static _ResultNames result() {
        return new _ResultNames();
    }

    /**
     * {@link MstUnsei}の名前クラスを返します。
     * 
     * @return MstUnseiの名前クラス
     */
    public static _MstUnseiNames mstUnsei() {
        return new _MstUnseiNames();
    }
}