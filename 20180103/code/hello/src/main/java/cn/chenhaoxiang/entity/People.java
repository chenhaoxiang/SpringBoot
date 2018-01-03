package cn.chenhaoxiang.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2017/12/28.
 * Time: 下午 9:20.
 * Explain:
 */
@Entity // 实体类注解
public class People {

    @Id //主键
    @GeneratedValue //自增长
    private Integer id;

    private String name;

    private Double score;

    private String address;

    @Min(value = 18,message = "年龄必须大于18")//message为提示  20180103
    private Integer age;

    //在有的教程中说必须要写无参构造函数，经过实践证明，不写无参构造函数也是可以生成表的
//    public People() {
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
