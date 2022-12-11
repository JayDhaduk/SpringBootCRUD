package com.springboot.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student_info")
public class Student {

	@Id
	@GeneratedValue
	private Long s_id;
	private String s_name;
	private String s_email;
	private String s_cource;
	private Integer s_age;
	private String s_gender;
}