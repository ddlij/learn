package com.ddlij.learn.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearnTestController {

    @RequestMapping(value = "/hello.json" , method= RequestMethod.GET)
    public String firstLearn(){
        return "learn/hello.jsp";
    }
}
