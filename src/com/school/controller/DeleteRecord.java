package com.school.controller;

import com.school.service.StudentService;

public class DeleteRecord {
	public static void main(String[] args) {
	

		StudentService studentService = new StudentService();
		boolean res = studentService.deletestudent(1);
		System.out.println(res);
	}
    
}
