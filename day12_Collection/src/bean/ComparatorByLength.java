package bean;

import java.util.Comparator;


//∞¥string≥§∂»≈≈–Ú
public class ComparatorByLength implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		int res=s1.length()-s2.length();
		//return res==0?s1.length()-s2.length():res; 
//		if(res==0){
//			return s1.compareTo(s2);
//		}else{
//			return res;
//		}
		return res==0? s1.compareTo(s2): res;
		
		
		
		
		
	}

	

	

	

}
