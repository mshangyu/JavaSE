public class InstanceofTest{
	public static void main(String[] args){
		Person p=new Person("android",12);
		String str=new String("hello");
		
		if(str instanceof  Object ){   //object 
			System.out.println("str 是人类");
			
		}else{
			System.out.println("str 非人类");
		}
	}
}