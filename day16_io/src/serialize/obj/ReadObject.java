//�������л�      �������л�     �Զ������л�
package serialize.obj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*�����л���                                                                                      �ڵ���
 * 1��ObjectInputStream  ����������===������==����FileInputStream
 * 2��readObject()-----�� ֪�������� ��Ҫǿת
 * */
public class ReadObject {
	public static void main(String[] args) {
		//����� ������                                                                              ������ǽڵ���
		ObjectInputStream ois=null;
		try {
			ois = new ObjectInputStream(new FileInputStream("obj.txt"));
			Person p2=(Person)ois.readObject();//new ���캯��
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