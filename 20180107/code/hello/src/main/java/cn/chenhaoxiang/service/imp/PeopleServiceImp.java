package cn.chenhaoxiang.service.imp;

import cn.chenhaoxiang.dao.PeopleDao;
import cn.chenhaoxiang.entity.People;
import cn.chenhaoxiang.enums.ResultEnum;
import cn.chenhaoxiang.exception.PeopleException;
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

    /**
     * 往往业务有点复杂，不能直接返回String，比如在这里
     * @param id
     */
    @Override
    public void getScore(Integer id) throws Exception {
        People people = peopleDao.findOne(id);
        Double score = people.getScore();
        if(score<60){
            //返回 "不及格"
            throw new PeopleException(ResultEnum.FLUNK);
        }else if(score>=60 && score<80 ){
            //返回 "良好"
            throw new PeopleException(ResultEnum.WELL);
        }
        //前面的只是作为校验，也就是条件，条件满足后才有后面的操作
        //如果分数大于80，则给他进行另外的操作,这个时候就不好返回字符串了

        //有的可能用数字来标志，返回1，2，3等等，然后在Controller再判断，这样是可以达到效果，但是代码写起来很别扭，在service中判断一次，controller还需要再判断一次
        // 而且返回1，2，3都是自己标记的，假如这个标志多了呢，是不是很麻烦
        //这个时候，统一异常处理就派上用处了
    }

    @Override
    public People findOne(Integer id) {
        return peopleDao.findOne(id);
    }


}
