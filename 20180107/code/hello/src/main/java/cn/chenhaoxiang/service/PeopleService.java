package cn.chenhaoxiang.service;

import cn.chenhaoxiang.entity.People;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2017/12/29.
 * Time: 下午 8:57.
 * Explain:
 */

public interface PeopleService {
    /**
     * 测试事务回滚的
     * @param people
     * @param people2
     * @return
     */
    int insertTwoPeople(People people,People people2);

    /**
     * 统一异常处理，或者说统一数据处理
     * @param id
     * @throws Exception
     */
    void getScore(Integer id) throws Exception;

    /**
     * 根据ID查询一个people
     * @param id
     * @return
     */
    People findOne(Integer id);
}
