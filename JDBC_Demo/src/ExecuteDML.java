import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ExecuteDML {

	private String driver;
	private String url;
	private String user;
	private String pass;

	public void initParam(String paramFile) throws Exception {
		// 使用Properties类来加载属性文件
		Properties props = new Properties();
		props.load(new FileInputStream(paramFile));
		driver = props.getProperty("driver");
		url = props.getProperty("url");
		user = props.getProperty("user");
		pass = props.getProperty("pass");
	}

	public int insertData(String sql) throws Exception {
		// 加载驱动
		Class.forName(driver);
		try (
			// 获取数据库的连接
			Connection conn = DriverManager.getConnection(url, user, pass);
			// 使用connection 来创建一个statement 对象
			Statement stmt = conn.createStatement())

		{
			// 执行DML语句，返回受影响的记录条数
			return stmt.executeUpdate(sql); 
		}
	}
	
	public static void main(String[] args) throws Exception{
		ExecuteDML ed=new ExecuteDML();
		ed.initParam("my.ini");
		int result = ed.insertData("insert into jdbc_test(jdbc_name,jdbc_desc)"
				+" select a.goods_name,b.cate_name"
				+" from tdb_goods AS a,goods_cates AS b"
				+" where a.cate_id=b.cate_id;");  //注意这里引号后面有个空格的   否则实际上运行的时候会连在一起  还有id后面一定要加；  
		
		System.out.println("系统中共有"+result+"条记录受影响--");
	}
	
	
}
