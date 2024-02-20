package com.naresh.springbootdockerapp.service;

import org.springframework.stereotype.Service;

@Service
public interface Message {

     String getMessage(String name);
}
