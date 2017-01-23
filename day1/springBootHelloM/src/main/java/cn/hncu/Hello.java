package cn.hncu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2017/1/22.
 * Time: 下午 5:27.
 * Explain:
 */
@RestController
public class Hello {
    @RequestMapping("/")
    String home(){
        return "你好，世界";
    }
}
