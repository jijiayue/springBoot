package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jijiayue on 2018/12/6.
 */
@RestController
public class TestController {

    @RequestMapping("/home")
    @ResponseBody
    public ModelAndView hellWord(){
        ModelAndView mode = new ModelAndView();
        mode.addObject("name", "zhangsan");
        mode.setViewName("index.html");
        return mode;
    }
}
