package com.springboot.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crud.entity.Student;
import com.springboot.crud.repository.StudentRepo;


@Service
public class StudentService{

	@Autowired
	private StudentRepo repository;

	// -------------------- Post Save All Student --------------------
	public Student saveStudent(Student student) {
		return repository.save(student);
	}

	public List<Student> saveAllStudents(List<Student> students) {
		return repository.saveAll(students);
	}
	//-----------------------------------------------------------

	public List<Student> getAllStudents(){
		return repository.findAll();
	}

	public Student getStudentById(Long sid) {
		return repository.findById(sid).orElse(null);
	}

	public String delStudentById(Long sid) {
		repository.deleteById(sid);
		return sid + "is deleted !!";
	}

	public Student updateStudent(Student student) {
		Student exsistStudent = repository.findById(student.getS_id()).orElse(null);
		exsistStudent.setS_name(student.getS_name());
		exsistStudent.setS_age(student.getS_age());
		exsistStudent.setS_cource(student.getS_cource());
		exsistStudent.setS_email(student.getS_email());
		exsistStudent.setS_gender(student.getS_gender());
		return repository.save(exsistStudent);
	}

}
