package com.test.gitmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GitMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitMavenApplication.class, args);
	}

	@RestController
	public static class HelloController {
		@RequestMapping({"", "/", "hello"})
		public String hello() {
			return "hello world";
		}

	}
}
