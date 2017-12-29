package cn.chenhaoxiang.controller;

import cn.chenhaoxiang.dao.PeopleDao;
import cn.chenhaoxiang.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2017/12/28.
 * Time: 下午 9:20.
 * Explain:
 */
@RestController
public class IndexController {

    @Autowired
    private PeopleDao peopleDao;//因为逻辑相对简单，直接在Controller调用dao了，实际开发中请勿这样

    /**
     * 获取所有的人的数据
     * @return
     */
    @GetMapping(value = "/peoples")
    public List<People> getPeople(){
        return peopleDao.findAll();//一句SQL都没写，很方便
    }

    /**
     * 新增一个对象
     * @param people
     * @return
     */
    @PostMapping(value = "/add")
    public People peopleAdd(People people){
        //@RequestParam(value = "people")  直接传类的时候，建议不要使用RequestParam注解
        //当然，你可以选择每一个参数都写上，但没必要，更多的时候是直接传类对象，注意url的参数名和类中属性名对上
        return peopleDao.save(people);
    }

    /**
     * 更新对象
     * @param people
     * @return
     */
    @PostMapping(value = "/edit")
    public People peopleEdit(People people){
        //注意，修改就必须带上ID了，也就是主键。save方法会根据有没有主键来判断是修改还是新增
        //更新需要带上全部参数，否则没有值的参数会赋值为NULL
        return peopleDao.save(people);
    }

    /**
     * 查询对象
     * @param id  根据ID
     * @return
     */
    @GetMapping(value = "/select/{id}")
    public People select(@PathVariable("id") Integer id){
        return peopleDao.findOne(id);//没查到的时候，返回null  在前台接收的是空
    }

    /**
     * 删除对象
     * @param id  根据ID
     * @return
     */
    @GetMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        peopleDao.delete(id);//删除的返回是空...
    }

    /**
     * 根据名字查询People
     * @param name
     * @return
     */
    @PostMapping(value = "/selectByName")
    public List<People> selectByName(@RequestParam("name") String name){
        return peopleDao.findByName(name);
    }

    /**
     * 根据名字和年龄查询People
     * @param name
     * @return
     */
    @PostMapping(value = "/selectByNameAndAge")
    public List<People> selectByNameAndAge(String name,Integer age){
        return peopleDao.findByNameAndAge(name,age);
    }

    /**
     * 根据名字和地址查询People
     * @param name
     * @return
     */
    @PostMapping(value = "/selectByNameAndAddress")
    public List<People> selectByNameAnAddress(String name,String address){
        return peopleDao.findByNameAndAddress(name,address);
    }



}
