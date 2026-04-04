package com.youtubeTools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YoutubeToolsApplication {

	public static void main(String[] args) {
		
	 SpringApplication.run(YoutubeToolsApplication.class, args);

		System.out.println("project Started succesfully");
		System.out.println(System.getenv("YOUTUBE_API_KEY"));
	}

}
