package com.masum.IbcsPrimax.entities;


import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Dept {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String Name;
	private String Active;
	
	@OneToMany(mappedBy = "dept")
	private List<Emp> emp;

	

	public Dept(int id, String name, String active, List<Emp> emp) {
		super();
		Id = id;
		Name = name;
		Active = active;
		this.emp = emp;
	}

	public Dept(int id, String name, String active) {
		super();
		Id = id;
		Name = name;
		Active = active;
	}

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getActive() {
		return Active;
	}

	public void setActive(String active) {
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
