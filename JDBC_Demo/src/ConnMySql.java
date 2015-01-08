import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;


public class ConnMySql {
	public static void main(String[] args) throws Exception {
		//1、加载驱动，使用反射知识，现在记住就这样写
		Class.forName("com.mysql.jdbc.Driver");
		//2、使用DriverManager 获取数据库的连接
		//其中返回的connection就代表了java程序和数据库的连接
		//不同数据库的url写法需要驱动文档 用户名密码由DBA分配
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","qwer");
		//3、使用connection来创建一个statement对象
		Statement stmt=conn.createStatement();
		//4、执行sql语句
		/*Statement 有三种执行sql语句的方法；
		 * 1、execute（）可执行任何sql语句   返回的是一个boolean值，如果执行后第一个结果是ResultSet，则返回true，否则返回false
		 * 2、executeQuery（） 执行select语句-返回查询到的结果集
		 * 3、executeUpdate（）用于执行dml语句-返回一个整数  代表被sql语句影响的记录条数
		 * */
		ResultSet rs=stmt.executeQuery("SELECT * FROM tdb_goods");
		{
			/*ResultSet 有一系列的getXxx（列索引/列名）方法，用于获取记录指针
			 * 指向行、特定列的值，不断使用next（） 将记录指针下移一行
			 * 如果移动之后记录指针依然指向有效行，则next（）方法返回true
			 * */
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" +
									rs.getString(1) + "\t"+ 
									rs.getString(2) + "\t" +
									rs.getString(5));
			}
			
		}
	}
}
