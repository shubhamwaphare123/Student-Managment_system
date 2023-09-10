package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class getAll {
	public static void main(String[] args) {
		StudentService studentservice=new StudentService();
		Student student=null;
		Student s=studentservice.getAllstudent(student);
		if(s!=null) {
			System.out.println(s);
		}
	}

}
