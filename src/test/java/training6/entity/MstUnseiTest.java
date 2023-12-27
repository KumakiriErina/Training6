package training6.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static training6.entity.MstUnseiNames.*;

/**
 * {@link MstUnsei}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2023/12/27 13:16:55")
public class MstUnseiTest extends S2TestCase {

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
        jdbcManager.from(MstUnsei.class).id("aaa").getSingleResult();
    }

    /**
     * omikujiListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_omikujiList() throws Exception {
        jdbcManager.from(MstUnsei.class).leftOuterJoin(omikujiList()).id("aaa").getSingleResult();
    }
}