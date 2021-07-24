package com.hrms.testscripts_extra;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hrms.lib.General;
import com.hrms.lib.ReadExcel;


public class AllTests extends General{

	
	@BeforeClass
	public void testTnitialzeBrowser() {
		// To Launch Browser
		System.setProperty("webdriver.chrome.driver",chrm_dr_path);
		driver = new ChromeDriver();
		//Enter URL 
		driver.get(url); 
	}
	
	@Test(priority=1)
	public void testUserLogin() throws IOException, Exception {
		ReadExcel re =  new ReadExcel();
		driver.findElement(By.name(loc_nm_uname)).sendKeys(re.getValueByCellAddress("A2"));
		// Enter password
		driver.findElement(By.name(loc_nm_pword)).sendKeys(re.getValueByCellAddress("B2"));
		driver.findElement(By.name(loc_btnlogin)).click(); 
		Thread.sleep(2000); 
	}
	
	@Test(priority=2)
	public void testAddEmployee() throws InterruptedException {
		driver.switchTo().frame(loc_frame); // enter into frame
		driver.findElement(By.xpath(loc_xp_addempclk)).click(); // clicking on add button
		driver.findElement(By.id(first_name)).sendKeys(add_emp_name); // entering last name
		driver.findElement(By.name(first_name)).sendKeys(add_emp_name); // entering first name
		driver.findElement(By.id(save_btn)).click(); // clicking on save button
		//System.out.println("Added employee");// printing the status
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(back_btn)).click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=3)
	public void testDeleteEmployee() throws InterruptedException {
		//driver.switchTo().frame("rightMenu");	
		Select sl = new Select(driver.findElement(By.name(loc_drpdwn)));
		
		sl.selectByVisibleText(slct_fst_nm_indltemp);
		
		driver.findElement(By.name("loc_name")).sendKeys(dlt_emp_nm);
		
		driver.findElement(By.xpath(loc_xp_fname)).click();
		
		driver.findElement(By.xpath(loc_xp_alchk)).click();
		
		driver.findElement(By.xpath(loc_xp_dlt)).click();
		
		Thread.sleep(3000);
	    System.out.println("value is deleted");
	    driver.switchTo().defaultContent();                                   
	         
	}
	
	@Test(priority=4)
	public void testLogout() {
		driver.findElement (By.linkText (logout_l)); 

		driver.close(); 
	}
}
