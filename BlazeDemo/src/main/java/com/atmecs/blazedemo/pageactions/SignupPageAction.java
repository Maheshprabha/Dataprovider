package com.atmecs.blazedemo.pageactions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.atmecs.blazedemo.excel.UtilsTest;

import com.atmecs.blazedemo.readerlocation.ReaderLocation;


public class SignupPageAction {
	static Properties property;
	ReaderLocation read = new ReaderLocation(); 
	WebDriver driver;
        @BeforeTest  
		public void signupDetails() throws Exception {
			System.out.println("launch chrome");

			
		}

			@DataProvider(name="data")
			public Object[][] getDetails() throws IOException {
				String str="./src/test/resources/Userinformation.xlsx";
				Object data[][] = UtilsTest.excel(str);
				return data;
			}

		   @Test(dataProvider = "userdata")
			public void signUp (String username, String password) throws IOException, InterruptedException {
				driver.findElement(By.xpath("//a[@id='signin2']")).click();
				driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys(username);
				driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys(password);
				driver.findElement(By.xpath("//button[text()='Sign up']")).click();
          
				/*
				 * CommonHelpers.clickAction(driver,
				 * property.getProperty("loc_signupusername")); //enter user mail id
				 * CommonHelpers.sendText(driver,
				 * property.getProperty("loc_signupusernames"),Sendkeys("username"));
				 * 
				 * //enter user password CommonHelpers.sendText(driver,
				 * property.getProperty("loc_password"), property.getProperty("user_password"));
				 * 
				 * //click submit button CommonHelpers.clickAction(driver,
				 * property.getProperty("loc_signupbutton"));
				 */		}

		
		

}
