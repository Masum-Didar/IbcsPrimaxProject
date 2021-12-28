package com.masum.IbcsPrimax.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DeptController {
	
	
	@GetMapping("/Dept")
	@ResponseBody
	public String getDept() {
		return "This Testing Depertment";
	}

}
