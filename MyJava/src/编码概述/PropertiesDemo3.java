package �������;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo3 {
	public static void main(String[] args) {
		//Properties prop=new Properties()
		//System.out.prontln(prop);
		
		//public static Properties getProperties()
		Properties prop=System.getProperties(); //��ȡϵͳ����
		Set<String> set=prop.stringPropertyNames();
		for (String key : set) {
			String value=prop.getProperty(key);
			System.out.println(key+"----"+value);
		}

	}

}
