package www.maxinhai.com.common.repository;

import www.maxinhai.com.common.domain.Entity;
import java.util.UUID;

public interface Repository <T extends Entity,ID> extends EasywareMongoRepository<T,ID> {

    /**
     *
     * 功能描述: ID查询
     *
     * @param id 主键ID
     * @return 对象
     * @author 陈理明
     * @date 2018/10/29 11:13
     */
    T getById(UUID id);

}
