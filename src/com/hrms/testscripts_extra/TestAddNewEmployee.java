package com.hrms.testscripts_extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAddNewEmployee {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe"); // setting the path of
																								// driver in our system
		WebDriver driver = new ChromeDriver(); // calling the driver
		driver.navigate().to("http://183.82.125.5/nareshit/login.php"); // navigating to the link.
		Thread.sleep(2300); // wait statement
		driver.findElement(By.name("txtUserName")).sendKeys("admin"); // writing data in username textbox
		driver.findElement(By.name("txtPassword")).sendKeys("admin"); // writing data in password textbox
		driver.findElement(By.name("Submit")).click(); // click on login button
		Thread.sleep(2300); // wait for 2.3 seconds

		if (driver.getTitle().equals("OrangeHRM - New Level of HR Management")) // fetching the title by writing a
																				// condition
		{
			System.out.println("title is matched");
		} else {
			System.out.println("title mismatch");
		}

		driver.switchTo().frame("rightMenu"); // enter into frame
		driver.findElement(By.xpath("//input[@value='Add']")).click(); // clicking on add button
		driver.findElement(By.id("txtEmpLastName")).sendKeys("Manmode"); // entering last name
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Rupesh"); // entering first name
		driver.findElement(By.id("btnEdit")).click(); // clicking on save button
		System.out.println("Added employee"); // printing the status
		driver.switchTo().defaultContent(); // exit from the frame
		driver.findElement(By.linkText("Logout")).click(); // clicking on logout link
		System.out.println("LOGOUT"); // printing the logout status
		driver.close(); // closing the application

	}
}