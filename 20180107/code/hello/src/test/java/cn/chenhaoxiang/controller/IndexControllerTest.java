package cn.chenhaoxiang.controller;

import cn.chenhaoxiang.entity.People;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2018/1/7.
 * Time: 下午 4:09.
 * Explain:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc //Controller测试的，需要是用这个注解
public class IndexControllerTest {
//    @Autowired
//    private IndexController indexController;
//    @Test
//    public void getPeople1() throws Exception {
//        indexController.getPeople();//这样只是对方法进行了测试
//        //我们想用url进行测试，而且可以进行post或者get方法
//    }
    @Autowired
    private MockMvc mvc;
    @Test
    public void getPeople() throws Exception {
        ResultActions resultActions = mvc.perform(MockMvcRequestBuilders.get("/peoples"))//如果是post，就是调用post方法
                .andExpect(MockMvcResultMatchers.status().isOk());//对返回的状态码进行判断,这个isOK是200
//        .andExpect(MockMvcResultMatchers.content().string("a"))//对返回值进行判断

        MvcResult mvcResult = resultActions.andReturn();
        String result = mvcResult.getResponse().getContentAsString();
        System.out.println("客户端获得反馈数据:" + result);
    }
    //当进行打包的时候，会运行所有的单元测试方法，如果有失败，就会出现打包失败

    //如果打包的时候希望跳过单元测试，则打包命令为
    // mvn clean package -Damven.test.skip=true

    /**
     * post测试，并带参数
     * @throws Exception
     */
    @Test
    public void peopleEdit() throws Exception {
        //发送请求
        ResultActions resultActions = mvc.perform(MockMvcRequestBuilders.post("/edit").param("id","6")
                .param("name","测试Controller")
                .param("score","20.00")
                .param("age","29"))//如果是post，就是调用post方法
                .andExpect(MockMvcResultMatchers.status().isOk());//对返回的状态码进行判断
        MvcResult mvcResult = resultActions.andReturn();
        String result = mvcResult.getResponse().getContentAsString();
        System.out.println("客户端获得反馈数据:" + result);
    }

}