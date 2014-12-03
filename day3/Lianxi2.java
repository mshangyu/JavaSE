public class Lianxi2{
	public static void main(String args[]){
		
		for(int i=101;i<=200;i+=2){
			boolean b=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					b=false;
					break;
				}
			}
			if(b){
				System.out.println("ÖÊÊýÊÇ£º"+i);
			
			}
			
		
		}	
	
	}
}