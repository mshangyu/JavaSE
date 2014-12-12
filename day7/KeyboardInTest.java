import java.util.*;
import java.io.*;
public class KeyboardInTest{
	public static void main(String[] args) throws Exception{
		//以System。in字节流为基础 创建一个bufferedReader对象
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		//逐行读取键盘输入
		while((line=br.readLine()) !=null){
			System.out.println("用户键盘输入的是："+line);
		}
	}
}

//BufferedReader 可以逐行读取用户的键盘输入 用户的每次键盘输入都被BufferesReader当成String对象 总是读取string对象