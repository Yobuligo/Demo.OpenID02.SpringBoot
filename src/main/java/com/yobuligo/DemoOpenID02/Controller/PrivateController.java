package com.yobuligo.DemoOpenID02.Controller;

import java.security.Principal;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/private")
public class PrivateController {
	
	@PreAuthorize("hasRole('USER')")
	@GetMapping
	public String getMessage(Principal principal) {
		return "Hello from Private Controller";
	}
}
