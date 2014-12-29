package byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//1、创建文件对象：水库
		File file=new File("./src/byte_stream/FileInputStreamDemo.java");
		//2、创建流对象 ： 管道
		FileInputStream fis=new FileInputStream(file);
		
		//3、进行IO操作： 读
		//一滴            一次获取一个字节
		int ch=0;
		while ((ch=fis.read())!=-1) {
			System.out.print((char)ch);  //不要换行
		}
		//一瓢一瓢的        一次获取一个字节数组
		byte[] bbuf=new byte[1024];
		int size=0;
//		size=fis.read(bbuf);
//		System.out.println(new String(bbuf,4,size-4));
		
		while ((size=fis.read(bbuf))!=-1) {
			//字节数组 转换成字符串
			System.out.println(new String(bbuf));
			System.out.println(new String(bbuf,0,size));
		}
		
		fis.close();
		
		
	}

}
