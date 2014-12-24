package 集合;
import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

//这是用户基本操作类

public class UserOperator {
	//用集合来存储你的用户
	//为了保证多个对象用的是同一个成员变量 所以成员变量就用static修饰
	private static ArrayList<User> array = new ArrayList<User>();
	
	
	Scanner sc=new Scanner(System.in);
	//登陆方法  输入用户名密码存储到集合中   再比较你输入的用户名和密码 通过判断用户名和密码是否正确 来提示你是否登陆成功
	//其实这里相当于一个boolean类型的 来判断你登陆是否成功
	public void login() {
		boolean flag = false;
		//输入用户名和密码
		System.out.println("-------欢迎来到注册页面------");
		System.out.println("请输入用户名：");
		String username = sc.nextLine();
		System.out.println("请输入密码");
		String password = sc.nextLine();
		//存储到集合中 再遍历这个集合 看是否相等
		for (User u : array) {
			if (u.getUsername().equals(username)
					&& u.getPassword().equals(password)) {
				flag = true;
				break;
			}
		}
		//判断你是否登陆成功
		if(flag){
			System.out.println("登陆成功 可以开始玩猜数字小游戏了");
			//Game g=new Game();
			//g.palyGame();
		}else{
			System.out.println("登陆失败，请重新登陆");
		}
	}

	public void reigst() {
		//输入用户名和密码进行注册
		System.out.println("-------欢迎来到注册页面------");
		System.out.println("请输入用户名：");
		String newUsername = sc.nextLine();
		System.out.println("请输入密码");
		String newPassword = sc.nextLine();
		
		User user =new User();
		user.setPassword(newPassword);
		user.setUsername(newUsername);
		ArrayList<User> array = new ArrayList<User>();
		array.add(user);
		// return null;

	}

}