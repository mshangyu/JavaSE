

public class Test{
	public static void main(String[] args){
		//Scanner sc=new Scanner(System.in);
		//System.out.println("??ê?è?ò???100μ?999????μ?êy");
		//int number=sc.nextInt();

		for(int i=100;i<1000;i++){
			int ge=i%10;
			int shi=i/10%10;
			int bai=i/10/10%10;
			// System.out.println();
			//System.out.println("x是"+x+"各位是"+ge+"十位是"+shi+"bai位是"+bai);
			// System.out.println();
			// System.out.println(bai);
		
			if(i==(ge*ge*ge+shi*shi*shi+bai*bai*bai)){
				System.out.println(i);
			}
		}
	}
}