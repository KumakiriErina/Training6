package training6.entity;

import java.util.Date;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;
import training6.entity.OmikujiNames._OmikujiNames;

/**
 * {@link MstUnsei}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2023/12/27 13:16:50")
public class MstUnseiNames {

    /**
     * unseiCodeのプロパティ名を返します。
     * 
     * @return unseiCodeのプロパティ名
     */
    public static PropertyName<String> unseiCode() {
        return new PropertyName<String>("unseiCode");
    }

    /**
     * unseiNameのプロパティ名を返します。
     * 
     * @return unseiNameのプロパティ名
     */
    public static PropertyName<String> unseiName() {
        return new PropertyName<String>("unseiName");
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
     * omikujiListのプロパティ名を返します。
     * 
     * @return omikujiListのプロパティ名
     */
    public static _OmikujiNames omikujiList() {
        return new _OmikujiNames("omikujiList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _MstUnseiNames extends PropertyName<MstUnsei> {

        /**
         * インスタンスを構築します。
         */
        public _MstUnseiNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _MstUnseiNames(final String name) {
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
        public _MstUnseiNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
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
         * unseiNameのプロパティ名を返します。
         *
         * @return unseiNameのプロパティ名
         */
        public PropertyName<String> unseiName() {
            return new PropertyName<String>(this, "unseiName");
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
         * omikujiListのプロパティ名を返します。
         * 
         * @return omikujiListのプロパティ名
         */
        public _OmikujiNames omikujiList() {
            return new _OmikujiNames(this, "omikujiList");
        }
    }
}