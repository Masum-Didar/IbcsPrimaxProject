package com.masum.IbcsPrimax;

import java.util.Iterator;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.masum.IbcsPrimax.dao.DeptRepository;
import com.masum.IbcsPrimax.dao.EmpRepository;
import com.masum.IbcsPrimax.entities.Dept;
import com.masum.IbcsPrimax.entities.Emp;

@SpringBootApplication
public class IbcsPrimaxProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(IbcsPrimaxProjectApplication.class, args);
		
		EmpRepository empRepository = context.getBean(EmpRepository.class);
		DeptRepository deptRepository = context.getBean(DeptRepository.class);
		
		
		//CREAT Table
		
//		Emp emp = new Emp();
//		
//		emp.setName("Monir");
//		emp.setCode(123);
//		emp.setDob("08/02/1997");
//		emp.setGender("Male");
//		emp.setMobile("01794708794");
//		emp.setDept(null);
//		
//		Emp emp0 = empRepository.save(emp);
//		System.out.println(emp0);

		
		//CREAT Dept Table
//		Dept dept = new Dept();
//		dept.setId(01);
//		dept.setName("Developer Team");
//		dept.setActive("Active");
//		
//		Dept dept1 = deptRepository.save(dept);
//		System.out.println(dept1);
		
//		Emp emp1 = new Emp();
//		
//		emp1.setName("Tayab");
//		emp1.setCode(56);
//		emp1.setDob("08/06/1997");
//		emp1.setGender("Male");
//		emp1.setMobile("01794708750");
//		
//		
//		Emp emp3 = empRepository.save(emp1);
//		System.out.println(emp3);
		
		
	
		
		//UPDATE user by emp Id
		
//		Optional<Emp> optional = empRepository.findById(3);
//		
//		Emp emp = optional.get();
//		System.out.println(emp);
//		emp.setName("Irfan");
//		emp.setCode(675);
//		emp.setMobile("01934567654");
//		Emp result = empRepository.save(emp);
//		System.out.println(result);
//		
		
		
		
		
		//GET All Data
		
//		Iterable<Emp> itr = empRepository.findAll();
		
//		Iterator<Emp> iterator = itr.iterator();
//		
//		while(iterator.hasNext()) {
//			Emp emp = iterator.next();
//			System.out.println(emp);
//		}
		
//		itr.forEach(emp1->{System.out.println(emp1);});
	
		
		//Delete Operation
//		empRepository.deleteById(5);
//		System.out.println("Deleted");
//	
//		itr.forEach(emp->{System.out.println(emp);});
		
		
	}

}



























