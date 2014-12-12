import java.util.*;
public class ScannerLongTest{
	public static void main(String[] args){
		//syatem.in 代表准输入 就是键盘输入
		Scanner sc=new Scanner(System.in);
		//判断是否还有下一个long整数
		while(sc.hasNextLong()){      //要求键盘输入的必须是长整形的 否则就结束
			//输出输入项
			System.out.println("键盘输入的内容是："+sc.nextLong());
		}
	}
}


//两个简单的方法来逐行读取
//boolean hasNextLine()   返回输入源中是否还有下一行
//String nextLine()   返回输入源中下一行的字符串
