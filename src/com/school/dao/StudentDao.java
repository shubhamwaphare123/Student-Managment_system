package com.school.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.school.configuration.HelperClass;
import com.school.dto.Student;

public class StudentDao {
	HelperClass helperClass = new HelperClass();
	Connection connection = null;
	int i = 0;
	//update============================================
	public boolean updateStudent(Student student) {
		Connection connection =helperClass.getconnection();
		String sql = "UPDATE student SET name=? , email=? WHERE id =?";
		int i =0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, student.getName());
			preparedStatement.setString(2, student.getEmail());
			preparedStatement.setInt(3, student.getId());
			i = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (i > 0) {
			return true;
		} else {
			return false;
		}


	}
	
	
	//get by id===========================================================================
	
	public Student getById(Student student) {
		connection = helperClass.getconnection();
		String sql = "SELECT *  FROM student WHERE id=?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, student.getId());
            ResultSet resultSet =preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("============================");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return student;
		
	}
	
	//get all
	public Student getAllstudent(Student student) {
		connection=helperClass.getconnection();
		String sql="SELECT * FROM student";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet =preparedStatement.executeQuery(sql);
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return student;

		
		
	}
	
//delete method
//=======================================================//===============================//===============
	public boolean deleteStudentById(int id) {
		connection = helperClass.getconnection();
		String sql = "DELETE id FROM student WHERE ID=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			i = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (i > 0) {
			return true;
		} else {
			return false;
		}

	}

//===========================//===========//============================//==========================================
//to save a student data;
	public Student saveStudent(Student student) {// method 1
		connection = helperClass.getconnection();
		String sql = "INSERT INTO student VALUES(?,?,?)";
		// delemiters ?
		// CREAT STATEMENT
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// passed the value to placeholder------>
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getEmail());
//		CallableStatement cs=null;		
			// execute

			preparedStatement.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return student;
	}
}
