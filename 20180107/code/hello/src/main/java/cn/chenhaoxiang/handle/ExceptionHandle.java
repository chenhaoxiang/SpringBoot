package cn.chenhaoxiang.handle;

import cn.chenhaoxiang.common.entity.Result;
import cn.chenhaoxiang.enums.ResultEnum;
import cn.chenhaoxiang.exception.PeopleException;
import cn.chenhaoxiang.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2018/1/7.
 * Time: 下午 3:13.
 * Explain:异常捕获  统一异常返回格式
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)//声明需要捕获的异常类 - 写成PeopleException，就是只会捕获PeopleException异常了
    @ResponseBody //由于返回浏览器那边是json格式，就需要这个
    public Result handle(Exception e){
        if(e instanceof PeopleException){
            PeopleException peopleException = (PeopleException) e;
            return ResultUtil.error(peopleException.getCode(),peopleException.getMessage());
        }else {
            logger.error("[系统异常]-{}",e);
            return ResultUtil.error(ResultEnum.UNKONW_ERROR);
        }
    }
}
