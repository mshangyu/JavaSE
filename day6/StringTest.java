//�Լ�дһ������ģ���û���¼
/*�û��� ���� ���� �ж� ������������*/
import java.util.*;
public class StringTest{
	public static void main(String[] args){
		String name="admin";
		String pwd="admin";
		
		for(int i=0;i<3;i++){     //�����λ��� ѭ������ ����û���������
		Scanner sc=new Scanner(System.in);
		System.out.println("�������û���");
		String username=sc.nextLine();
		System.out.println("����������");
		String password=sc.nextLine();
		
			if(name.equals(username)&&pwd.equals(password)){
				System.out.println("��½�ɹ�");
			}else{
				System.out.println("��½ʧ��");
			}
		}
		
	}
}