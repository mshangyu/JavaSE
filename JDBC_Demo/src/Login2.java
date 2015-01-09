import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Login2 {
	private final String PROP_FILE="my.ini";
	private String driver;
	//url是数据库的服务地址
	private String url;
	private String user;
	private String pass;
	//登陆界面的GUI组件
	private JFrame jf=new JFrame("登陆");
	private JTextField userField=new JTextField(20);
	private JTextField passField=new JTextField(20);
	private JButton loginButton = new JButton("登陆");
	
	public void init() throws Exception {
		Properties connProp =new Properties();
		connProp.load(new FileInputStream(PROP_FILE));
		driver = connProp.getProperty("driver");
		url=connProp.getProperty("url");
		user=connProp.getProperty("user");
		pass=connProp.getProperty("pass");
		//加载驱动
		Class.forName(driver);
		//为登陆按钮添加事件监听器
		loginButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//登陆成功则提示“登陆成功”
				if (validate(userField.getText(),passField.getText())) {
					JOptionPane.showMessageDialog(jf, "登陆成功");
				}
				//否则显示“登录失败”
				else {
					JOptionPane.showMessageDialog(jf, "登录失败");
				}
			}
		});
		jf.add(userField,BorderLayout.NORTH);
		jf.add(passField);
		jf.add(loginButton,BorderLayout.SOUTH);
		jf.pack();
		jf.setVisible(true);
	}
	private boolean validate(String userName,String userPass){
		//执行查询的sql语句
		String sql = "select * from jdbc_test"+" where jdbc_name='"+userName+"' and jdbc_desc='"+userPass+"';";
		System.out.println(sql);
		
		try(
				Connection conn=DriverManager.getConnection(url,user,pass);
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql))
		{
			//如果查询的ResultSet里面有超过一条的记录，则登陆成功
			if(rs.next()){
				return true;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	public static void main(String[] args) throws Exception{
		new LoginFrame().init();
	}
}