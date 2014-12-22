import java.util.ArrayList;
import java.util.Collection;


public class CollectionDemo {
	public static void main(String[] args) {
		String string="13913535174";
		char[] ss=string.toCharArray();
		int max=0;
		for (int i = 0; i < ss.length; i++) {
			int count=1;
			for (int j = i+1; j <ss.length; j++) {
				if (ss[i]==ss[j]) {
					count++;
				}
			}
			if (max<count) {
				max=count;	
			}			
		}
	}

	

}
