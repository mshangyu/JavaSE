
import java.util.*;
public class Game{
	private Game(){}
	
	public static void playGame(){
		//ϵͳ����һ�������
		int number=(int)(Math.random()*100)+1;
		//����ϵͳ����
		int count=0;
		
		//������ʼ����
		int start=1;
		//�����������
		int end=100;
		
		while(true){
			//����¼������
			Scanner sc=new Scanner(System.in);
			System.out.println("������һ������("+start+"-"+end+"):");
			int guessNumber=sc.nextInt();
			//ͳ��һ��
			count++;
			//�Ƚ�
			if(guessNumber>number){
				System.out.println("��µ�����"+guessNumber+"����");
				end=guessNumber;
			}else if(guessNumber<number){
				start=guessNumber;
			}else{
				System.out.println("��ϲ��"+count+"�ξͲ�����");
				break;
			}
			
			
		}
		
	
	}
}