/*字符输出流操作步骤：
 *    A 创建字符输出流对象   
 *    B 调用输出方法 并刷新缓冲区
 *    C 释放资源
 * 
 * */

package IO基类下面的字符流;

import java.beans.FeatureDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
	public static void main(String[] args) throws IOException, InterruptedException {
		//A 创建字符输出流对象
		FileWriter fw=new FileWriter("fw2.txt");
		/*其实是做了几件事情：
		 * 1、调用系统功能 创建了一个文件fw2.txt 
		 * 2、创建了字符输出流对象  
		 *  3、把对象指向文件
		 * */
		
		
		//B 调用输出方法 并刷新缓冲区
		fw.write("林青霞");
		/*为什么数据没有进去呢？ 因为我么使用的是字符流，而数据底层是字节流的数据，所以我们不能直接把字符流数据写到文本文件中，
		 * 这个时候，数据存在，但是没有直接进文件，在内存中的缓冲区里面，我们需要把缓冲区给刷新一下
		 * */
		fw.flush();
//		fw.write("林青霞2");
//		fw.flush();
		
		//C 释放资源 void close()
		fw.close();
		/*作用：
		 * A 关闭流对象 流对象就是垃圾了
		 * B 通知操作系统去释放和开始创建的那个文件相关的资源
		 * */
//		fw.write("林青霞2"); 这里会[抛异常 主要是因为上面流已经关闭了
//		fw.flush();
	
		Thread.sleep(30000);
		
	}

}
