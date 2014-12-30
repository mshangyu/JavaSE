//对象序列化      引用序列化     自定义序列化
package serialize.obj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*反序列化：                                                                                      节点流
 * 1、ObjectInputStream  输入流对象：===处理流==基于FileInputStream
 * 2、readObject()-----若 知道具体类 需要强转
 * */
public class ReadObject {
	public static void main(String[] args) {
		//外层是 处理流                                                                              里面的是节点流
		ObjectInputStream ois=null;
		try {
			ois = new ObjectInputStream(new FileInputStream("obj.txt"));
			Person p2=(Person)ois.readObject();//new 构造函数
			System.out.println("name:"+p2.getName()+"age:"+p2.getAge());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
