import java.util.Scanner;

import sun.net.www.content.image.gif;


public class UserTest {
	public static void main(String[] args) {
		while(true){
			System.out.println("-----欢迎光临-----");
			System.out.println("1登陆");
			System.out.println("2注册");
			System.out.println("3退出");
		
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入你的选择");
			String numberString=sc.nextLine();
			int number=Integer.parseInt(numberString);
		
			UserOperator uo=new UserOperator();
			switch(number){
			case 1:
				System.out.println("-------欢迎来到注册页面------");
				System.out.println("请输入用户名：");
				String username = sc.nextLine();
				System.out.println("请输入密码");
				String password = sc.nextLine();
				//调用操作类的功能
				//UserOperator uo=new UserOperator();
				boolean flag =uo.login(username, password);
				if(flag){
					System.out.println("登陆成功 可以开始玩猜数字小游戏了");
					//Game g=new Game();
					//g.palyGame();
				}else{
					System.out.println("登陆失败，请重新登陆");
				}
				break;
			case 2:
				System.out.println("-------欢迎来到注册页面------");
				System.out.println("请输入用户名：");
				String newUsername = sc.nextLine();
				System.out.println("请输入密码");
				String newPassword = sc.nextLine();
				
				User user =new User();
				user.setPassword(newPassword);
				user.setUsername(newUsername);
				//调用操作类的功能
				//UserOperator uo=new UserOperator();
				uo.reigst(user);
				System.out.println("恭喜你注册成功");
				break;
			case 3:
				
				break;
			default:
				System.out.println("谢谢使用，欢迎下次光临");
				System.exit(0);
				break;
					
			}
		}
	}

}
