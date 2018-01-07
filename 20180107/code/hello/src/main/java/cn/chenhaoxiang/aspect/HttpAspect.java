package cn.chenhaoxiang.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2018/1/3.
 * Time: 下午 10:10.
 * Explain:
 */
@Aspect
@Component
public class HttpAspect {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);//使用org.slf4j.Logger,
    /**
     * 定义切面
     */
    @Pointcut("execution(public * cn.chenhaoxiang.controller.IndexController.*(..))")
    public void httpLog(){
    }
    /**
     * 在方法执行之前执行
     */
//    @Before("execution(public * cn.chenhaoxiang.controller.IndexController.*(..))")//*在这里表示匹配所有的方法， (..) 表示任意参数，包含没有参数的
    @Before("httpLog()")
    public void before(JoinPoint joinPoint){
        logger.info("before");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //url
        logger.info("url={}",request.getRequestURI());//会把request.getRequestURI()的值赋值到{}中去
        //method  请求方式
        logger.info("method={}",request.getMethod());
        //ip
        logger.info("ip={}",request.getRemoteAddr());
        //请求的类方法
        logger.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        //参数
        logger.info("args={}",joinPoint.getArgs());
    }

//    @After("execution(public * cn.chenhaoxiang.controller.IndexController.*(..))")//这个和上面的Before里面的值重复了，我们可以换种方式来实现
    @After("httpLog()")
    public void after(){
        logger.info("after");
    }


    @AfterReturning(returning = "object",pointcut = "httpLog()")
    public void afterReturning(Object object){//object为方法返回的参数
        logger.info("response={}",object);//toString，不然输出的对象会是地址
        //最好是不写object.toString(),直接输出object，这样的话，就不用担心object空指针了。
    }

}
