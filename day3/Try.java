import java.util.*;
public class Try{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		Random MyRandom=new Random();
		int A=MyRandom.nextInt(101);//����һ�������
		int number;
			do{
				System.out.println("���һ�µ������ɵ���");
				number=in.nextInt();//��Ҫ��ѭ�����ⶨ�� ���Դ˴�ֻ�Ǹ�ֵ
				if(number<A){
					System.out.println("С��");
				}else if(number>A){
					System.out.println("����");
				}
			}while(number!=A);//�˴���ѭ����������Ϊ ��µ����͵������ɵ�����һ�� �ͼ���ѭ������ ֱ�����Ϊֹ
		    System.out.println("��ϲ������");
			
	}
}