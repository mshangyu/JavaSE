package dao;

//工具类  可以增删改查等
import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DBUtil;

import model.Goddess;

public class GoddessDao {
	// 这里传递的是前面创建的那个类 映射
	public void addGoddess(Goddess g) throws SQLException {
		// 拿到数据库的连接
		Connection conn = DBUtil.getConnetion();

		// 拿到我们需要的sql语句
		String sql = "" + "insert into imooc_goddess"
				+ "(user_name,sex,age,birthday,email,mobile,"
				+ "create_user,create_date,update_user,update_date,isdel)"
				+ "values("
				+ "?,?,?,?,?,?,?,current_date(),?,current_date(),?)"; // 这里是11个参数

		// 预编译
		// 下面这个方法会将上面的sql插入语句加入到这个驱动程序 但是并不直接执行
		PreparedStatement ptmt = conn.prepareStatement(sql);

		// 传递参数 要传11个比较麻烦 所以这里调用 前面已经创建好的类
		ptmt.setString(1, g.getUser_name()); // 这样 传参 只是保证参数不是固定的 可以通过set去修改
		ptmt.setInt(2, g.getSex());
		ptmt.setInt(3, g.getAge());
		ptmt.setDate(4, new Date(g.getBrithday().getTime()));// 这里是因为date类型在前面DBU那里java.util
																// 而在这里需要时java.sql类型的
		ptmt.setString(5, g.getEmail());
		ptmt.setString(6, g.getMobile());
		ptmt.setString(7, g.getCreate_user());
		ptmt.setString(8, g.getUpdate_user());
		ptmt.setInt(9, g.getIsdel());

		// 当它调用execute方法时才真正的执行
		ptmt.execute();
	}

	public void updateGoddess(Goddess g) throws SQLException {
		// 拿到数据库的连接
		Connection conn = DBUtil.getConnetion();

		// 拿到我们需要的sql语句
		String sql = "" + " update imooc_goddess "
				+ " set user_name=?,sex,age=?,birthday=?,email=?,mobile=?, "
				+ " update_user=?,update_date=current_date(),isdel=? "
				+ "  where id=? "; // 这里表示只更新一条语句

		// 预编译
		// 下面这个方法会将上面的sql插入语句加入到这个驱动程序 但是并不直接执行
		PreparedStatement ptmt = conn.prepareStatement(sql);

		// 传递参数 要传11个比较麻烦 所以这里调用 前面已经创建好的类
		ptmt.setString(1, g.getUser_name()); // 这样 传参 只是保证参数不是固定的 可以通过set去修改
		ptmt.setInt(2, g.getSex());
		ptmt.setInt(3, g.getAge());
		ptmt.setDate(4, new Date(g.getBrithday().getTime()));// 这里是因为date类型在前面DBU那里java.util
																// 而在这里需要时java.sql类型的
		ptmt.setString(5, g.getEmail());
		ptmt.setString(6, g.getMobile());
		ptmt.setString(7, g.getUpdate_user());
		ptmt.setInt(8, g.getIsdel());
		ptmt.setInt(9, g.getId());

		// 当它调用execute方法时才真正的执行
		ptmt.execute();
	}

	public void delGoddess(Integer id) throws SQLException {
		// 拿到数据库的连接
		Connection conn = DBUtil.getConnetion();

		// 拿到我们需要的sql语句
		String sql = "" + " delete from imooc_goddess " + " where id=? ";

		// 预编译
		// 下面这个方法会将上面的sql插入语句加入到这个驱动程序 但是并不直接执行
		PreparedStatement ptmt = conn.prepareStatement(sql);

		// 传递参数 要传11个比较麻烦 所以这里调用 前面已经创建好的类

		ptmt.setInt(1, id);

		// 当它调用execute方法时才真正的执行
		ptmt.execute();
	}

	public List<Goddess> query() throws SQLException {
		Connection conn = DBUtil.getConnetion();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt
				.executeQuery("select user_name,age from imooc_goddess");

		List<Goddess> gs = new ArrayList<Goddess>();
		Goddess g = null;

		while (rs.next()) {
			g = new Goddess();
			g.setUser_name(rs.getString("user_name"));
			g.setAge(rs.getInt("age"));
			// System.out.println(rs.getString("user_name") + ","+
			// rs.getInt("age"));
			gs.add(g);
		}
		return gs;
	}

	public Goddess get(Integer id) throws SQLException {
		Goddess g=null;
		// 拿到数据库的连接
		Connection conn = DBUtil.getConnetion();

		// 拿到我们需要的sql语句
		String sql = "" 
				+ " select * from imooc_goddess "
				+ "  where id=? "; 

		// 预编译
		// 下面这个方法会将上面的sql插入语句加入到这个驱动程序 但是并不直接执行
		PreparedStatement ptmt = conn.prepareStatement(sql);

		// 传递参数 要传11个比较麻烦 所以这里调用 前面已经创建好的类
		ptmt.setInt(1, id);

		// 当它调用executequery方法时才真正的执行查询
		ResultSet rs=ptmt.executeQuery();
		while(rs.next()){
			g=new Goddess();
			g.setId(rs.getInt("id"));
			g.setUser_name(rs.getString("user_name"));
			g.setAge(rs.getInt("age"));
			g.setSex(rs.getInt("sex"));
			g.setBrithday(rs.getDate("birthday"));
			g.setEmail(rs.getString("mobile"));
			g.setCreate_date(rs.getDate("create_date"));
			g.setCreate_user(rs.getString("create_user"));
			g.setUpdate_date(rs.getDate("update_date"));
			g.setUpdate_user(rs.getString("update_user"));
			g.setIsdel(rs.getInt("isdel"));
		}
		return null;
	}

}
