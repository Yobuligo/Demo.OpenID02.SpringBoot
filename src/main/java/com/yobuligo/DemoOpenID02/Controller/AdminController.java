package com.yobuligo.DemoOpenID02.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/admin")
@RestController
public class AdminController {
	
	@PreAuthorize("hasRole('ADMIN')")
	//@RequestMapping("/anything")	
	public String getAnything() {
		return "Anything";
	}

}
