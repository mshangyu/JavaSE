package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.omg.CORBA.PRIVATE_MEMBER;

public class DBUtil {
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/imooc";
	private static final String USER = "root";
	private static final String PASSWORD = "qwer";
	
	private static  Connection conn=null;
	static {
		try {
			// 1��������������
			Class.forName("com.mysql.jdbc.Driver");
			// 2��������ݿ������
			// DriverManager.getConnection(URL,USER,PASSWORD);
			 conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnetion(){
		return conn;
	}

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		// 1��������������
		Class.forName("com.mysql.jdbc.Driver");
		// 2��������ݿ������
		// DriverManager.getConnection(URL,USER,PASSWORD);
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		// 3��ͨ�����ݿ�����Ӳ������ݿ⣬ʵ����ɾ�Ĳ�
		// �ڵڶ��������Ǵ���һ�����Ӷ��� ��ͨ��������Ӵ���statement����
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt
				.executeQuery("select user_name,age from imooc_goddess");

		while (rs.next()) {
			System.out.println(rs.getString("user_name") + ","
					+ rs.getInt("age"));
		}

	}

}