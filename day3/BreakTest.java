public class BreakTest{
	public static void main(String args[]){
		int stop=4;
		for(int i=1;i<=10;i++){
			if(i==stop){
			
				//System.out.println("满足条件退出整个循环");
				//break;
				System.out.println("满足条件本次循环");
				continue;
			}
		
			
		System.out.println("i="+i);
		
		}	
	
	}

}