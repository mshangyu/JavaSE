package �������;

import java.util.Properties;
import java.util.Set;

/*��ΪMap���ϵ����й��ܣ�
 * 	1����ӹ��ܣ�public object setProperty(String key,String value)
 * 2����ȡ���ܣ� public String getProperty(String key)
 * 			public Set<String> stringPropertyNames()
 * 
 * */
public class PropertiesDemo2 {
	public static void main(String[] args) {
		Properties prop=new Properties();
		
		prop.setProperty("lili", "23");
		prop.setProperty("liis", "30");
		prop.setProperty("wangwu", "90");
		
		//public Set<String> stringPropertyNames()
		Set<String> set=prop.stringPropertyNames();
		for (String key : set) {
			String value=prop.getProperty(key);
			System.out.println(key+"--"+value);
		}
	}

}
