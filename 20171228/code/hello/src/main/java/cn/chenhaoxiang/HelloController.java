package cn.chenhaoxiang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2017/12/25.
 * Time: 下午 9:44.
 * Explain:
 */
@RestController
public class HelloController {
    @Autowired
    private People people;
    @RequestMapping(value = {"/people","people2"},method = RequestMethod.GET)
    public People people() {//返回的是对象的JSON字符串
        return people;
    }

    @GetMapping(value = "/getId/{id}")
    public Integer getId(@PathVariable(value = "id")Integer ida) {
        return ida;
    }

    @GetMapping(value = "/getName")
    public String getName(@RequestParam(value = "name")String nameStr) {
        return nameStr;
    }

    @GetMapping(value = "/getNameStr")
    public String getNameStr(String nameStr) {//url传进来的参数需要和变量名对应上
        return nameStr;
    }

    /**
     * @RequestParam
     * required-false  表示不是必须传的
     * defaultValue  这个就是参数的默认值，但是注意，这里的值必须是字符串
     * @param nameStr
     * @return
     */
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "name",required = false,defaultValue = "0") String nameStr) {
        return nameStr;
    }

}
