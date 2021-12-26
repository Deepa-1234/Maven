package com.sdet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	@Test
	public void testLogin1(){
		App obj=new App();
		ResourceBundle b=ResourceBundle.getBundle("commonData");
		Assert.assertEquals(0, obj.userLogin(b.getString("username"),b.getString("invalidpwd")));
		
	}
	@Test
	public void testLogin2(){
		//		FileInputStream fis=new FileInputStream("./src/test/resources");
		//		Properties p=new Properties();
		//		p.load(fis);
		App obj=new App();
		ResourceBundle b=ResourceBundle.getBundle("commonData");
		Assert.assertEquals(1, obj.userLogin(b.getString("username"),b.getString("password")));	

	}
}
