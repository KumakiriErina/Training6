package training6.service;

import java.util.List;
import javax.annotation.Generated;
import training6.entity.MstUnsei;

import static org.seasar.extension.jdbc.operation.Operations.*;
import static training6.entity.MstUnseiNames.*;

/**
 * {@link MstUnsei}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2023/12/27 13:16:54")
public class MstUnseiService extends AbstractService<MstUnsei> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param unseiCode
     *            識別子
     * @return エンティティ
     */
    public MstUnsei findById(String unseiCode) {
        return select().id(unseiCode).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<MstUnsei> findAllOrderById() {
        return select().orderBy(asc(unseiCode())).getResultList();
    }
}