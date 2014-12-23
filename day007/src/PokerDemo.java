import java.util.ArrayList;
import java.util.Collections;

import org.omg.CORBA.PUBLIC_MEMBER;


public class PokerDemo {
	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		
		String[] numbers={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] colors ={"黑桃","红桃","梅花","方块"};
		for (String color : colors) {
			for (String number : numbers) {
				array.add(color.concat(number));
			}
		}
		array.add("大王");
		array.add("小王");
		//洗牌
		Collections.shuffle(array);
		//发牌  有三个玩家 还有底牌三张
		ArrayList<String> nichangjie=new ArrayList<String>();
		ArrayList<String> huangjiaxin=new ArrayList<String>();
		ArrayList<String> chenliangquan=new ArrayList<String>();
		
		//底牌
		ArrayList<String>  dipai=new ArrayList<String>();
		
		for(int x=0;x<array.size();x++){
			if(x>=array.size()-3){
				dipai.add(array.get(x));
			}else if(x%3==0){
				nichangjie.add(array.get(x));
			}else if(x%3==1){
				huangjiaxin.add(array.get(x));
			}else if(x%3==2){
				chenliangquan.add(array.get(x));
			}
		}
		
		//遍历
		printPoker("倪昌杰",nichangjie);
		printPoker("黄家新",huangjiaxin);
		printPoker("陈良全",chenliangquan);
		printPoker("底牌",dipai);
	}	
		public static void printPoker(String name, ArrayList<String> array){
			System.out.println(name+"的牌是：");
			for (String str : array) {
				System.out.print(str+" ");
			}
			System.out.println();
		}
	

}
