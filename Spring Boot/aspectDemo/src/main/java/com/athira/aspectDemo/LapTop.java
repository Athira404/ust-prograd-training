package com.athira.aspectDemo;

import org.springframework.stereotype.Component;

@Component
public class LapTop {
    public void specs(){
        System.out.println("--------------");
        System.out.println("Laptop specs : ");
        System.out.println("\t 16 GB RAM");
        System.out.println("\t 512 GB SSD");
        System.out.println("\t Hp Brand");
        System.out.println("--------------");
    }

    public void brand(){
        System.out.println("HP");
    }

    public void ram(){
        System.out.println("Ram size is : 16 GB");
    }
}
