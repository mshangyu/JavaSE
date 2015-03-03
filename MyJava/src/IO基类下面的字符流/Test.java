package IO基类下面的字符流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) throws IOException {
//		FileOutputStream fos=new FileOutputStream("c:\\demo.txt");
//		fos.write(56);
//		fos.close();

		ArrayList a1=new ArrayList();
		a1.add("a");
		a1.add("b");
		a1.add("c");
		
		Iterator it=a1.iterator();
		while (it.hasNext()) {
			String s = (String)it.next();
			//不允许在迭代器里面修改
			//当方法检测到对象的并发修改，但不允许这种修改时，抛出此异常。
			if (s.equals("c")) {
				a1.add("c1");
			}
		}
		System.out.println(a1);
	}

}
