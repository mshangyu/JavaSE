import java.util.*;
public class Test2{
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("**********************");
	System.out.println("|   1.增加一个学生   |");
	System.out.println("|   2.显示所有学生   |");
	System.out.println("|   3.退出程序       |");
	System.out.println("|请输入你的选择(1-3):|");
	System.out.println("**********************");
	System.out.println("请输入你的选择(1-3):");
	int choose=in.nextInt();
		switch(choose){
			case 1:
				System.out.println("增加一个学生");
				break;
			case 2:
				System.out.println("显示所有学生");
				break;
			case 3:
				System.out.println("退出程序");
				break;
		}
	}
}