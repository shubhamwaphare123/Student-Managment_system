package com.school.service;

import com.school.dao.StudentDao;
//import com.school.dao.student;
import com.school.dto.Student;

public class StudentService {
	StudentDao studentDao = new StudentDao();

	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}

	public boolean deletestudent(int id) {
		return studentDao.deleteStudentById(id);
	}
	public Student getAllstudent(Student student) {
		return studentDao.getAllstudent(student);
	}
	public Student getById(Student student) {
		return studentDao.getById(student);
	}
	public boolean updateStudent(Student student) {
		return studentDao.updateStudent(student);
	}




}
