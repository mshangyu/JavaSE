

	import java.sql.DriverManager;
	import java.sql.Statement;
	import java.sql.Connection;

	public class gaijinban {
			
			public void createTable(String sql) throws Exception{
				//��������
				Class.forName("com.mysql.jdbc.Driver");
				
				try (//��ȡ���ݿ�����
					Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","qwer");
					//ʹ����Connection������һ��Statement����
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
				System.out.println("----����ɹ�----");
			}

}
