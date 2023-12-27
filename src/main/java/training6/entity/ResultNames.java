package training6.entity;

import java.util.Date;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;
import training6.entity.OmikujiNames._OmikujiNames;

/**
 * {@link Result}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2023/12/27 13:16:50")
public class ResultNames {

    /**
     * fortuneDateのプロパティ名を返します。
     * 
     * @return fortuneDateのプロパティ名
     */
    public static PropertyName<Date> fortuneDate() {
        return new PropertyName<Date>("fortuneDate");
    }

    /**
     * birthdayのプロパティ名を返します。
     * 
     * @return birthdayのプロパティ名
     */
    public static PropertyName<Date> birthday() {
        return new PropertyName<Date>("birthday");
    }

    /**
     * omikujiCodeのプロパティ名を返します。
     * 
     * @return omikujiCodeのプロパティ名
     */
    public static PropertyName<String> omikujiCode() {
        return new PropertyName<String>("omikujiCode");
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
     * omikujiのプロパティ名を返します。
     * 
     * @return omikujiのプロパティ名
     */
    public static _OmikujiNames omikuji() {
        return new _OmikujiNames("omikuji");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _ResultNames extends PropertyName<Result> {

        /**
         * インスタンスを構築します。
         */
        public _ResultNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _ResultNames(final String name) {
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
        public _ResultNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * fortuneDateのプロパティ名を返します。
         *
         * @return fortuneDateのプロパティ名
         */
        public PropertyName<Date> fortuneDate() {
            return new PropertyName<Date>(this, "fortuneDate");
        }

        /**
         * birthdayのプロパティ名を返します。
         *
         * @return birthdayのプロパティ名
         */
        public PropertyName<Date> birthday() {
            return new PropertyName<Date>(this, "birthday");
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
         * omikujiのプロパティ名を返します。
         * 
         * @return omikujiのプロパティ名
         */
        public _OmikujiNames omikuji() {
            return new _OmikujiNames(this, "omikuji");
        }
    }
}