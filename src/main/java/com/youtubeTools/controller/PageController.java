package com.youtubeTools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping({"/","home"})
    public String home() {
        return "home"; // loads templates/home.html
    }

    @GetMapping("/video-details")
    public String videoDetails(){
        return "video-details";
    }
    
}