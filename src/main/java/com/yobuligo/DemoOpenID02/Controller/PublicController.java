package com.yobuligo.DemoOpenID02.Controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class PublicController {

	@GetMapping
	public String getMessage(Principal principal) {
		return "Hello from Public Controller";
	}

}
