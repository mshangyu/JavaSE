//�����λ���  ��ʾ��ʣ�༸�λ���
import java.util.*;
public class StringTest2{
	public static void main(String[] args){
		String name="admin";
		String pwd="admin";
		
		for(int i=0;i<3;i++){    
			//�Ӽ��������û���������
			Scanner sc=new Scanner(System.in);
			System.out.println("�������û���");
			String username=sc.nextLine();
			System.out.println("����������");
			String password=sc.nextLine();
			//�ж�
			if(name.equals(username)&&pwd.equals(password)){
				System.out.println("��½�ɹ�,����Խ�ȥ�������С��Ϸ��");
				Game.playGame();
				break;
			}else{
				if((2-i)==0){
					System.out.println("�˺ű��������������Ա��ϵ");
				}else{
				System.out.println("��½ʧ�ܣ��㻹��"+(2-i)+"�λ���");
				}
			}
		}
	
	}
}