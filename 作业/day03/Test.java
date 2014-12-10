import java.util.*;
public class Test{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		//System.out.println("请输入学生的姓名");
		//String[][] arr=new String[20][5];
		String[] name=new String[20];//用一个string数组来存储学生的姓名
		String[] course=new String[5];//声明一个string数组来存储课程的名称
		int[][] number=new int[20][5];//用来接受成绩
		int[] sum=new int[20];//用来接受总分
		int[] avg=new int[20];//用来接收平均分
		
		/*用来循环存储课程的名称*/
		for(int i=0;i<5;i++){
			System.out.println("第"+(i+1)+"门课程为");
			course[i]=in.next();   //接受你输入的课程
		}
		
		/*用来录入学生的各科成绩*/
		for(int i=0;i<20;i++){ //嵌套循环 主要是你输入一个学生的姓名之后 就会执行一次这个学生的五门课成绩
			
			int S=0;
			System.out.println("请输入学生的姓名：");
			name[i]=in.next();   //用来存储 接收你输入的学生的姓名
			for(int j=0;j<5;j++){
				System.out.println("请输入学生"+name[i]+course[j]+"的成绩");
				number[i][j]=in.nextInt();//用来存储接收到的是某位学员的具体成绩
				S+=number[i][j];
			}
			sum[i]=S;
			avg[i]=S/5;
		}
		System.out.print("学生");//不用换行 不能用println
		for(int i=0;i<5;i++){
			System.out.print("\t"+course[i]);//为了输出结果不是 学生语文数学 全部都连在一起
		}
		System.out.print("\t总分\t平均分");
		System.out.println();//为了换行 
		for(int i=0;i<20;i++){         //为了输入一个学生的姓名和成绩 在一行 下面一个人的要换行
			System.out.print(name[i]);
			for(int j=0;j<5;j++){
				System.out.print("\t"+number[i][j]);
			}
			System.out.print("\t"+sum[i]);//sum[i]
			System.out.print("\t"+avg[i]);
			System.out.println();//为了换行 
		}
		
		
		
	}
}