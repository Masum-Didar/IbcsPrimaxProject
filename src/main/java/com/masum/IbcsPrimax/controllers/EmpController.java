package com.masum.IbcsPrimax.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.masum.IbcsPrimax.Services.EmpServices;
import com.masum.IbcsPrimax.dao.EmpRepository;
import com.masum.IbcsPrimax.entities.Emp;

@Controller
public class EmpController {
	
	
	@GetMapping("/Emp")
	@ResponseBody
	public Emp getEmp() {
		
		Emp emp = new Emp();
		emp.setName("Monir");
		emp.setCode(123);
		emp.setDob("08/02/1997");
		emp.setGender("Male");
		emp.setMobile("01794708794");
		
		
		return emp;
	}
	
	
}
