import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

import java.sql.PreparedStatement;

public class PreparedStatementTest {
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
		// 加载驱动
		Class.forName(driver);

	}

	public void insertUseStatement() throws Exception {
		long start = System.currentTimeMillis();
		try (
		// 获取数据库的连接
		Connection conn = DriverManager.getConnection(url, user, pass);
				// 使用connection 来创建一个statement 对象
				Statement stmt = conn.createStatement()) {
			// 需要使用100条sql语句来插入100条记录
			for (int i = 0; i < 10; i++) { // statement 这里需要拼接sql字符串
											// 而sql语句中的字符串必须用单引号括起来
				stmt.executeUpdate("insert into tdb_goods values(null,'姓名" + i + "',100,200,500.00,1,1)");
			}
			System.out.println("使用statement费时："
					+ (System.currentTimeMillis() - start));
		}
	}

	public void insertUsePrepare() throws Exception {
		long start = System.currentTimeMillis();
		try (
		// 获取数据库连接
		Connection conn = DriverManager.getConnection(url, user, pass);
				// 使用Connection 来创建一个PrepareStatement对象
				PreparedStatement pstmt = conn // 而使用prepareStatement则只需要使用问号占位符来替代这些参数即可以
						.prepareStatement("insert into tdb_goods values(NULL,?,?,?,123456.000 ,1 ,1 )")) {
			// 100次为PreparedStatement 的参数设值，就可以插入100条记录
			for (int i = 0; i < 10; i++) {
				pstmt.setString(1, "姓名" + i);		//goods_name
				pstmt.setInt(2, 10+i);				//cate_id
				pstmt.setInt(3, 90+i);				//brand_id
				
				pstmt.executeUpdate();
			}
			System.out.println("使用PreparedStatement费时："
					+ (System.currentTimeMillis() - start));
		}
	}

	public static void main(String[] args) throws Exception {
		PreparedStatementTest pt = new PreparedStatementTest();
		pt.initParam("my.ini");
		pt.insertUseStatement();
		pt.insertUsePrepare();
	}

}
