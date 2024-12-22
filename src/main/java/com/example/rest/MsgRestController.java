package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MsgRestController {
	
	@GetMapping
	public String getMsg() {
		return "Hi Anil you can";
	}

}
