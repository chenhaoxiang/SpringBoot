package cn.chenhaoxiang;

import cn.chenhaoxiang.dao.PeopleDao;
import cn.chenhaoxiang.entity.People;
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

}
