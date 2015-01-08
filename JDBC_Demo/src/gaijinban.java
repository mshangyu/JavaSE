

	import java.sql.DriverManager;
	import java.sql.Statement;
	import java.sql.Connection;

	public class gaijinban {
			
			public void createTable(String sql) throws Exception{
				//加载驱动
				Class.forName("com.mysql.jdbc.Driver");
				
				try (//获取数据库连接
					Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","qwer");
					//使用了Connection来创建一个Statement对象
					Statement stmt = conn.createStatement())
					{
					stmt.executeUpdate(sql);
					}
			}
			
			public static void main(String[] args) throws Exception {
				gaijinban ed = new gaijinban();
				
				ed.createTable("create table dbc_test"
								+"(dbc_id int primary key auto_increment,"
								+"dbc_name varchar(255),"
								+"dbc_desc text);");
				System.out.println("----建表成功----");
			}

}
