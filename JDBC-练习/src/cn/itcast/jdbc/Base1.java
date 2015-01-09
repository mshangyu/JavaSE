package cn.itcast.jdbc;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Base1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		template();
	}
	
	static void template() throws ClassNotFoundException, SQLException{
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		String user = "root";
		String password = "qwer";
		Connection conn = null;
		Statement st=null;
		ResultSet rs=null;
		
		try {
			
			// 2����������
			conn = JdbcUtils.getConnection();
			//conn=JdbcUtilsSing.getInstance().getConnection();
			// 3���������
			 st = conn.createStatement();

			// 4��ִ����� user�Ǳ�
			 rs = st.executeQuery("select * from user");

			// 5��������
			while (rs.next()) {
				System.out.println(rs.getObject(1) + "\t" + rs.getObject(2) + "\t"
						+ rs.getObject(3) + "\t" + rs.getObject(4));
			}	
		}finally{
			JdbcUtils.free(rs, st, conn);

			
		
			
		}
		
	}

	static void test() throws SQLException, ClassNotFoundException {
		// 1��ע������ ���ַ�ʽ
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());

		System.setProperty("jdbc.drivers", "com.mysql.jdbc.Driver");

		Class.forName("com.mysql.jdbc.Driver");

		// 2���������� ���ַ�ʽ �����test�����ݿ�
		// ��ʽһ
		// Connection
		// conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","qwer");
		// ��ʽ��
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		String user = "root";
		String password = "qwer";
		Connection conn = DriverManager.getConnection(url, user, password);

		// 3���������
		Statement st = conn.createStatement();

		// 4��ִ����� user�Ǳ�
		ResultSet rs = st.executeQuery("select * from user");

		// 5��������
		while (rs.next()) {
			System.out.println(rs.getObject(1) + "\t" + rs.getObject(2) + "\t"
					+ rs.getObject(3) + "\t" + rs.getObject(4));
		}
		// ������ʲô���͵� ����Object������ �������1234 ��ʾ���ǵڼ���

		// 6���ͷ���Դ
		rs.close();
		st.close();
		conn.close();
	}

}
