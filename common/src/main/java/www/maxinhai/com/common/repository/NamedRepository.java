package www.maxinhai.com.common.repository;

import www.maxinhai.com.common.domain.NameEntity;
import java.util.UUID;

public interface NamedRepository<T extends NameEntity> extends Repository<T, UUID> {

    /**
     *  使用对象的名字，获取对象
     * @author xinhai.ma
     * @param name 对象名称
     * @return 查询对象
     * @date 2018/8/28 10:54
     **/
    T getByName(String name);

    /**
     * 功能描述: 判断名称是否存在
     *
     * @param name 名称
     * @return boolean
     * @author xinhai.ma
     * @date 2018/10/10 13:15
     */
    boolean existsByName(String name);

}
