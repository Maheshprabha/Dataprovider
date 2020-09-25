package com.atmecs.blazedemo.testscript;


import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.blazedemo.baseclass.BaseClass;
import com.atmecs.blazedemo.excel.UtilsTest;
import com.atmecs.blazedemo.pageactions.SignupPageAction;


public class SignupTest extends BaseClass {
	@DataProvider(name="data")
	public Object[][] getDetails() throws IOException {
		String str="./src/test/resources/Userinformation.xlsx";
		Object data[][] = UtilsTest.excel(str);
		return data;
	}
	@Test(dataProvider="userdata")
	public void signup(String username, String password) throws Exception {
		SignupPageAction signup = new SignupPageAction();
        signup.signupDetails(username,password);
	}
}

/*	static Properties property;
	ReaderLocation read = new ReaderLocation(); 
	
		public void signupDetails() throws Exception {
			System.out.println("launch chrome");
			property = ReaderLocation.readLocation(FilePath.locator_path);
			property = ReaderLocation.readLocation(FilePath.User_path);

	    //
        CommonHelpers.clickAction(driver, property.getProperty("loc_signupusername"));
        //enter user mail id 
        CommonHelpers.sendText(driver, property.getProperty("loc_signupusernames"), property.getProperty("user_signupdata"));
        
        //enter user password
        CommonHelpers.sendText(driver, property.getProperty("loc_password"), property.getProperty("user_password"));
        
        //click submit button
        CommonHelpers.clickAction(driver,  property.getProperty("loc_signupbutton"));
*/

		

