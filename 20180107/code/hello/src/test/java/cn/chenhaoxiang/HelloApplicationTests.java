package cn.chenhaoxiang;

import cn.chenhaoxiang.dao.PeopleDao;
import cn.chenhaoxiang.entity.People;
import cn.chenhaoxiang.service.PeopleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloApplicationTests {

	@Autowired
	private PeopleDao peopleDao;
	@Test
	public void contextLoads() {
		People people = new People();
		people.setAddress("中国");
		people.setName("陈浩翔");
		peopleDao.save(people);
	}

	@Autowired
	private PeopleService peopleService;
	@Test
	public void insertTwoPeople() {
		People people = new People();
		people.setAddress("中国1");
		people.setName("陈浩翔1");

		People people2 = new People();
		people2.setAddress("中国2");
		people2.setName("陈浩翔2");
		try {
			peopleService.insertTwoPeople(people,people2);
			System.out.println("插入成功...");
		} catch (Exception e) {
			System.out.println("插入失败；异常信息:"+e.getMessage());
		}
	}


}
