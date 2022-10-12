package com.emonics.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class Student {
	
	private Integer id;
	 @NotBlank(message = "student name cannot be empty")
	private String name;
	 @Min(value=0,message = "Age cannot be negative")
	private Integer age;
	
	
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	

}
