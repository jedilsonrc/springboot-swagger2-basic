package br.com.techjambo.springbootstudy.springbootswagger2basic.model;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class User {

	private Integer id;
	
	@Size(min=2,message="Name should have at least 2 characters")
	private String name;
	
	@Past
	private Date birthDay;

	
	public User() {
		
	}
	
	public User(Integer id, String name, Date birthDay) {
		super();
		this.id = id;
		this.name = name;
		this.birthDay = birthDay;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	
	
}
