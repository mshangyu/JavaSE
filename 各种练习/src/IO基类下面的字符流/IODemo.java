
/*io流的主要作用是 实现数据的上传和下载
 * 其本质就是读取数据和写出数据
 * 
 * io流的分类：
 * 
 * 我要往一个文本文件中写入一句话“hello,io,i am coming”
 * 分析：由分析可知道 使用的是writer 字符输出流
 * 通过查api知道 该类是个抽象类 不能实例化 那么就只能找子类了 到底找那个子类看构造方法了：
 * public FileWriter（File file）
 * public FileWriter（String fileName）
 * */
package IO基类下面的字符流;

import java.io.FileWriter;
import java.io.IOException;

public class IODemo {
	public static void main(String[] args) throws IOException {
		//创建字符流输出对象
		FileWriter fw=new FileWriter("fw.txt");
		//自动帮你创建了文件
		
		//开始写数据了
		//public void write(String str)
		fw.write("hello,io,i am coming");
		
		//为什么会没有数据呢？
		//字符=2字节

	}

}
