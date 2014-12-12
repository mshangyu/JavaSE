import java.util.*;
import java.io.FileOutputStream;
public class SystemTest{
	public static void main(String[] args) throws Exception{
		//��ȡϵͳ���еĻ�������
		Map<String,String> env=System.getenv();
		for(String name:env.keySet()){
			System.out.println(name+"--->"+env.get(name));
		}
		//��ȡָ������������ֵ
		System.out.println(System.getenv("JAVA_HOME"));
		//��ȡ���е�ϵͳ����
		Properties props=System.getProperties();
		//�����е�ϵͳ���Ա��浽props��txt�ļ���
		props.store(new FileOutputStream("props.txt"),"System Proerties");
		//����ض���ϵͳ����
		System.out.println(System.getProperty("os.name"));
		
	}
}