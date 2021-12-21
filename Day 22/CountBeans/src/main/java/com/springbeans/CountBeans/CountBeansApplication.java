package com.springbeans.CountBeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class CountBeansApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CountBeansApplication.class, args);
		for(String beans : context.getBeanDefinitionNames()){
			System.out.println("Bean Definition Name : " + beans);
		}
		System.out.println("Bean Count : " + context.getBeanDefinitionCount());
    }
}
