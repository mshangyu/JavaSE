package b_List;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		
		for(int i=0;i<5;i++){
			a1.add("it-"+i);     //�Զ�װ��  ������������ ��װ�� ����
		}
		
		//������ʽ����
		
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