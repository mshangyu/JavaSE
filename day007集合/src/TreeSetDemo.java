import java.util.TreeSet;


public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("hello");
		ts.add("world");
		ts.add("java");
		ts.add("abcde");
		ts.add("zero");
		
		for(String ss:ts){
			System.out.println(ss);
		}

	}

}
