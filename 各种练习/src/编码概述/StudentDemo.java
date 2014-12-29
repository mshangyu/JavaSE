
package 编码概述;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import IO基类下面的字符流.FileWriteDemo;

public class StudentDemo {
	/*有五个学生，每个学生有三门课（语文，数学，英语）的成绩
	 * 写一个程序接收从键盘输入学生的信息，输入格式为：name，30，30，30（姓名，三门课成绩）
     *然后把输入的学生信息按总分从高到低的顺序 写入到一个名称为stu。txt文件中
     *要求：stu.txt文件的格式要比较直观，打开这个文件，就可以很清楚的看到学生的信息；
     *
     *分析：1、五个学生，每个学生有三门课 
     *告诉我们学生类的成员变量有：姓名，语文成绩 数学成绩 英语成绩
     *2、然后把输入的学生信息按总分从高到低的顺序 说明有排序
     *		TreeMap可以实现 总分做健 但是 如果总分相同 就会有问题
     *考虑使用TreeSet存储学生即可
     *3、遍历TreeSet集合，把数据写到文件
     *		文件的数据格式：
     *			姓名，语文成绩 数学成绩 英语成绩
	 *
	 */
	public static void main(String[] args) throws IOException {
		//创建TreeSet集合
		TreeSet<Student> ts=new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {  //1-2是从低到高  2-1是从高到低
				int sum=s2.getSum()-s1.getSum();
				int sum2=sum==0?s1.getChinese()-s2.getChinese():sum;
				int sum3=sum2==0?s1.getEnglish()-s2.getEnglish():sum2;
				int sum4=sum3==0?s1.getMath()-s2.getMath():sum3;
				int sum5=sum4==0?s1.getName().compareTo(s2.getName()):sum4;
				return sum5;
			}
		});
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("请输入第"+i+"个学生信息，格式为：姓名，语文成绩，数学成绩，英语成绩");
			Scanner sc=new Scanner(System.in);
			String line=sc.nextLine();
			String[] datas=line.split(",");
			
			String name=datas[0];
			int chinese=Integer.parseInt(datas[1]);
			int math=Integer.parseInt(datas[2]);
			int english=Integer.parseInt(datas[3]);
			
			Student s=new Student();
			s.setName(name);
			s.setChinese(chinese);
			s.setMath(math);
			s.setEnglish(english);
			
			//加到集合中
			ts.add(s);
		}
		//3、遍历TreeSet集合，把数据写到文件
	    //		文件的数据格式：
	    //			姓名，语文成绩 数学成绩 英语成绩
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("stu.txt"));
		bw.write("姓名：语文成绩，数学成绩，英语成绩");
		bw.newLine();
		bw.flush();
		
		for (Student s : ts) {
			StringBuilder sb=new StringBuilder();
			sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",").append(s.getEnglish());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
		
		//提示：
		System.out.println("学生信息操作完毕");
	}

}

