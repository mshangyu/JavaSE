/*
 * 1、writer类中其他的write方法
 * 
 * 
 * */

package IO基类下面的字符流;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo1 {
	public static void main(String[] args) throws IOException {
		// 创建对象
		// 如果文件不存在，就创建文件
		// 如果文件存在，写数据的时候。就是数据的覆盖
		FileWriter fw = new FileWriter("fw3.txt");

		// 1\write(String str)
		fw.write("hello");
		// 2\write(int c)
		fw.write(4);
		// 3\write(char[] cbuf)
		char[] chs = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		fw.write(chs);
		// 4\write(char[] cbuf,int off,int len)
		fw.write(chs, 0, 3); // 从0开始3个
		// 5\write(String str,int off.int len)
		fw.write("java", 0, 2);

		// 释放资源
		fw.close();
	}

}
