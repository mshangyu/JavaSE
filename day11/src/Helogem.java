import java.util.Scanner;


public class Helogem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������γ̴��ţ�1-3��֮�������");
		Scanner in=new Scanner(System.in);
		int courseCode=in.nextInt();//�Ӽ�����������
		switch(courseCode){
		case 1:
			System.out.println("c#���");
			break;
		case 2:
			System.out.println("java���");
			break;
		case 3:
			System.out.println("sql���");
			break;
		default :
			System.out.println("��������");
		
		}
	}

}

/*
 */
