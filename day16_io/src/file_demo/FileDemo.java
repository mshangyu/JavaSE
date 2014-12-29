package file_demo;
/*File:java.io  ��ƽ̨�޹ص� Ŀ¼ �ļ�
 * 		������ɾ����������
 * File�ࣺ ����ֱ�ӷ��� ���ݱ�����---ʹ�����롢������������ݽ��в���
 * 
 * */
import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		//.��ǰ·��..��һĿ¼

		File file =new File(".");
		System.out.println(file);
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());//���ض����Ӧ�ľ���·��
		System.out.println(file.getAbsoluteFile());//���ؾ���·��
		System.out.println(file.getParent());
	
		//�����ļ�  ��ʱ�ļ�(�����Ǿ�̬�� ����ֱ��ʹ������������)
//		File tmpFile =File.createTempFile("tem_file", ".txt");
//		File tmp =File.createTempFile("tmp_file", ".txt", file);
//		//��jvm�˳���ʱ�� ɾ�� 
//		tmpFile.deleteOnExit();
//		tmp.deleteOnExit();
//		
//		//�����ļ�
//		File file2=new File("create_bycode");
//		//File file2=new File("create_bycode/sub_dir/sub_dir");  //�����Ǵ�����һ������  �������������ļ�
//		System.out.println(file2.createNewFile());
//		//��ͬһĿ¼���ܴ���ͬ�����ļ����ļ���
//		//file2.createNewFile();//������ ÿ��ֻ��ִ��һ��  ������һ��
//		//System.out.println(file2.mkdir());
//		//System.out.println(file2.mkdirs());
//		
//		System.out.println(file2.exists());
//		
//		//���file��ʾһ���ļ� ��ôlist����������null
//		String[] str_dir=file.list();
//		String[] str_file=file2.list();
//		//System.out.println("std_str?"+str_dir.equals(null)+"str_file?"+str_file.equals(null)); ���쳣 ���Ǿ�ֱ�����
//		System.out.println("std_str?"+str_dir+"str_file?"+str_file);
//		//������
//		System.out.println("��ӡ��ǰ·���µ��ļ� �ļ���");
//		for (String string : str_dir) {
//			System.out.println(string);
//		}
		
		File[] roots=file.listRoots();
		for (File root : roots) {
			System.out.println(root);
		}
	}

}