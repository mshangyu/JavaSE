//自己写一个程序模拟用户登录
/*用户名 密码 输入 判断 还可以输入多次*/
import java.util.*;
public class StringTest{
	public static void main(String[] args){
		String name="admin";
		String pwd="admin";
		
		for(int i=0;i<3;i++){     //给三次机会 循环输入 你的用户名和密码
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入用户名");
		String username=sc.nextLine();
		System.out.println("请输入密码");
		String password=sc.nextLine();
		
			if(name.equals(username)&&pwd.equals(password)){
				System.out.println("登陆成功");
			}else{
				System.out.println("登陆失败");
			}
		}
		
	}
}