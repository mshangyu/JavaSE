package b_List;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		
		for(int i=0;i<5;i++){
			a1.add("it-"+i);     //自动装箱  基本数据类型 封装成 对象
		}
		
		//遍历方式四种
		
		for (int i=0;i<a1.size();i++){
			
		}
		
		for(Iterator iterator=a1.iterator();iterator.hasNext();){
			String object=(String)iterator.next();
			System.out.println(object);
		}
	
		for(Object object:a1){
			System.out.println(object);
		}
		
		
		Iterator iterator=a1.iterator();
		while(iterator.hasNext()){
			String object=(String)iterator.next();
			System.out.println(object);
		}
	}

}
