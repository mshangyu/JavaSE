import java.util.ArrayList;
import java.util.Collection;


public class ColectionHome {
	public static void main(String[] args) {
		int max=0;
		Collection co = new ArrayList();
		co.add("1391353517433");
		String[] a = new String[co.size()];
		co.toArray(a);
		char[] b = a[0].toCharArray();
		for (int i = 0; i < b.length; i++) {
			int count=1;
			for (int j = i+1; j < b.length; j++) {
				if (b[i]==b[j]) {
					count++;
				}
			}
			if (max<count) {
				max=count;	
			}			
		}
		System.out.println(max);
	}

}

	