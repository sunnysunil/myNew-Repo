package com.example.animal.implementators;

import org.springframework.stereotype.Service;

import com.example.Demo.Animal;



@Service("cat")
public class Cat implements Animal {

	@Override
	public String  eat() {
		
		
			return "this is Cat eats";
	}

}
