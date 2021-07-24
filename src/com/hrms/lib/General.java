package com.hrms.lib;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.Log;

public class General extends Global {

	Log log = new Log();

	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", chrm_dr_path);
		driver = new ChromeDriver();
		// Enter URL
		driver.get(url);
		log.info("Application URL opened");
	}

	public void login() throws IOException, Exception {

		ReadExcel re = new ReadExcel();
		driver.findElement(By.name(loc_nm_uname)).sendKeys(re.getValueByCellAddress("A2"));
		// Enter password
		driver.findElement(By.name(loc_nm_pword)).sendKeys(re.getValueByCellAddress("B2"));
		// enter submit button
		driver.findElement(By.name(loc_btnlogin)).click();
		Thread.sleep(3000);
		log.info("User is logged into application");
	}

	public void logout() {
		driver.findElement(By.linkText(logout_l));
		log.info("Application logout completed");
	}

	public void closeBrowser() {

		driver.close();
		log.info("Browser closed");

	}

	public void addEmployee() throws InterruptedException {
		driver.switchTo().frame(loc_frame); // enter into frame
		driver.findElement(By.xpath(loc_xp_addempclk)).click(); // clicking on add button
		Thread.sleep(2000);
		driver.findElement(By.name(first_name)).sendKeys(add_emp_name); // entering last name
		driver.findElement(By.name(last_name)).sendKeys(add_emp_Lname); // entering first name
		driver.findElement(By.id(save_btn)).click(); // clicking on save button
		log.info("New employee added successfully");// printing the status
		Thread.sleep(3000);
		driver.findElement(By.xpath(back_btn)).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
	}

	public void deleteEmployee() throws InterruptedException {
		driver.switchTo().frame("rightMenu");
		Select sl = new Select(driver.findElement(By.name(loc_drpdwn)));

		sl.selectByVisibleText(slct_fst_nm_indltemp);

		driver.findElement(By.name("loc_name")).sendKeys(dlt_emp_nm);

		driver.findElement(By.xpath(loc_xp_fname)).click();

		driver.findElement(By.xpath(loc_xp_alchk)).click();

		driver.findElement(By.xpath(loc_xp_dlt)).click();

		Thread.sleep(3000);
		log.info("Employee details deleted successfully");
		driver.switchTo().defaultContent();

	}
}
