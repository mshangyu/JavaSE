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
		// ʹ��Properties�������������ļ�
		Properties props = new Properties();
		props.load(new FileInputStream(paramFile));
		driver = props.getProperty("driver");
		url = props.getProperty("url");
		user = props.getProperty("user");
		pass = props.getProperty("pass");
		// ��������
		Class.forName(driver);

	}

	public void insertUseStatement() throws Exception {
		long start = System.currentTimeMillis();
		try (
		// ��ȡ���ݿ������
		Connection conn = DriverManager.getConnection(url, user, pass);
				// ʹ��connection ������һ��statement ����
				Statement stmt = conn.createStatement()) {
			// ��Ҫʹ��100��sql���������100����¼
			for (int i = 0; i < 10; i++) { // statement ������Ҫƴ��sql�ַ���
											// ��sql����е��ַ��������õ�����������
				stmt.executeUpdate("insert into tdb_goods values(null,'����" + i + "',100,200,500.00,1,1)");
			}
			System.out.println("ʹ��statement��ʱ��"
					+ (System.currentTimeMillis() - start));
		}
	}

	public void insertUsePrepare() throws Exception {
		long start = System.currentTimeMillis();
		try (
		// ��ȡ���ݿ�����
		Connection conn = DriverManager.getConnection(url, user, pass);
				// ʹ��Connection ������һ��PrepareStatement����
				PreparedStatement pstmt = conn // ��ʹ��prepareStatement��ֻ��Ҫʹ���ʺ�ռλ���������Щ����������
						.prepareStatement("insert into tdb_goods values(NULL,?,?,?,123456.000 ,1 ,1 )")) {
			// 100��ΪPreparedStatement �Ĳ�����ֵ���Ϳ��Բ���100����¼
			for (int i = 0; i < 10; i++) {
				pstmt.setString(1, "����" + i);		//goods_name
				pstmt.setInt(2, 10+i);				//cate_id
				pstmt.setInt(3, 90+i);				//brand_id
				
				pstmt.executeUpdate();
			}
			System.out.println("ʹ��PreparedStatement��ʱ��"
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