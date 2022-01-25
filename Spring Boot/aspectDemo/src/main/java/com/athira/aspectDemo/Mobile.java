package com.athira.aspectDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
    @Autowired
    private LapTop lapTop;
    public void specs(){
        System.out.println("--------------");
        System.out.println("Mobile specs : ");
        System.out.println("\t 8GB RAM");
        System.out.println("\t 64GB ROM");
        System.out.println("\t Samsung Brand");
        System.out.println("--------------");
        lapTop.specs();
    }

    public String brand(){
        return "Samsung";
    }

    public int ram(){
        return 8;
    }
}
