package IO基类下面的字符流;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 一个标准的字符输出流对象 写数据
 * 
 * */

public class FileWriterDemo加入异常 {
	public static void main(String[] args) {
		// //给默认初始化
		// 基本版本
		// FileWriter fw=null;
		// try {
		// System.out.println(10/0);
		// fw = new FileWriter("fw.txt");
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// try {
		// fw.write("helloworld");
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// try {
		// fw.close();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// 统一处理
		//由于这个fw对象，需要在finally里面被使用。所以要定义在try的外面
		FileWriter fw=null;
		try {
			fw = new FileWriter("z:\\fw.txt");
			fw.write("helloworld");
			//fw.close();放这里不合理 可能执行到这里面前，已经出问题了 所以这个必须放到finally代码里面
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("写数据出问题了");
		}finally{
			//为了避免空指针异常 加入if判断
			try {
				fw.close();
			} catch (IOException e) {
				
				//e.printStackTrace();
				System.out.println("package IO流;FileWriterDemo加入异常 main 释放资源失败");
			}
		}

	}

}
