package com.masum.IbcsPrimax.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.masum.IbcsPrimax.Services.EmpServices;
import com.masum.IbcsPrimax.dao.DeptRepository;
import com.masum.IbcsPrimax.dao.EmpRepository;
import com.masum.IbcsPrimax.entities.Dept;
import com.masum.IbcsPrimax.entities.Emp;

@Controller
public class ProjectController {
	
	@Autowired
	private EmpRepository empRepository;
	
	@Autowired
	private DeptRepository deptRepository;
	
//	@GetMapping("/Emp")
//	@ResponseBody
//	public String Testing() {
//		
//		Emp emp = new Emp();
//		emp.setName("Tarek");
//		emp.setCode(9999);
//		emp.setDob("09/07/1987");
//		emp.setGender("Male");
//		emp.setMobile("01794458794");
//		
//		Dept dept = new Dept();
//		emp.setDept(dept);
//		
//		empRepository.save(emp);
//		
//		return "Project is Working now";
//	}
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("title", "This home page");
		return "home";
	}
	@RequestMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "This about page");
		return "about";
	}
	
	@RequestMapping("/addEmp")
	public String addEmp(Model model) {
		model.addAttribute("title", "Adding an Employee");
		model.addAttribute("emp", new Emp());
		return "addEmp";
	}
	
	@RequestMapping(value = "/do_addEmp", method=RequestMethod.POST)
	public String addEmployee(@ModelAttribute ("emp") Emp emp, Model model) {
//		model.addAttribute("title", "Adding an Employee");
		empRepository.save(emp);
		System.out.println("Emp "+emp);
		
		return "addEmp";
	}
	
	@RequestMapping("/addDept")
	public String addDept(Model model) {
		model.addAttribute("title", "Adding a Department");
		model.addAttribute("dept", new Dept());
		return "addDept";
	}
	
	@RequestMapping(value = "/do_addDept", method=RequestMethod.POST)
	public String do_addDept(@ModelAttribute("dept") Dept dept, Model model) {
		
		dept.setActive(true);
		deptRepository.save(dept);
		System.out.println("Dept "+dept);
		model.addAttribute("title", "Adding an Employee");
		return "addDept";
	}
	
}
