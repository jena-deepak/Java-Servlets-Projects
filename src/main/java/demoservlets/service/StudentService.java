package demoservlets.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import demoservlets.entity.Student;

public class StudentService {
	// private static Scanner sc = new Scanner(System.in);
	private static String url = "jdbc:postgresql://localhost:5432/schoolmanagement?user=postgres&password=123";
	private static Connection connection;
	static {
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url);
			System.out.println("connection estabilshed...");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int save(Student student) {
		int res = 0;
		String sql = "insert into students values(?,?,?,?,?)";
		try {
			PreparedStatement pstm = connection.prepareStatement(sql);
			pstm.setInt(1, student.getStudentId());
			pstm.setString(2, student.getStudentName());
			pstm.setInt(3, student.getStudentAge());
			pstm.setString(4, student.getPassword());
			pstm.setString(5, student.getConfirmPassword());
			res = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;

	}

	public int delete(int id) {
		int res = 0;
		String sql = "delete from students  where studentId=?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			res = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	public List<Student> fetchAll() {
		List<Student> list = new ArrayList<Student>();
		String sql = "select * from students";
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				list.add(new Student(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<Student> fetchByPassword(String name, String password) {
		List<Student> list = new ArrayList<Student>();
		//String sql = "select * from students where studentName=? and password=?";
		String sql="select * from students where \"studentName\"=? and \"password\"=?";

		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, name);
			statement.setString(2, password);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				list.add(new Student(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3),
						resultSet.getString(4), resultSet.getString(5)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public int update(String name, int id) {
		int res = 0;
		String sql = "update students set studentName=? where studentId=?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, id);
			res = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	public void exit() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
