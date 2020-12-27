package com.theavgtechie.myclicks.MyClicks.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Welcome {

    @RequestMapping("/")
    public String welcome(){

        return "welcome-login";
    }
}
