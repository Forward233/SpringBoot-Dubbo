package com.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dubbo.service.CityDubboConsumerService;

/**
 * Created by Jaycekon on 2017/9/19.
 */
@RestController
public class UserController {

    @Autowired
    private CityDubboConsumerService service;


    @RequestMapping("/save")
    public Object saveUser() {

        return service.saveUser();
    }
}
