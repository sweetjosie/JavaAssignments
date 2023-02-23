package com.daikichi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
// source tab organize imports or cntl shift o to import files needed
// annotation that handles http requests
@RequestMapping("/daikichi")
// must be put above any method handling url as in "route"
// adding something after slash make "extensions" of this route
public class DaikichiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiApplication.class, args);
	}

	@RequestMapping("")
	public String Index() {
		return "Welcome!";
	}

	@RequestMapping("today")
	public String TodayLuck() {
		return "Today you will find luck in your endeavors!";
	}

	@RequestMapping("today")
	public String TomorrowLuck() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
}
