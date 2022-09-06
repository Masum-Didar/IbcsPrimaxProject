package com.masum.IbcsPrimax.entities;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "Department")
public class Dept {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String Name;
	private Boolean Active;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "dept")
	private List<Emp> emp = new ArrayList<>();

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dept(int id, String name, Boolean active, List<Emp> emp) {
		super();
		Id = id;
		Name = name;
		Active = active;
		this.emp = emp;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Boolean getActive() {
		return Active;
	}

	public void setActive(Boolean active) {
		Active = active;
	}

	public List<Emp> getEmp() {
		return emp;
	}

	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Dept [Id=" + Id + ", Name=" + Name + ", Active=" + Active + ", emp=" + emp + "]";
	}

	

	
	

}
