import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Properties;

public class CallableStatementTest {
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

	public void callProcedure() throws ClassNotFoundException, SQLException {
		// ��������
		Class.forName(driver);
		try (
		// ��ȡ���ݿ������
		Connection conn = DriverManager.getConnection(url, user, pass);
				// ʹ��һ��connection������һ��callablestatement����
				CallableStatement cstmt = conn
						.prepareCall("{call add_pro(?,?,?)}"))

		{
			cstmt.setInt(1, 4);
			cstmt.setInt(2, 5);
			// ע��callablesataement�ĵ�����������int����
			cstmt.registerOutParameter(3, Types.INTEGER);
			// ִ�д洢����
			cstmt.execute();
			// ��ȡ������洢���̴���������ֵ
			System.out.println("ִ�н���ǣ�" + cstmt.getInt(3));
		}

	}
	
	public static void main(String[] args) throws Exception {
		CallableStatementTest ct=new CallableStatementTest();
		ct.initParam("my.ini");
		ct.callProcedure();
	}
}