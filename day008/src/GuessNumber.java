import java.util.Scanner;


public class GuessNumber {
	public static void main(String[] args) {
		
		
		int number=(int)Math.random()*100+1;
		int count=0;
		
		int start=1;
		int end=100;
		
		
		while(true){
			Scanner scanner=new Scanner(System.in);
			System.out.println("������һ������"+start+"--"+end);
			int guessnumber=scanner.nextInt();
			count++;
			if(guessnumber>number){
				System.out.println("��µ����ݴ���");
				end=guessnumber;
			}else if(guessnumber<number){
				System.out.println("��µ�����С��");
				start=guessnumber;
			}else{
				System.out.println("��ϲ��"+count+"�ξͲ����ˣ�");
				break;
			}
		}
	}

}
