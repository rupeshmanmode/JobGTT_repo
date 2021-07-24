package com.hrms.testscripts_extra;

import org.openqa.selenium.WebDriver;                                     //importing the packages
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.Reporter;                                               //importing testng packages
import org.testng.annotations.Test;
public class TestLoginlLogoutwithTestNG {
	@Test                                                                 // test starts from here
	public static void testcase5() throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();                           //giving the file path and calling the driver.
		driver.navigate().to("http://183.82.125.5/nareshit/login.php"); //navigating to the url
		driver.findElement(By.name("txtUserName")).sendKeys("admin");     //finding username textbox and sending data
		driver.findElement(By.name("txtPassword")).sendKeys("admin");     //finding password textbox and sending data
		driver.findElement(By.name("Submit")).click();                    //clicking on submit button
		Thread.sleep(3000);                                               //wait for 3 seconds
		System.out.println("Login completed");                            //printing in the console
		Reporter.log("Login completed");                                  //printing in the emailable report
		driver.findElement(By.linkText("Logout")).click();                //logout
		Reporter.log("Logout completed");	
		driver.close();                                                   //close the application
	}
	}

