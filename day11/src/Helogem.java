import java.util.Scanner;


public class Helogem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入课程代号（1-3）之间的数字");
		Scanner in=new Scanner(System.in);
		int courseCode=in.nextInt();//从键盘输入整数
		switch(courseCode){
		case 1:
			System.out.println("c#编程");
			break;
		case 2:
			System.out.println("java编程");
			break;
		case 3:
			System.out.println("sql编程");
			break;
		default :
			System.out.println("输入有误");
		
		}
	}

}

/*
 */
