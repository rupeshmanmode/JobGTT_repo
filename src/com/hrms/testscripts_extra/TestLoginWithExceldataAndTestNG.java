package com.hrms.testscripts_extra; 

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.hrms.lib.ReadExcel;

import jxl.read.biff.BiffException;

public class TestLoginWithExceldataAndTestNG
{

public static void main(String[] args) throws Exception {
	TestloginWithExcel();
}
@Test
public static void TestloginWithExcel() throws Exception {
	ReadExcel testReadExcel = new ReadExcel();
	String UserName = testReadExcel.getValueByCellAddress("A2");
	String PassWord = testReadExcel.getValueByCellAddress("B2");
	
	
	
     // To Launch Browser
	System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
	//
	WebDriver driver = new ChromeDriver();
	//Enter URL 

			driver.get("http://183.82.125.5/nareshit/login.php"); 

			// Enter username 

			driver.findElement(By.name("txtUserName")).sendKeys(UserName); 

			//Enter password 

			driver.findElement(By.name("txtPassword")).sendKeys(PassWord); 

			//enter submit button 

			driver.findElement(By.name("Submit")).click(); 

			Thread.sleep(2000); 

			// logout 

			driver.findElement (By.linkText ("Logout")); 

			driver.close();

}
}

