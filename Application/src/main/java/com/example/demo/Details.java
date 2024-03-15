package com.example.demo;

import org.springframework.boot.autoconfigure.AutoConfiguration;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AutoConfiguration
@Entity
@Table(name="Human")
public class Details {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long ID;
	
	@Column(name = "nameof_person",nullable = false)
	private String name;
	
	@Column(name = "Email",nullable = false)
	private String email;
	
	@Column(name = "Age",nullable = false)
	private String age;
	
	@Column(name = "dateof_birth",nullable = false)
	private String dob;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	

}
