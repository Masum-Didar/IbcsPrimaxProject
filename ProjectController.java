package com.masum.IbcsPrimax.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.masum.IbcsPrimax.Services.EmpServices;
import com.masum.IbcsPrimax.dao.EmpRepository;
import com.masum.IbcsPrimax.entities.Dept;
import com.masum.IbcsPrimax.entities.Emp;

@Controller
public class ProjectController {
	
	@Autowired
	private EmpRepository empRepository;
	
	@GetMapping("/Emp")
	@ResponseBody
	public String Testing() {
		
		Emp emp = new Emp();
		emp.setName("Robin");
		emp.setCode(5647);
		emp.setDob("09/07/1987");
		emp.setGender("Male");
		emp.setMobile("01794458794");
		
		Dept dept = new Dept();
		emp.setDept(dept);
		
		empRepository.save(emp);
		
		return "Project is Working now";
	}
	
	
}
