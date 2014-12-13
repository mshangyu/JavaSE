/*需求： 键盘录入一个字符串，假如该字符串只有数字，英文字符串组成
请分别统计数字，大写字母，小写字各有有多少
举例：Hello123World     分析： 从键盘输入一个字符串
结果:大写：2个                 定义三个统计变量
小写：8个                      遍历字符串获取到每一个字符
数字：3个                       判断他是什么？大写小写 数字
                                对应恶毒统计变量++
								输出即可
*/
import java.util.*;
public class StringTest3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String line= sc.nextLine();
		//定义三个统计变量
		int bigCount=0;
		int smallCount=0;
		int numberCount=0;
		
		//遍历字符串获取到每一个字符
		for(int x=0;x<line.length();x++){
			char ch=line.charAt(x);
			
			if(ch>='0'&&ch<='9'){
				numberCount++;
			}else if(ch>='a'&&ch<='z'){
				smallCount++;
			}else{
				bigCount++;
			}
		}
		
		//输出即可
		System.out.println("大写："+bigCount);
		System.out.println("小写："+smallCount);
		System.out.println("数字："+numberCount);
	}
}