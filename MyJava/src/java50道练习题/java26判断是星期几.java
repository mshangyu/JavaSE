package java50道练习题;

import java.util.Scanner;

public class java26判断是星期几 {

	/**
	 * 【程序26】   
	 * 题目：请输入星期几的第一个字母来判断一下是星期几，
	 * 如果第一个字母一样，则继续   判断第二个字母。 
	 * 周一:Monday 周二:Tuesday 周三:Wendesday
	 *  周四:Thursday 周五:Friday 周六:Saturday 周日:Sunday
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//输入一个字母
		Scanner s=new Scanner(System.in);
		System.out.println("请输入一个大写字母：");
		String n=s.next();
		
		switch(n){
		case "M":System.out.println("星期一");break;
		case "T":System.out.println("请再输入一个字母：");
					String n2=s.next();
					switch(n2){
					case "U":System.out.println("星期二");break;
					case "H":System.out.println("星期四");break;
					default :System.out.println("输入有误");
					}break;
		case "W":System.out.println("星期三");break;
		case "F":System.out.println("星期五");break;
		case "S":System.out.println("请再输入一个字母：");
					String n3=s.next();
					switch(n3){
					case "A":System.out.println("星期六");break;
					case "U":System.out.println("星期天");break;
					default :System.out.println("输入有误");
					}break;
		default :System.out.println("输入有误");
		}
		
	}

	

}
