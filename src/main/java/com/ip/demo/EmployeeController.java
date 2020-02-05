package com.ip.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ip.model.Employe;

@RestController
public class EmployeeController {

	@RequestMapping("/")
	public List<Employe> findAll(){
		List<Employe> list = new ArrayList<Employe>();
		list.add(new Employe(111,"anubhav","sahoo","abc@gmail.com"));
		return list;
		
		
	}
}
