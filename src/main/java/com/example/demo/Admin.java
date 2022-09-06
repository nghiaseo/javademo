package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Admin implements User{
    private String name;
//    public Admin(String name){
//        this.name=name;
//    }
    public void printName(){
        System.out.println("Admin");
    }
}
