package com.ddlij.learn.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LearnTestPageController {
    @RequestMapping(value = "/hello1.web" , method= RequestMethod.GET)
    public String firstLearn(HttpServletRequest request, HttpServletResponse response, Model model){
        return "learn/hello";
    }
}
