package �������;

import java.util.Properties;
import java.util.Set;

/*Properties:
 * Properties: ���ʾ��һ���־õ����Լ�
 * Properties: �ɱ��������л�����м���
 * �����б���ÿ���������Ӧֵ����һ���ַ���
 * 
 * ��ΪMap���ϵ�ʹ�ã�
 * 
 * */
public class PropertiesDemo {
	public static void main(String[] args) {
		//�������϶���
		Properties prop=new Properties();
		
		//�洢����
		prop.put("it001", "hello");
		prop.put("it002", "world");
		prop.put("it003", "java");
		
		//����
		Set<Object>  set=prop.keySet();
		for (Object key : set) {
			Object value=prop.get(key);
			System.out.println(key+"==="+value);
		}
	}

}
