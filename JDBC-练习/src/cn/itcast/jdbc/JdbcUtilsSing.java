package cn.itcast.jdbc;
//规范和封装
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class JdbcUtilsSing {
	private static String url="jdbc:mysql://127.0.0.1:3306/test";
	private static String user="root";
	private static String password="qwer";
	private static JdbcUtilsSing instance=new JdbcUtilsSing();
	//单例 设计模式  只有一个实例
	private JdbcUtilsSing(){
	}
	
	//预处理
	public static JdbcUtilsSing getInstance(){
		if(instance==null){
			instance=new JdbcUtilsSing();
		}
		return instance;
	}
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new ExceptionInInitializerError(e);
		}
	}


	public  Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection(url,user,password);
	}
	 
	public static void free(ResultSet rs,Statement st,Connection conn){
		try{
			if (rs!=null) 
			rs.close();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if (st!=null) 
				st.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
			finally{
				if(conn!=null)
					try {
						conn.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				
			}
		}
	}
	
}
