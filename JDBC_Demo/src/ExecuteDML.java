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
		// ʹ��Properties�������������ļ�
		Properties props = new Properties();
		props.load(new FileInputStream(paramFile));
		driver = props.getProperty("driver");
		url = props.getProperty("url");
		user = props.getProperty("user");
		pass = props.getProperty("pass");
	}

	public int insertData(String sql) throws Exception {
		// ��������
		Class.forName(driver);
		try (
			// ��ȡ���ݿ������
			Connection conn = DriverManager.getConnection(url, user, pass);
			// ʹ��connection ������һ��statement ����
			Statement stmt = conn.createStatement())

		{
			// ִ��DML��䣬������Ӱ��ļ�¼����
			return stmt.executeUpdate(sql); 
		}
	}
	
	public static void main(String[] args) throws Exception{
		ExecuteDML ed=new ExecuteDML();
		ed.initParam("my.ini");
		int result = ed.insertData("insert into jdbc_test(jdbc_name,jdbc_desc)"
				+" select a.goods_name,b.cate_name"
				+" from tdb_goods AS a,goods_cates AS b"
				+" where a.cate_id=b.cate_id;");  //ע���������ź����и��ո��   ����ʵ�������е�ʱ�������һ��  ����id����һ��Ҫ�ӣ�  
		
		System.out.println("ϵͳ�й���"+result+"����¼��Ӱ��--");
	}
	
	
}