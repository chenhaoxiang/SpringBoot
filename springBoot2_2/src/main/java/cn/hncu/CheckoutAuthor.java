package cn.hncu;

import cn.hncu.model.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2017/2/18.
 * Time: 下午 4:59.
 * Explain:检验代码类 - 类型安全的配置
 */
@RestController
public class CheckoutAuthor {
    @Autowired //直接注入该配置
    private AuthorSettings authorSettings;

    @RequestMapping("/author")
    public String index2(){
        return "author name is "+ authorSettings.getName() +" and author age is "+authorSettings.getAge();
    }

}
