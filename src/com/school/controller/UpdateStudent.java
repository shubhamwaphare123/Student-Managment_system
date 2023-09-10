package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class UpdateStudent {
	public static void main(String[] args) {
		Student student=new Student();
		student.setId(1);
		student.setName("abababab");
		student.setEmail("@mail.com");
		
		StudentService studentservice = new StudentService();
		boolean res =studentservice.updateStudent(student);
		System.out.println(res);
		

	}
	

	

}
