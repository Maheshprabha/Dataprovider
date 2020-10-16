package com.atmecs.blazedemo.testscript;


import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.blazedemo.baseclass.BaseClass;
import com.atmecs.blazedemo.excel.UtilsTest;
import com.atmecs.blazedemo.pageactions.LoginPageAction;


public class LoginTest extends BaseClass {
	@DataProvider(name="userdata")
	public Object[][] getDetails() throws IOException {
		Object data[][] = UtilsTest.excel("login");
		return data;
	}
	@Test(dataProvider="userdata")

	public void LoginDetails(String loginusername , String loginpassword) throws Exception{
		LoginPageAction login = new LoginPageAction();
        login.loginDetails(loginusername,loginpassword);
	}
	
	}
	
	
	
	
	
	
	
	
	
	

	
/*	static Properties property;
	ReaderLocation read = new ReaderLocation(); 
	
		public void loginDetails() throws Exception {
			property = ReaderLocation.readLocation(FilePath.locator_path);
			property = ReaderLocation.readLocation(FilePath.User_path);

	    
        CommonHelpers.clickAction(driver, property.getProperty("loc_login"));
        //enter user mail id 
        CommonHelpers.sendText(driver, property.getProperty("loc_username"), property.getProperty("user_mailid"));
        
        //enter user password
        CommonHelpers.sendText(driver, property.getProperty("loc_password"), property.getProperty("user_password"));
        
        //click submit button
        CommonHelpers.clickAction(driver,  property.getProperty("loc_submitbutton"));
*/

	


