import java.util.*;
public class Test2{
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("**********************");
	System.out.println("|   1.����һ��ѧ��   |");
	System.out.println("|   2.��ʾ����ѧ��   |");
	System.out.println("|   3.�˳�����       |");
	System.out.println("|���������ѡ��(1-3):|");
	System.out.println("**********************");
	System.out.println("���������ѡ��(1-3):");
	int choose=in.nextInt();
		switch(choose){
			case 1:
				System.out.println("����һ��ѧ��");
				break;
			case 2:
				System.out.println("��ʾ����ѧ��");
				break;
			case 3:
				System.out.println("�˳�����");
				break;
		}
	}
}