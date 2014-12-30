package serialize.obj;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 1�������л�����
 * 2�����л���
 * 		a�����������ObjectOutputStream����:  ������==���ڽڵ�
 * 		b��IO��writeObject()  
 * 
 * [�ڴ���]����---����IO�����----��������----��io������---���ڴ�
 * 					���л�                                      �����л�
 * 
 * */
public class WriteObject {
	public static void main(String[] args) {
		Person p=new Person(100,"java");
		
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("obj.txt"));
			//io����
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
