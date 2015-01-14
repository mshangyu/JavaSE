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
	//url�����ݿ�ķ����ַ
	private String url;
	private String user;
	private String pass;
	//��½�����GUI���
	private JFrame jf=new JFrame("��½");
	private JTextField userField=new JTextField(20);
	private JTextField passField=new JTextField(20);
	private JButton loginButton = new JButton("��½");
	
	public void init() throws Exception {
		Properties connProp =new Properties();
		connProp.load(new FileInputStream(PROP_FILE));
		driver = connProp.getProperty("driver");
		url=connProp.getProperty("url");
		user=connProp.getProperty("user");
		pass=connProp.getProperty("pass");
		//��������
		Class.forName(driver);
		//Ϊ��½��ť�����¼�������
		loginButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//��½�ɹ�����ʾ����½�ɹ���
				if (validate(userField.getText(),passField.getText())) {
					JOptionPane.showMessageDialog(jf, "��½�ɹ�");
				}
				//������ʾ����¼ʧ�ܡ�
				else {
					JOptionPane.showMessageDialog(jf, "��¼ʧ��");
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
		//ִ�в�ѯ��sql���
		String sql = "select * from jdbc_test"+" where jdbc_name='"+userName+"' and jdbc_desc='"+userPass+"';";
		System.out.println(sql);
		
		try(
				Connection conn=DriverManager.getConnection(url,user,pass);
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql))
		{
			//�����ѯ��ResultSet�����г���һ���ļ�¼�����½�ɹ�
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