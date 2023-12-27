package training6.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static training6.entity.ResultNames.*;

/**
 * {@link Result}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2023/12/27 13:16:55")
public class ResultTest extends S2TestCase {

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
     * 全件取得をテストします。
     * 
     * @throws Exception
     */
    public void testFindAll() throws Exception {
        jdbcManager.from(Result.class).getResultList();
    }
}