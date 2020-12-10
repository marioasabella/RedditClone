package com.example.RedditCloneSpringBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class RedditCloneSpringBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedditCloneSpringBackendApplication.class, args);
	}

}
