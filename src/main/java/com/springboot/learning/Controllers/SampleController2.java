package com.springboot.learning.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/api/2")
public class SampleController2 {

    @RequestMapping(path = "/fetchUser", method = RequestMethod.GET)
    @ResponseBody
    public String getUser(){
        return "User fetched successfully";
    }
}
