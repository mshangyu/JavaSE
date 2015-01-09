import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.sql.ResultSetMetaData;

public class ExecuteSQL {
	private String driver;
	private String url;
	private String user;
	private String pass;

	public void initParam(String paramFile) throws Exception, IOException {
		// ʹ��Properties�������������ļ�
		Properties props = new Properties();
		props.load(new FileInputStream(paramFile));
		driver = props.getProperty("driver");
		url = props.getProperty("url");
		user = props.getProperty("user");
		pass = props.getProperty("pass");

	}

	public void executeSql(String sql) throws Exception {
		// ��������
		Class.forName(driver);
		try (
		// ��ȡ���ݿ������
		Connection conn = DriverManager.getConnection(url, user, pass);
				// ʹ��connection ������һ��statement ����
				Statement stmt = conn.createStatement()) {
			// ִ��sql��� ����booleanֵ��ʾ�Ƿ����resultset
			boolean hasResultSet = stmt.execute(sql);
			// ���ִ�к���ResultSet�����
			if (hasResultSet) {
				try (
				// ��ȡ�����
				ResultSet rs = stmt.getResultSet()) {
					// resultsetMetaData �����ڷ����������Ԫ���ݽӿ�
					ResultSetMetaData rsmd = rs.getMetaData();
					int columnCount = rsmd.getColumnCount();
					// �������ResultSet����
					while (rs.next()) {
						// һ�����ÿ�е�ֵ
						for (int i = 0; i < columnCount; i++) {
							System.out.println(rs.getString(i + 1) + "\t");
						}
						System.out.println("\n");
					}
				}
			} else {
				System.out
						.println("��sql���Ӱ��ļ�¼��" + stmt.getUpdateCount() + "��");
			}
		}
	}

	public static void main(String[] args) throws Exception {
		ExecuteSQL es = new ExecuteSQL();
		es.initParam("my.ini");

		//System.out.println("----------ִ��ɾ�����DDL���------");
		//es.executeSql("drop table if exists my test");

		System.out.println("------------ִ�н����DDL���-------");
		es.executeSql("create table my_test"
				+ "(test_id int auto_increment primary key,"
				+ "test_name varchar(255))");

		System.out.println("-------------ִ�в������ݵ�DML���-------");
		es.executeSql("insert into my_test(test_name)"
				+ "select name from user");

		System.out.println("--------------ִ�в�ѯ���ݵĲ�ѯ���--------");
		es.executeSql("select * from user");

	}

}
