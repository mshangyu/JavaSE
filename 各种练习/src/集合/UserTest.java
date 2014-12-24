package 集合;
import java.util.Scanner;



/*这里使用集合来存储用户的 所以每次即使是注册过的再登陆也会是失败的
 *  是因为集合只要程序一结束 内存就消失了
 *  所以这里得先选择注册 再登陆
 * 当使用了io流的时候 注册过的就被写在文件上面了 直接就可以判断了是否是真正的成功
 * */
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
				//调用操作类的功能
				uo.login();				
				break;
			case 2:
				//调用操作类的功能
				//UserOperator uo=new UserOperator();
				uo.reigst();
				System.out.println("恭喜你注册成功");
				break;
			case 3:
				System.out.println("欢迎使用 下次来玩吧");
				break;
			default:
				System.out.println("谢谢使用，欢迎下次光临");
				System.exit(0);
				break;
					
			}
		}
	}

}
