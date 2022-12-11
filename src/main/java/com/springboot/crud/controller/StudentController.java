package com.springboot.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crud.entity.Student;
import com.springboot.crud.service.StudentService;

@RestController
public class StudentController {

		@Autowired
		private StudentService studentService;

		@PostMapping("/addStudent")
		public Student addStudent(@RequestBody Student student) {
			return studentService.saveStudent(student);
		}

		@PostMapping("/addStudents")
		public List<Student> addAllStudent(@RequestBody List<Student> students) {
			return studentService.saveAllStudents(students);
		}

		@GetMapping("/students")
		public List<Student> findStudentsList(){
			return studentService.getAllStudents();
		}

		@GetMapping("/studentsById/{sid}")
		public Student findStudentById(@PathVariable Long sid) {
			return studentService.getStudentById(sid);
		}

		@PutMapping("/update")
		public Student updateStudent(@RequestBody Student student) {
			return studentService.updateStudent(student);
		}

		@DeleteMapping("/delstudent/{sid}")
		public String delStudent(@PathVariable Long sid) {
			return studentService.delStudentById(sid);
		}
}
