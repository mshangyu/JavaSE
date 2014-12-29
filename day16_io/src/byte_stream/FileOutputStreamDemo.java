package byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//1、创建File对象 创建流对象
		FileInputStream fis=new FileInputStream("./src/byte_stream/FileOutputStreamDemo.java");
		FileOutputStream fos=new FileOutputStream("out.txt");
		
		//2、写操作
//		int ch=0;  
//		while ((ch=fis.read())!=-1) {
//			fos.write(ch);
//		
//		}
		
		byte[] chs=new byte[1024];
		int len=0;
		while ((len=fis.read(chs))!=-1) {
			fos.write(chs,0,len);
			
			// System.out.println(new String(chs,0,len));
		}
		//3、释放资源
		fos.close();
		fis.close();
	}

}
