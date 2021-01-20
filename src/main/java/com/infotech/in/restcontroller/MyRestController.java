package com.infotech.in.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	@GetMapping("/wel")
	public String welcome() {
		String msg = "welcome chandu velagapudi";
		String mss = "DOING PRACTICE WELL IN MICROSERVICES";
		return msg + mss;
	}
}
