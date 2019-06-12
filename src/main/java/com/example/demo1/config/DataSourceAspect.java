//package com.example.demo1.config;
//
//import com.example.demo1.dds.DynamicDataSourceContextHolder;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
///**
// * @ClassName DataSourceAspect
// * Description TODO
// * @Author 陈恩惠
// * @Date 2019/6/12 18:03
// **/
//@Component
//@Aspect
//public class DataSourceAspect {
//
//
//    @Pointcut("execution(* com.demo.controller.OtherMessageController.*(..))")
//    public void pointcut(){
//
//    }
//
//    @Before(value = "pointcut()")
//    public void dataSourceSwitch(JoinPoint joinPoint){
//
//        DynamicDataSourceContextHolder.setDataSourceKey("dev");
//    }
//
//}
