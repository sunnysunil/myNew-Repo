package com.example.animal.implementators;

import org.springframework.stereotype.Service;

import com.example.Demo.Animal;



@Service("dog")
public class Dog implements Animal {

	@Override
	public String eat() {

	return "this is DOg eats";
	
	}

}
