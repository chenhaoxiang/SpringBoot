package cn.hncu.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2017/2/18.
 * Time: 下午 4:52.
 * Explain:类型安全的Bean
 */
@Component
@ConfigurationProperties(prefix = "author")
//通过locations指定properties文件的位置，这里是在application.properties文件中，可以不指定
public class AuthorSettings {
    private String name;
    private Long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
