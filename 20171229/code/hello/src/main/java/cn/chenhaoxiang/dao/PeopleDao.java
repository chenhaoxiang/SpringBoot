package cn.chenhaoxiang.dao;

import cn.chenhaoxiang.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2017/12/28.
 * Time: 下午 10:44.
 * Explain:
 */
public interface PeopleDao extends JpaRepository<People,Integer>{//实体类，id的类型

    /**
     * 根据名字查询
     * @param name
     * @return
     */
    List<People> findByName(String name);

    /**
     * 根据名字和年龄查询
     * @param name
     * @return
     */
    List<People> findByNameAndAge(String name,Integer age);
    /**
     * 根据名字和地址查询
     * @param name
     * @return
     */
    List<People> findByNameAndAddress(String name,String address);
    //可以看出来，这个写查询有规律的

}
