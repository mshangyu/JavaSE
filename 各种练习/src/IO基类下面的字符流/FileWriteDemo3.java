
/*1\数据没有换行  想换行怎么办？
 *      按照正常的逻辑：我们加入了换行符：\n 但会死并没有解决问题
 *      原因是什么呢？
 *      	不同的操作系统对换行符的识别不一样
 *      	windows:\r\n
 *      linux:\n
 *      mac:\r
 *      常见的工具软件提供的记事本功能比较强大  可以识别任意一种换行符
 *      if(xxx=='\n'||xxx=='\r'||xxx.equals("\r\n")){....}
 * 2、如何实现数据的追加写入呢？
 * 	使用带两个参数的构造方法。 第二个参数指示是否追加写入
 * */
package IO基类下面的字符流;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo3 {
	public static void main(String[] args) throws IOException {
		//创建对象
		//FileWriter fw=new FileWriter("fw4.txt");
		
		
		//public FileWriter(String filename,boolean append)
		//这里表示 这次不是从头开始而是从上次的末尾 再追加
		FileWriter fw=new FileWriter("fw4.txt",true);
		
		
		
		
		//写数据
		for (int x = 0; x < 10; x++) {
			fw.write("java"+x);
			//加入换行符
			fw.write("\r\n");
		}
		
		//释放资源
		fw.close();
	}

}
