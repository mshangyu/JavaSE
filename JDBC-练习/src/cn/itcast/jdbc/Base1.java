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
			
			// 2、建立连接
			conn = JdbcUtils.getConnection();
			//conn=JdbcUtilsSing.getInstance().getConnection();
			// 3、创建语句
			 st = conn.createStatement();

			// 4、执行语句 user是表
			 rs = st.executeQuery("select * from user");

			// 5、处理结果
			while (rs.next()) {
				System.out.println(rs.getObject(1) + "\t" + rs.getObject(2) + "\t"
						+ rs.getObject(3) + "\t" + rs.getObject(4));
			}	
		}finally{
			JdbcUtils.free(rs, st, conn);

			
		
			
		}
		
	}

	static void test() throws SQLException, ClassNotFoundException {
		// 1、注册驱动 几种方式
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());

		System.setProperty("jdbc.drivers", "com.mysql.jdbc.Driver");

		Class.forName("com.mysql.jdbc.Driver");

		// 2、建立连接 几种方式 这里的test是数据库
		// 方式一
		// Connection
		// conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","qwer");
		// 方式二
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		String user = "root";
		String password = "qwer";
		Connection conn = DriverManager.getConnection(url, user, password);

		// 3、创建语句
		Statement st = conn.createStatement();

		// 4、执行语句 user是表
		ResultSet rs = st.executeQuery("select * from user");

		// 5、处理结果
		while (rs.next()) {
			System.out.println(rs.getObject(1) + "\t" + rs.getObject(2) + "\t"
					+ rs.getObject(3) + "\t" + rs.getObject(4));
		}
		// 不论是什么类型的 都是Object的子类 这里面的1234 表示的是第几列

		// 6、释放资源
		rs.close();
		st.close();
		conn.close();
	}

}
