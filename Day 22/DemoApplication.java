package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


//Command line runner
//Application runner-->
            /*Uses:
                1.logging
                2.creating dummy data
                3.checking APIs*/
/*Micro services--> divide service into small services
Front end, Back end, Database
These may be deployed in different computers, so if there is any fault it will go and check APIs
 */
@SpringBootApplication
//public class DemoApplication implements CommandLineRunner {
public class DemoApplication implements ApplicationRunner {


    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        System.out.println(context);
        System.out.println("Demo Application started...");
    }
//Always command line runner will execute first
//    @Override
//    public void run(String... args) throws Exception{
//        System.out.println("Command line runner");
//    }

    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Application runner");
    }

}
