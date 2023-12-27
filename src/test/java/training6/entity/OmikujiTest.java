package training6.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static training6.entity.OmikujiNames.*;

/**
 * {@link Omikuji}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2023/12/27 13:16:55")
public class OmikujiTest extends S2TestCase {

    private JdbcManager jdbcManager;

    /**
     * 事前処理をします。
     * 
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("s2jdbc.dicon");
    }

    /**
     * 識別子による取得をテストします。
     * 
     * @throws Exception
     */
    public void testFindById() throws Exception {
        jdbcManager.from(Omikuji.class).id("aaa").getSingleResult();
    }

    /**
     * mstUnseiとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_mstUnsei() throws Exception {
        jdbcManager.from(Omikuji.class).leftOuterJoin(mstUnsei()).id("aaa").getSingleResult();
    }

    /**
     * resultListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_resultList() throws Exception {
        jdbcManager.from(Omikuji.class).leftOuterJoin(resultList()).id("aaa").getSingleResult();
    }
}