package com.mars.samplethym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SampleThymleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleThymleafApplication.class, args);
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}

}
