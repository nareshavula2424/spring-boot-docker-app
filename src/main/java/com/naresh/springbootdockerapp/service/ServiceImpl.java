package com.naresh.springbootdockerapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ServiceImpl implements  Message {
    @Autowired
    public Message message;


    @Override
    public String getMessage(String name) {
        return message.getMessage(name);
    }
}
