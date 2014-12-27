package IO基类下面的字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo2 {
/*
 * 练习：
 * 		把a.txt的内容复制到b.txt中
 * 要求：  
 * 		读取数据的时候，要每次读取一个字符输组的数据
 * 
 * 数据源：
 * 		a.txt---FileReader
 * 目的地：
 * 		b.txt---FileWriter
 * 
 * */
	public static void main(String[] args) throws IOException {
		//封装数据源：
		FileReader fr=new FileReader("a.txt");
		//封装目的地
		FileWriter fw=new FileWriter("b.txt");
		
		//读取数据
		char[] chs=new char[1024];
		int len=0;
		while((len=fr.read(chs))!=-1){
			fw.write(chs,0,len);
			//System.out.println(String.valueOf(b));
		}
		
		
		//释放资源
		fw.close();
		fr.close();
		
		
		
		
	}
}
