package IO基类下面的字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*一次不止读取一个
 * public int read(char[] cbuf):返回额是实际的读取长度  把数据读取到了数组中
 * 
 * 
 * */
public class FileReaderDemo2 {
	public static void main(String[] args) throws IOException {
		// 创建字符输入流对象
		FileReader fr = new FileReader("fr2.txt");
//		// public int read(char[] cbuf)
//		// 定义一个临时容器
//		char[] chs = new char[5];
//
//		// 第一次读取
//		int len = fr.read(chs); // 把文件中的数据读取到数组中
//		System.out.println(len);// 5
//		System.out.println(String.valueOf(chs));// hello
//
//		// 第二次读取
//		len = fr.read(chs); // 把文件中的数据读取到数组中
//		System.out.println(len);// 5
//		System.out.println(String.valueOf(chs));// \r\nwor(\r\n在这里转意换行也算字符)
//
//		// 第三次读取
//		len = fr.read(chs); // 把文件中的数据读取到数组中
//		System.out.println(len);// 5
//		System.out.println(String.valueOf(chs));//ld\r\nj
//
//		// 第四次读取
//		len = fr.read(chs); // 把文件中的数据读取到数组中
//		System.out.println(len);// 5
//		//System.out.println(String.valueOf(chs));//ava\r\n
//		System.out.println(String.valueOf(chs,0,len));
//
//		// 第五次读取
//		len = fr.read(chs); // 把文件中的数据读取到数组中
//		System.out.println(len);// 5
//		System.out.println(String.valueOf(chs));
//		//如果实际读取的返回值是-1.说明就没有元素了
		
//		char[] chs=new char[5];
//		int len=fr.read(chs);
//		while (len!=-1) {
//			System.out.println(String.valueOf(chs,0,len));
//			len=fr.read(chs);
//		}
		
		//最终版代码
		char[] chs=new char[1024];
		int len=0;
		while (((len=fr.read(chs))!=-1)) {
			System.out.println(String.valueOf(chs,0,len));
		}
		
		//释放资源
		fr.close();
	}

}
