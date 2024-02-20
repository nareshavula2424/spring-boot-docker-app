package com.naresh.springbootdockerapp.controller;

import com.naresh.springbootdockerapp.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {
    @Autowired
    public ServiceImpl service;
    @PostMapping("/{name}")
     public ResponseEntity<String> getMessage(@PathVariable String name){
        return new ResponseEntity<>("Welcome " + name, HttpStatus.OK);
     }


}
