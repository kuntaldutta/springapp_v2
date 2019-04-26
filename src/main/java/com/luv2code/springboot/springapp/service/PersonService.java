package com.luv2code.springboot.springapp.service;

import java.util.Hashtable;

import org.springframework.stereotype.Component;

import com.luv2code.springboot.springapp.model.Person;


@Component
public class PersonService {
	
	
	Hashtable<String, Person> persons = new Hashtable<String, Person>();
	
	public PersonService() {
		
		Person p = new Person();
		
		p.setId("1");
		p.setAge(21);
		p.setFirstName("Rahul");
		p.setLastName("Dravid");
		persons.put("1", p);
		
        Person p1 = new Person();
		
		p1.setId("2");
		p1.setAge(24);
		p1.setFirstName("Sachin");
		p1.setLastName("Tendulkar");
		persons.put("2", p1);
	}
	
	
	public Person getPerson(String id){
		
		if(persons.containsKey(id))
			return persons.get(id);
		else
			return null;
		}
	
	public Hashtable<String, Person> getAll(){
		
        return persons;
	}

}
