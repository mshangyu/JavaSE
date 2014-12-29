package 编码概述;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOEncodeDemo {
	/*
	 * IO流中的编码问题： 我要在io流中读写数据的时候去制定编码，该怎么办呢？ 
	 *	OutputStreamWriter(OutputStream out) 默认编码
	 * OutputStreamWriter(OutputStream out,String charsetName)指定编码
	 * OutputStreamWriter=out+charsetName 字符流=字节流+编码表
	 * 
	 * 编码问题：统一编码。
	 */
	public static void main(String[] args) throws IOException {
		//创建字符流对象
		//OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("osw.txt"));//默认编码GBK
		//OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("osw.txt"),"GBK");//指定gbk编码
//		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("osw.txt"),"UTF-8");//指定编码utf-8
//		osw.write("中国");
//		osw.close();
		
		//创建字符流对象
		//InputStreamReader isr=new InputStreamReader(new FileInputStream("osw.txt"));//默认编码
		//InputStreamReader isr=new InputStreamReader(new FileInputStream("osw.txt"),"GBK";//指定编码
		InputStreamReader isr=new InputStreamReader(new FileInputStream("osw.txt"),"UTF-8");//指定编码
		char[] chs=new char[20];
		int len=isr.read(chs);
		String s=String.valueOf(chs,0,len);
		System.out.println(s);
		
			
		
		
	}
}
