import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

//�����û�����������

public class UserOperator {
	private static  ArrayList<User> array=new ArrayList<User>();
	
	
	
	public boolean login(String username,String password){
		boolean flag=false;
		for(User u:array){
			if(u.getUsername().equals(username)&&u.getPassword().equals(password)){
				flag=true;
				break;
				
			}
		}
		return flag;
		
	}
	 public void reigst(User user){
		ArrayList<User> array =new ArrayList<User>();
		array.add(user);
		//return null;
		
	}
	
}