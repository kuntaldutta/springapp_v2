package com.luv2code.springboot.springapp.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.springapp.model.Person;
import com.luv2code.springboot.springapp.service.PersonService;


@RestController
@RequestMapping("/v2/persons")
public class PersonController {

	
	@Autowired
	PersonService ps;
	
	
	@RequestMapping("/all")
	public Hashtable<String, Person> getAll(){
		
		return ps.getAll();
	}
	
	
	@RequestMapping("/{id}")
	public Person getPerson(@PathVariable("id") String id){
		
		return ps.getPerson(id);
	}
	
	
	
}
