package cn.chenhaoxiang.service.imp;

import cn.chenhaoxiang.dao.PeopleDao;
import cn.chenhaoxiang.entity.People;
import cn.chenhaoxiang.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2017/12/29.
 * Time: 下午 8:58.
 * Explain:
 */
@Service
public class PeopleServiceImp implements PeopleService {
    @Autowired
    private PeopleDao peopleDao;
    @Override
    @Transactional
    public int insertTwoPeople(People people, People people2) {
        peopleDao.save(people);
        int a=0;
        a = 10/a;//做回滚测试
        peopleDao.save(people2);
        return 1;
    }
}
