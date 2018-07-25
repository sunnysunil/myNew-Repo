package com.example.MyTestignStart;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Animal;
import com.javainuse.model.Employee;

@RestController("demos")
public class DemoController {
	
	
	
	
	@Autowired 
	@Qualifier("dog")
	Animal animal;
	
	
	@RequestMapping(path="/welcome", produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public HashMap<String, String> Hello()
	{
		
		
		HashMap<String, String> map = new HashMap<>();
    map.put("k1", "value1");
    map.put("k2", "value2");
    map.put("k3", "value3");
    return map;
    
	
	
	}

	
	
	
	
	
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET,
			produces = { "application/json", "application/xml" })
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		return emp;
	}
}
