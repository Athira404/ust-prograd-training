package com.athira.aspectDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AspectDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AspectDemoApplication.class, args);
        Mobile mobile = context.getBean(Mobile.class);
        LapTop lapTop = context.getBean(LapTop.class);
        mobile.specs();
        lapTop.brand();
//        System.out.println("HP");
        lapTop.ram();

    }

}
