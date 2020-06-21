package www.maxinhai.com.common.repository;

import org.springframework.data.mongodb.core.query.Query;
import www.maxinhai.com.common.domain.Entity;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface EasywareMongoRepository<T extends Entity, ID> extends MongoRepository<T, ID> {

    /**
     * 功能描述: 根据表名创建数据
     *
     * @param collectionName mongo表名
     * @param value          对象
     * @author xinhai.ma
     * @date 2018/11/6 14:35
     */
    T insertFlexible(T value, String collectionName);

    /**
     * 功能描述: 根据表名批量创建数据
     *
     * @param collectionName mongo表名
     * @param values         对象集合
     * @author xinhai.ma
     * @date 2018/11/6 14:36
     */
    List<T> insertFlexible(List<? extends T> values, String collectionName);

    /**
     * 功能描述: 根据表名创建或更新数据
     *
     * @param collectionName mongo表名
     * @param value          对象
     * @author xinhai.ma
     * @date 2018/11/6 14:36
     */
    T saveFlexible(T value, String collectionName);

    /**
     * 功能描述: 根据表名批量创建或更新数据
     *
     * @param collectionName mongo表名
     * @param values         对象集合
     * @author xinhai.ma
     * @date 2018/11/6 14:37
     */
    List<T> saveFlexible(List<? extends T> values, String collectionName);


    /**
     * 功能描述: 根据表名删除数据
     *
     * @param collectionName mongo表名
     * @param value          对象
     * @author xinhai.ma
     * @date 2018/11/6 14:38
     */
    void deleteFlexible(T value, String collectionName);

    /**
     * 功能描述:  根据表名批量删除数据
     *
     * @param collectionName mongo表名
     * @param values         对象集合
     * @author xinhai.ma
     * @date 2018/11/6 14:38
     */
    void deleteFlexible(List<? extends T> values, String collectionName);

    /**
     * 功能描述: 根据表名+业务主键name 查询数据
     * <!>根据项目添加的查询方法，其他项目不保证可用</!>
     *
     * @param name           对象名称
     * @param collectionName mongo表名
     * @author xinhai.ma
     * @date 2018/11/6 16:55
     */
    T getFlexibleByName(String name, Class<T> tClass, String collectionName);

    /**
     * 功能描述: 根据表名+主键ID 查询数据
     *
     * @param id             表主键ID
     * @param collectionName mongo表名
     * @author xinhai.ma
     * @date 2018/11/6 16:57
     */
    T getFlexibleById(ID id, Class<T> tClass, String collectionName);

    /**
     * 功能描述: 根据条件、表名查询对象
     *
     * @param query          查询对象
     * @param tClass         对象Class
     * @param collectionName mongo表名
     * @author xinhai.ma
     * @date 2018/11/7 12:12
     */
    T getFlexibleOneByFreeParam(Query query, Class<T> tClass, String collectionName);

    /**
     * 功能描述:根据条件查询对象
     *
     * @param query  查询对象
     * @param tClass 对象Class
     * @author xinhai.ma
     * @date 2018/11/7 12:12
     */
    T getFlexibleOneByFreeParam(Query query, Class<T> tClass);

    /**
     * 功能描述: 根据条件、表名查询多个对象
     *
     * @param query          查询对象
     * @param tClass         对象Class
     * @param collectionName mongo表名
     * @author xinhai.ma
     * @date 2018/11/7 12:52
     */
    List<T> getFlexibleMultiByFreeParam(Query query, Class<T> tClass, String collectionName);

    /**
     * 功能描述:根据条件查询多个对象
     *
     * @param query  查询对象
     * @param tClass 对象Class
     * @author xinhai.ma
     * @date 2018/11/7 12:52
     */
    List<T> getFlexibleMultiByFreeParam(Query query, Class<T> tClass);

}
