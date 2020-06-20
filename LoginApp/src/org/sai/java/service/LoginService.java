package org.sai.java.service;

import java.util.HashMap;

import org.sai.java.dto.User;

public class LoginService {
	
	
	HashMap<String,String> users = new HashMap<>();
	
	public LoginService()
	{
		users.put("sai","SaiKrishna");
		users.put("krishna","Kattari");
	}
	
	public boolean authenticate(String userId,String password)
	{
		
		 if(password == null || password.trim()=="")
		 {
			 return false;
		 }
		
		return true;
	}
	
	public User getUserDetails(String userId)
	{
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return user;
		
	}
	
	

}
