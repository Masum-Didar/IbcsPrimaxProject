package com.masum.IbcsPrimax.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.masum.IbcsPrimax.entities.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer> {
	

}
