package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserInfo {
    @Autowired
    User user;
    public void helloUser(){
        this.user.printName();
    }
}
