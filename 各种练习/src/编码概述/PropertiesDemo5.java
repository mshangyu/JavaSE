package �������;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import IO����������ַ���.FileWriteDemo;

/*
 * public void store(OutputStream out,String comments)
 * public void store(Writer writer,String comments)
 * 
 * load:���ؽ���
 * store:�������
 * */
public class PropertiesDemo5 {
	public static void main(String[] args) throws IOException {
		//�������϶���
		Properties prop=new Properties();
		//���Ԫ��
		prop.setProperty("��ɽ��", "ףӢ̨");
		prop.setProperty("����ŷ", "����Ҷ");
		prop.setProperty("����", "����ϼ");
		
		//public void store(Writer writer,String comments)
		prop.store(new FileWriter("ql.txt"), null);
		
	}

}
