package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Emp implements User{
    private String name;
//    public Emp(String name){
//        this.name = name;
//    }
    public void printName(){
        System.out.println("Emp :");
    }
}
