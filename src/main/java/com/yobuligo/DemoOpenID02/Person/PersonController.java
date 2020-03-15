package com.yobuligo.DemoOpenID02.Person;

import java.util.ArrayList;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonController {

	@PreAuthorize("hasRole('USER')")
	@RequestMapping("/person")
	public Person getPersons() {
		Person person = new Person();
		person.setFirstname("Max");
		person.setLastname("Müller");
		return person;
	}
}
