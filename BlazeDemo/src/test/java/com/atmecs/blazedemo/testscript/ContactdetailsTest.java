package com.atmecs.blazedemo.testscript;



import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.blazedemo.baseclass.BaseClass;
import com.atmecs.blazedemo.excel.UtilsTest;
import com.atmecs.blazedemo.pageactions.ContactDetailsPageAction;


public class ContactdetailsTest extends BaseClass {
	@DataProvider(name="data")
	public Object[][] getDetails() throws IOException {
		Object data[][] = UtilsTest.excel("contactdetails");
		return data;
	}
	@Test(dataProvider="userdata")
     public void contactTest(String mailid ,String name, String message) throws Exception {
		ContactDetailsPageAction contact = new ContactDetailsPageAction();

		contact.contactDetails();
	}
	
	
	
	
	
	
	
	
/*	static Properties property;
	ReaderLocation read = new ReaderLocation(); 
	
		public void contactDetails() throws Exception {
			System.out.println("launch chrome");
			property = ReaderLocation.readLocation(FilePath.locator_path);
			property = ReaderLocation.readLocation(FilePath.User_path);

	    //
        CommonHelpers.clickAction(driver, property.getProperty("loc_contact"));
        //enter user mail id 
        CommonHelpers.sendText(driver, property.getProperty("loc_recipientmail"), property.getProperty("user_recipientmailid"));
        
        //enter user password
        CommonHelpers.sendText(driver, property.getProperty("loc_recipientmails"), property.getProperty("user_recipientname"));
        
        CommonHelpers.sendText(driver, property.getProperty("loc_text"), property.getProperty("user_text"));

        
        //click submit button
        CommonHelpers.clickAction(driver,  property.getProperty("loc_contactbutton"));
*/		}


