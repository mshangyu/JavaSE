import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;


public class ConnMySql {
	public static void main(String[] args) throws Exception {
		//1������������ʹ�÷���֪ʶ�����ڼ�ס������д
		Class.forName("com.mysql.jdbc.Driver");
		//2��ʹ��DriverManager ��ȡ���ݿ������
		//���з��ص�connection�ʹ�����java��������ݿ������
		//��ͬ���ݿ��urlд����Ҫ�����ĵ� �û���������DBA����
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","qwer");
		//3��ʹ��connection������һ��statement����
		Statement stmt=conn.createStatement();
		//4��ִ��sql���
		/*Statement ������ִ��sql���ķ�����
		 * 1��execute������ִ���κ�sql���   ���ص���һ��booleanֵ�����ִ�к��һ�������ResultSet���򷵻�true�����򷵻�false
		 * 2��executeQuery���� ִ��select���-���ز�ѯ���Ľ����
		 * 3��executeUpdate��������ִ��dml���-����һ������  ������sql���Ӱ��ļ�¼����
		 * */
		ResultSet rs=stmt.executeQuery("SELECT * FROM tdb_goods");
		{
			/*ResultSet ��һϵ�е�getXxx��������/���������������ڻ�ȡ��¼ָ��
			 * ָ���С��ض��е�ֵ������ʹ��next���� ����¼ָ������һ��
			 * ����ƶ�֮���¼ָ����Ȼָ����Ч�У���next������������true
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