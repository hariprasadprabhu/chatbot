package com.chatbot.controller;

import com.chatbot.UserService;
import com.chatbot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatBot {

    @Autowired
    private UserService service;
    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public String Status(){
        return "success";
    }
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String AddUser(){
        User user = new User(1,"Hari","hari@gmail.com");
        service.saveUser(user);
        return "success";
    }
}
