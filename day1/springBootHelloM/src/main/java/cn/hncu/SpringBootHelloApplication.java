package cn.hncu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2017/1/22.
 * Time: 下午 5:25.
 * Explain:
 */
@SpringBootApplication//标注它是一个Spring Boot应用，main方法使它成为一个主程序。在应用启动时被执行！
public class SpringBootHelloApplication {
    public static void main(String[] args) {
        //SpringBootHelloApplication 这个位置必须为标志了@SpringBootApplication的类的类名
        SpringApplication.run(SpringBootHelloApplication.class,args);
    }
}
