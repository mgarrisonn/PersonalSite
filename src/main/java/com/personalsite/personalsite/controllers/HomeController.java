package com.personalsite.personalsite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String landingPage(){
        return "home";
    }

    @GetMapping("/about")
    public String aboutPage(){
        return "about";
    }

    @GetMapping("/portfolio")
    public String portfolioPage(){
        return "portfolio";
    }

//    @GetMapping("/canvas")
//    public String canvasPage(){
//        return "canvas";
//    }

}
