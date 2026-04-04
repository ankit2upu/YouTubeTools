package com.youtubeTools.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.youtubeTools.Model.SearchVideo;
import com.youtubeTools.Service.YouTubeService;



@Controller
@RequestMapping("/youtube")
public class YouTubeTagController{
     @Autowired
    private YouTubeService youTubeService;

    @Value("${youtube.api.key}")
     private String apiKey;

    private boolean isApiKeyConfigured(){
        return apiKey!=null && !apiKey.trim().isEmpty();

        //  return apiKey!=null && !apiKey.isEmpty();
       

    }


   @PostMapping("/search")
    public String videoTage(@RequestParam("videoTitle") String videoTitle,Model model) {

      if(!isApiKeyConfigured()){
        model.addAttribute("error","Api key is not configured");
        return "home";
      }

        if(videoTitle == null || videoTitle.trim().isEmpty()) {
            model.addAttribute("error","Youtube video title is required");
            return "home";
        }

       try {
            SearchVideo result=youTubeService.searchVideos (videoTitle);
            model.addAttribute("primaryVideo",result.getPrimaryVideo());
            model.addAttribute("relatedVideos",result.getRelatedVideos());
            return "home";

        } catch(Exception e){
                  model.addAttribute("error",e.getMessage());
                 
                      return "home";        
            }

          
        
          }
    

}

