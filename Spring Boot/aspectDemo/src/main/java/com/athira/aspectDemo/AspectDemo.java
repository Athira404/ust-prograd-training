package com.athira.aspectDemo;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectDemo {

    @Pointcut("execution(public * specs(..))")
    public void specs(){}

    @Before("specs()")
    public void instruction(){
        System.out.println("See specs before buy");
    }

    @After("specs()")
    public void afterSpecs(){
        System.out.println("Specs varies...");
    }

    @After("execution(public * brand(..))")
    public void message(){
        System.out.println("after specs");
    }

    @Around("execution(public * ram())")
    public void aroundLog(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("What's the ram size?");
        proceedingJoinPoint.proceed();
        System.out.println("Ram size varies ");
    }
}
