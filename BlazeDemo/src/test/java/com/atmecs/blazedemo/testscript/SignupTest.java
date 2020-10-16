package com.atmecs.blazedemo.testscript;




import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.blazedemo.baseclass.BaseClass;
import com.atmecs.blazedemo.excel.UtilsTest;
import com.atmecs.blazedemo.pageactions.SignupPageAction;


public class SignupTest extends BaseClass {
	@SuppressWarnings("unused")
	@DataProvider(name="userdata")
	public Object[][] getDetails() throws Exception {
		@SuppressWarnings("unused")
		String username = UtilsTest.readData(0, 1);
		String password = UtilsTest.readData(1, 0);
         return new Object[][] {{"username" ,"password"},};
		//Object data[][] = UtilsTest.excel("./src/test/resources/Userinformation.xlsx");
		//return data;
	}
	@Test(dataProvider="userdata")
	public void signup(String username, String password) throws Exception {
		
		SignupPageAction signup = new SignupPageAction();
        signup.signupDetails(username,password);
	}
}


		

