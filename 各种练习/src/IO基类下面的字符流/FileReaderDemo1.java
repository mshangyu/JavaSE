/*
 * 字符输入流的操作步骤：
 *  1、创建字符输入流的对象
 *  2、读取数据、并显示在控制台
 *  3、释放资源
 * 
 * */

package IO基类下面的字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {
	public static void main(String[] args) throws IOException {
		// 1、创建字符输入流的对象
		FileReader fr = new FileReader("IODemo.java");

		// // 2、读取数据、并显示在控制台
		// // public int read() 第一次读取第一个
		// int ch = fr.read();
		// System.out.println(ch);
		// System.out.println((char) ch);
		//
		// // 第二次读取
		// ch = fr.read();
		// System.out.println(ch);
		// System.out.println((char) ch);
		//
		// // 第三次读取
		// ch = fr.read();
		// System.out.println(ch);
		// System.out.println((char) ch);
		//
		// // 第四次读取
		// ch = fr.read();
		// System.out.println(ch);
		// System.out.println((char) ch);
		//
		// // 第五次读取
		// ch = fr.read();
		// System.out.println(ch);
		// System.out.println((char) ch);
		// //结论： 如果读取一个文件返回值是-1 说明就没有内容了 已经达到了流的末尾

		// int ch=fr.read();
		// while (ch!=-1) {
		// System.out.print((char)ch);
		// ch = fr.read();//上面只执行了第一次 还需要继续执行返回后面的 所以需要继续 读取
		//	}
		
		
		// 最终版代码
		int ch = 0;
		while ((ch = fr.read()) != -1) {   //读取 赋值 判断 放在了一起写的
			System.out.print((char) ch);
		}
		
		//释放那个资源
		fr.close();

	}

}
