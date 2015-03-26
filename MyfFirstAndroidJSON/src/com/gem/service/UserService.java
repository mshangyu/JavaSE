package com.gem.service;

import java.util.List;

import com.gem.vo.User;

public interface UserService {
	//select
	String  getUserByName(String userName,String password);
	
	List<User> getAllUser();
}
