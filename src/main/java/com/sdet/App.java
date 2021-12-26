package com.sdet;

import java.util.ResourceBundle;

public class App {

	public int userLogin(String in_user,String in_pwd){
		ResourceBundle bundle=ResourceBundle.getBundle("config");
		String uname=bundle.getString("username");
		String pwd=bundle.getString("password");
		if((in_user.equals(uname))&&(in_pwd.equals(pwd)))
			return 1;
		else
			return 0;
	}
}
