public class ArgsTest{
	public static void main(String[] args){
		//输出args数组的长度
		System.out.println(args.length);
		//遍历数组的每个元素
		for(String arg:args){
			System.out.println(arg);
		}
		
		/* for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		} */
	}
}

//for each 循环