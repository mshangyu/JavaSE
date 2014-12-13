//给三次机会  提示还剩余几次机会
import java.util.*;
public class StringTest2{
	public static void main(String[] args){
		String name="admin";
		String pwd="admin";
		
		for(int i=0;i<3;i++){    
			//从键盘输入用户名和密码
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入用户名");
			String username=sc.nextLine();
			System.out.println("请输入密码");
			String password=sc.nextLine();
			//判断
			if(name.equals(username)&&pwd.equals(password)){
				System.out.println("登陆成功,你可以进去玩猜数字小游戏了");
				Game.playGame();
				break;
			}else{
				if((2-i)==0){
					System.out.println("账号被锁定，请与管理员联系");
				}else{
				System.out.println("登陆失败，你还有"+(2-i)+"次机会");
				}
			}
		}
	
	}
}