package com.youtubeTools.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.youtubeTools.Model.Video;
import com.youtubeTools.Service.YouTubeService;

@Controller
@RequestMapping("/youtube")
public class YouTubeVideoController {

    @Autowired
    private YouTubeService youTubeService;

    @PostMapping("/video-details")
    public String fetchVideoDetails(@RequestParam("videoUrlOrId") String videoUrlOrId, Model model) {
        if (videoUrlOrId == null || videoUrlOrId.trim().isEmpty()) {
            model.addAttribute("error", "YouTube video URL or ID is required");
            return "video-details";
        }

        try {
            Video videoDetails = youTubeService.getVideoDetails(videoUrlOrId.trim());
            if (videoDetails == null) {
                model.addAttribute("error", "Video not found or invalid YouTube URL/ID.");
                return "video-details";
            }
            model.addAttribute("videoDetails", videoDetails);
            model.addAttribute("videoUrlOrId", videoUrlOrId);
            return "video-details";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "video-details";
        }
    }
}
