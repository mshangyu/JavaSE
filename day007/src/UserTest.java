import java.util.Scanner;

import sun.net.www.content.image.gif;


public class UserTest {
	public static void main(String[] args) {
		while(true){
			System.out.println("-----��ӭ����-----");
			System.out.println("1��½");
			System.out.println("2ע��");
			System.out.println("3�˳�");
		
			Scanner sc=new Scanner(System.in);
			System.out.println("���������ѡ��");
			String numberString=sc.nextLine();
			int number=Integer.parseInt(numberString);
		
			UserOperator uo=new UserOperator();
			switch(number){
			case 1:
				System.out.println("-------��ӭ����ע��ҳ��------");
				System.out.println("�������û�����");
				String username = sc.nextLine();
				System.out.println("����������");
				String password = sc.nextLine();
				//���ò�����Ĺ���
				//UserOperator uo=new UserOperator();
				boolean flag =uo.login(username, password);
				if(flag){
					System.out.println("��½�ɹ� ���Կ�ʼ�������С��Ϸ��");
					//Game g=new Game();
					//g.palyGame();
				}else{
					System.out.println("��½ʧ�ܣ������µ�½");
				}
				break;
			case 2:
				System.out.println("-------��ӭ����ע��ҳ��------");
				System.out.println("�������û�����");
				String newUsername = sc.nextLine();
				System.out.println("����������");
				String newPassword = sc.nextLine();
				
				User user =new User();
				user.setPassword(newPassword);
				user.setUsername(newUsername);
				//���ò�����Ĺ���
				//UserOperator uo=new UserOperator();
				uo.reigst(user);
				System.out.println("��ϲ��ע��ɹ�");
				break;
			case 3:
				
				break;
			default:
				System.out.println("ллʹ�ã���ӭ�´ι���");
				System.exit(0);
				break;
					
			}
		}
	}

}