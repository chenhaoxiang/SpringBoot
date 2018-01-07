package cn.chenhaoxiang.exception;

import cn.chenhaoxiang.enums.ResultEnum;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2018/1/7.
 * Time: 下午 3:18.
 * Explain:
 */
public class PeopleException extends RuntimeException {//不要继承Exception ，Spring只对你的异常是RuntimeException的才会进行事务回滚

    private Integer code;

    public PeopleException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public PeopleException(Integer code,String message) {
        super(message);//父类本身就有message
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
