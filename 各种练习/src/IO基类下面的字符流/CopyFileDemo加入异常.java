
//复制文件的标准代码
package IO基类下面的字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo加入异常 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try{
		// 封装数据源
		fr = new FileReader("IODemo.java");
		// 封装目的地
		fw = new FileWriter("d:\\Copy.java");

		// 读取数据并且写出数据
		int ch = 0;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}

		}catch(FileNotFoundException e){
			e.printStackTrace();
			System.out.println("找不到文件");
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("读写文件失败");
		}finally{
			if (fw!=null) {
				// 释放资源
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("释放输出流失败");
				}
				if (fr!=null) {
					try {
						fr.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("释放输入流失败");
					}
				}
				
			}
			
		}
	}
}
