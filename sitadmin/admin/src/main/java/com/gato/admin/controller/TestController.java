package com.gato.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Andy on 2017/8/4.
 */
@RestController
public class TestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test(){
        return "helloword";
    }
}
