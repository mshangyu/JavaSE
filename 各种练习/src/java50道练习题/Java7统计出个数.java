
//����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
package java50����ϰ��;

import java.util.Scanner;

public class Java7ͳ�Ƴ����� {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ַ�");
		String s=sc.nextLine();
		char[] a=s.toCharArray();//ת�����ַ��������ʽ
		//������ַ�������б���
		int yinwen=0;
		int kongge=0;
		int shuzi=0;
		int qita=0;
		for (char bb : a) {
			if (bb==' ') {
				kongge++;
				//System.out.println("�ո�ĸ����ǣ�"+kongge);
			}else if (bb<='9' && bb>='0') {
				shuzi++;
				//System.out.println("���ֵĸ����ǣ�"+shuzi);
			} else if(bb>='a'&&bb<='z'||bb<='Z'&&bb>='A'){
				yinwen++;
				//System.out.println("Ӣ����ĸ�ĸ����ǣ�"+yinwen);
			}else{
				qita++;
				//System.out.println("�����ַ��ĸ����ǣ�"+qita);
			}
		}
		System.out.println("�ո�ĸ����ǣ�"+kongge);
		System.out.println("���ֵĸ����ǣ�"+shuzi);
		System.out.println("Ӣ����ĸ�ĸ����ǣ�"+yinwen);
		System.out.println("�����ַ��ĸ����ǣ�"+qita);
		
	}

}
