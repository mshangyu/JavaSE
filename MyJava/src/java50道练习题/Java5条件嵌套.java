
/*��Ŀ�����������������Ƕ������ɴ��⣺
 ѧϰ�ɼ�> =90�ֵ�ͬѧ��A��ʾ��
 60-89��֮�����B��ʾ��60�����µ���C��ʾ��
 * 
 * */
package java50����ϰ��;

import java.util.Scanner;

public class Java5����Ƕ�� {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("������ѧ���ĳɼ�");
		int score=sc.nextInt();
		if (score>=90) {
			System.out.println("��ĳɼ�ΪA");
		}else if(score>=60) {
			System.out.println("��ĳɼ�ΪB");
		}else {
			System.out.println("��ĳɼ�ΪC");
		}

	}

}
