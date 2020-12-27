package com.theavgtechie.myclicks.MyClicks.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    // User Registration Methods
    @RequestMapping("/registration")
    public String userRegistration(Model model){

        return "create-account";
    }

    @RequestMapping("/cancelRegistration")
    public String cancelRegistration(){

        return "redirect:/";
    }

    // Forgot Password Methods
    @RequestMapping("/forgotPassword")
    public String forgotPassword(Model model){

        return "forgot-password";
    }

    @RequestMapping("/cancelForgotPassword")
    public String cancelfForgotPassword(Model model){

        return "redirect:/";
    }




}
