import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class demo {
	public static void main(String[] args) throws ClassNotFoundException {
		String sql = "SELECT * FROM tdb_goods";
		String in_sql = "INSERT tdb_goods (goods_id,goods_name,cate_id,brand_id,goods_price,is_show,is_saleoff) VALUES(998,'�߲�',45,44,'99',DEFAULT,DEFAULT);";
		//String del_sql = "DELETE FROM tdb_goods WHERE goods_id=5";
		String alt_sql="ALTER TABLE tdb_goods  CHANGE is_saleoff is_saleoffs TINYINT ";
		// 1����������
		Class.forName("com.mysql.jdbc.Driver");
		// 2���������
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/test", "root", "qwer");
			//
			Statement stmt = conn.createStatement();
			// ��ѯ
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(1) + "\t"
						+ rs.getString(2) + "\t" + rs.getString(5));
			}

			// ����
			int num = stmt.executeUpdate(in_sql);
			System.out.println("num=" + num);
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(1) + "\t"
						+ rs.getString(2) + "\t" + rs.getString(5));
			}
			
			// ɾ��
		//	boolean num2 = stmt.execute(del_sql);
		//	System.out.println(num2);
			
			//�޸�
			int i = stmt.executeUpdate(alt_sql);
			System.out.println(i);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}