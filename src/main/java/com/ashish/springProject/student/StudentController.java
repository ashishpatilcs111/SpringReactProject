package com.ashish.springProject.student;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="/api/v1/students" )
public class StudentController {

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping
	public List<Student> getAllStudents(){
		List<Student> students = Arrays.asList(
				new Student(1L, "Ashish","ashish@gmail.com", Gender.MALE),
				new Student(2L, "Manish","manish@gmail.com", Gender.MALE),
				new Student(3L, "Tanish","tanish@gmail.com", Gender.MALE)
				);
	return students;
	}
}
