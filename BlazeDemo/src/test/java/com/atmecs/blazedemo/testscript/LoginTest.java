package com.atmecs.blazedemo.testscript;


import com.atmecs.blazedemo.baseclass.BaseClass;
import com.atmecs.blazedemo.pageactions.LoginPageAction;


public class LoginTest extends BaseClass {
	LoginPageAction login = new LoginPageAction();
	public void LoginDetails() throws Exception{
		login.loginDetails();
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

	


