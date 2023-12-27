package training6.entity;

import java.util.Date;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;
import training6.entity.MstUnseiNames._MstUnseiNames;
import training6.entity.ResultNames._ResultNames;

/**
 * {@link Omikuji}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2023/12/27 13:16:50")
public class OmikujiNames {

    /**
     * omikujiCodeのプロパティ名を返します。
     * 
     * @return omikujiCodeのプロパティ名
     */
    public static PropertyName<String> omikujiCode() {
        return new PropertyName<String>("omikujiCode");
    }

    /**
     * unseiCodeのプロパティ名を返します。
     * 
     * @return unseiCodeのプロパティ名
     */
    public static PropertyName<String> unseiCode() {
        return new PropertyName<String>("unseiCode");
    }

    /**
     * negaigotoのプロパティ名を返します。
     * 
     * @return negaigotoのプロパティ名
     */
    public static PropertyName<String> negaigoto() {
        return new PropertyName<String>("negaigoto");
    }

    /**
     * akinaiのプロパティ名を返します。
     * 
     * @return akinaiのプロパティ名
     */
    public static PropertyName<String> akinai() {
        return new PropertyName<String>("akinai");
    }

    /**
     * gakumonのプロパティ名を返します。
     * 
     * @return gakumonのプロパティ名
     */
    public static PropertyName<String> gakumon() {
        return new PropertyName<String>("gakumon");
    }

    /**
     * changerのプロパティ名を返します。
     * 
     * @return changerのプロパティ名
     */
    public static PropertyName<String> changer() {
        return new PropertyName<String>("changer");
    }

    /**
     * updateDateのプロパティ名を返します。
     * 
     * @return updateDateのプロパティ名
     */
    public static PropertyName<Date> updateDate() {
        return new PropertyName<Date>("updateDate");
    }

    /**
     * authorのプロパティ名を返します。
     * 
     * @return authorのプロパティ名
     */
    public static PropertyName<String> author() {
        return new PropertyName<String>("author");
    }

    /**
     * createdDateのプロパティ名を返します。
     * 
     * @return createdDateのプロパティ名
     */
    public static PropertyName<Date> createdDate() {
        return new PropertyName<Date>("createdDate");
    }

    /**
     * mstUnseiのプロパティ名を返します。
     * 
     * @return mstUnseiのプロパティ名
     */
    public static _MstUnseiNames mstUnsei() {
        return new _MstUnseiNames("mstUnsei");
    }

    /**
     * resultListのプロパティ名を返します。
     * 
     * @return resultListのプロパティ名
     */
    public static _ResultNames resultList() {
        return new _ResultNames("resultList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _OmikujiNames extends PropertyName<Omikuji> {

        /**
         * インスタンスを構築します。
         */
        public _OmikujiNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _OmikujiNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _OmikujiNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * omikujiCodeのプロパティ名を返します。
         *
         * @return omikujiCodeのプロパティ名
         */
        public PropertyName<String> omikujiCode() {
            return new PropertyName<String>(this, "omikujiCode");
        }

        /**
         * unseiCodeのプロパティ名を返します。
         *
         * @return unseiCodeのプロパティ名
         */
        public PropertyName<String> unseiCode() {
            return new PropertyName<String>(this, "unseiCode");
        }

        /**
         * negaigotoのプロパティ名を返します。
         *
         * @return negaigotoのプロパティ名
         */
        public PropertyName<String> negaigoto() {
            return new PropertyName<String>(this, "negaigoto");
        }

        /**
         * akinaiのプロパティ名を返します。
         *
         * @return akinaiのプロパティ名
         */
        public PropertyName<String> akinai() {
            return new PropertyName<String>(this, "akinai");
        }

        /**
         * gakumonのプロパティ名を返します。
         *
         * @return gakumonのプロパティ名
         */
        public PropertyName<String> gakumon() {
            return new PropertyName<String>(this, "gakumon");
        }

        /**
         * changerのプロパティ名を返します。
         *
         * @return changerのプロパティ名
         */
        public PropertyName<String> changer() {
            return new PropertyName<String>(this, "changer");
        }

        /**
         * updateDateのプロパティ名を返します。
         *
         * @return updateDateのプロパティ名
         */
        public PropertyName<Date> updateDate() {
            return new PropertyName<Date>(this, "updateDate");
        }

        /**
         * authorのプロパティ名を返します。
         *
         * @return authorのプロパティ名
         */
        public PropertyName<String> author() {
            return new PropertyName<String>(this, "author");
        }

        /**
         * createdDateのプロパティ名を返します。
         *
         * @return createdDateのプロパティ名
         */
        public PropertyName<Date> createdDate() {
            return new PropertyName<Date>(this, "createdDate");
        }

        /**
         * mstUnseiのプロパティ名を返します。
         * 
         * @return mstUnseiのプロパティ名
         */
        public _MstUnseiNames mstUnsei() {
            return new _MstUnseiNames(this, "mstUnsei");
        }

        /**
         * resultListのプロパティ名を返します。
         * 
         * @return resultListのプロパティ名
         */
        public _ResultNames resultList() {
            return new _ResultNames(this, "resultList");
        }
    }
}