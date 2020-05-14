package com.yedam.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	public void insertEmp(Emp emp) {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
	} 
	String sql = "insert into emp values(" + emp.getEmployeeId()
										 +",'" + emp.getLastName()+"'"
										+"," + emp.getSalary()
					+",'" + emp.getHireDate()+"'"
					+")";
try {					
		System.out.println(sql);
		PreparedStatement pstmt = conn.prepareStatement(sql);
		int r = pstmt.executeUpdate();
System.out.println(r + "���� �ԷµǾ����ϴ�.");
	
	} catch (SQLException e) {
		e.printStackTrace();
			
}
}

	String sql = "select * from employees";

	// employees ���̺����� ��ȸ ���.
	public Employee[] getEmpList() {
		Employee[] emps = new Employee[100];
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			int i = 0;
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setLastName(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emps[i++] = emp;// Employee �ν��Ͻ� ����.

				// Employee �ν��Ͻ� ����.
				// System.out.println(rs.getInt("employee_id")+ rs.getString("first_name")
				// +rs.getString("last_name") + rs.getString("email") +
				// rs.getString("phone_number"));

			}
		} catch (SQLException e) {
			e.printStackTrace();

		}

		System.out.println("��ȸ �Ϸ�");
		return emps;
		// end of getEmpList()
	}
}
