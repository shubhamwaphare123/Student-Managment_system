package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class GetById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setId(101);
		StudentService studentService=new StudentService() ;
		Student s=studentService.getById(student);
		if(s!=null) {
//		System.out.println(s);
		}

	}

}
