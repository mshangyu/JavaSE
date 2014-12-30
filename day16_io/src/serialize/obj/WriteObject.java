package serialize.obj;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 1、可序列化的类
 * 2、序列化？
 * 		a、创建输出流ObjectOutputStream对象:  处理流==基于节点
 * 		b、IO：writeObject()  
 * 
 * [内存中]对象---〉〉IO输出流----〉磁盘上----〉io输入流---〉内存
 * 					序列化                                      反序列化
 * 
 * */
public class WriteObject {
	public static void main(String[] args) {
		Person p=new Person(100,"java");
		
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("obj.txt"));
			//io操作
			oos.writeObject(p);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
