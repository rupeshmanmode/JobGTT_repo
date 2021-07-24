package com.hrms.testscripts_extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginLogoutWithComments {

	public static void main(String[] args) throws Exception {
		// To Launch Browser
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		//
		WebDriver driver = new ChromeDriver();
		//Enter URL 

				driver.get("http://183.82.125.5/nareshit/login.php"); 

				// Enter username 

				driver.findElement(By.name("txtUserName")).sendKeys("admin"); 

				//Enter password 

				driver.findElement(By.name("txtPassword")).sendKeys("admin"); 

				//enter submit button 

				driver.findElement(By.name("Submit")).click(); 

				Thread.sleep(2000); 

				// logout 

				driver.findElement (By.linkText ("Logout")); 

				driver.close(); 

		  

	}
}
