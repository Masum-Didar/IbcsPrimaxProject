package com.masum.IbcsPrimax.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "Employee")
public class Emp {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	
	@Column(unique = true, length = 4)
	private int Code;
	
	//@NotNull
    //@Size(min = 3, max = 35)
	@NonNull
	private String Name;
	
	private String Dob;
	
	private String Gender;
	
	@Column(length = 14)
	private String Mobile;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Dept dept;
	
	
	

	public Emp(int id, int code, String name, String dob, String gender, String mobile, Dept dept) {
		super();
		Id = id;
		Code = code;
		Name = name;
		Dob = dob;
		Gender = gender;
		Mobile = mobile;
		this.dept = dept;
	}

	public Emp(int id, int code, String name, String dob, String gender, String mobile) {
		super();
		Id = id;
		Code = code;
		Name = name;
		Dob = dob;
		Gender = gender;
		Mobile = mobile;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getCode() {
		return Code;
	}

	public void setCode(int code) {
		Code = code;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		Dob = dob;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp [Id=" + Id + ", Code=" + Code + ", Name=" + Name + ", Dob=" + Dob + ", Gender=" + Gender
				+ ", Mobile=" + Mobile + ", dept=" + dept + "]";
	}

	
	

}
