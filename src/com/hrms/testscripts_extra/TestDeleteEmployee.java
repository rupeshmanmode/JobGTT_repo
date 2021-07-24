package com.hrms.testscripts_extra;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class TestDeleteEmployee {
		public static void main(String args[]) throws Exception { 
		    System.setProperty("webdriver.chrome.driver","D:\\\\ChromeDriver\\\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    //Enter URL
			driver.navigate().to("http://183.82.125.5/nareshit/login.php"); 	 
			Thread.sleep(2000); 
			//Enter username
			driver.findElement(By.name("txtUserName")).sendKeys("admin"); 
			//Enterpassword
			driver.findElement(By.name("txtPassword")).sendKeys("admin");  
			//Enter submit
			driver.findElement(By.name("Submit")).click();				        
			Thread.sleep(2000);
			//delete employee
			
			driver.switchTo().frame("rightMenu");	
			Select sl = new Select(driver.findElement(By.name("loc_code")));
			sl.selectByVisibleText("Emp. First Name");
			
			driver.findElement(By.name("loc_name")).sendKeys("rupesh");
			
			
			driver.findElement(By.xpath("//input[@value='Search']")).click();
			
			driver.findElement(By.xpath("//input[@name='allCheck']")).click();
			
			driver.findElement(By.xpath("//input[@value='Delete']")).click();
			
			Thread.sleep(3000);
		    System.out.println("value is deleted");
		    driver.switchTo().defaultContent();                                   
		    driver.findElement(By.linkText("Logout")).click();                     
		    Thread.sleep(2000);
		    System.out.println("logout completed");
		    driver.close();                                                  
		}
		
	}
