package com.athira.calculator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    double num1;
    double num2;
    public Calculator(@Value("${calculator.num1}") double num1,@Value("${calculator.num2}") double num2) {

        this.num1 = num1;
        this.num2 = num2;
    }
    public double add(){
        return num1+num2;

    }
    public double sub(){
        return num1-num2;

    }
    public double mul(){
        return num1*num2;

    }
    public double div(){
        return num1/num2;

    }
}