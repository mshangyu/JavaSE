//����¼��һ�������ַ��� ��Ӣ����� �Ѹ��ַ���������ĸ��д ����ȫ��Сд

import java.util.*;
public class StringTest4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String line=sc.nextLine();
		
		//��ȡ�ַ����õ���һ���ַ����ַ���
		String s1=line.substring(0,1);
		//��ȡ�ַ����õ����˵�һ���Ժ���ַ���
		String s2=line.substring(1);
		//��һ����д �����Сд
		String s3=s1.toUpperCase()+s2.toLowerCase();
		
		System.out.println(s3);
	}
}