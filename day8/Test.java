

public class Test{
	public static void main(String[] args){
		//Scanner sc=new Scanner(System.in);
		//System.out.println("??��?��?��???100��?999????��?��y");
		//int number=sc.nextInt();

		for(int i=100;i<1000;i++){
			int ge=i%10;
			int shi=i/10%10;
			int bai=i/10/10%10;
			// System.out.println();
			//System.out.println("x��"+x+"��λ��"+ge+"ʮλ��"+shi+"baiλ��"+bai);
			// System.out.println();
			// System.out.println(bai);
		
			if(i==(ge*ge*ge+shi*shi*shi+bai*bai*bai)){
				System.out.println(i);
			}
		}
	}
}