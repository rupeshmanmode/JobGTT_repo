package com.hrms.lib;
import java.io.File;
import java.net.URL;

import org.openqa.selenium.WebDriver;

public class Global {
	
	public WebDriver driver;
	// Constants==========================
	public String url = "http://183.82.125.5/nareshit/login.php";
	public String first_name = "txtEmpFirstName";
	public String last_name = "txtEmpLastName";
	public String add_emp_Lname = "Manmode";
	public String add_emp_name = "Rupesh";
	public String dlt_emp_nm = "rupesh";
	public String chrm_dr_path = "D:\\chromedriver1\\chromedriver.exe"; 
	public String exl_file_path = "D:\\rajesh\\rajesh2\\Booktestng.xls";
	
	// Locators +=========================
	public String loc_nm_uname = "txtUserName"; 
	public String loc_nm_pword =  "txtPassword";
	public String loc_btnlogin = "Submit";
	public String loc_frame = "rightMenu";
	public String save_btn = "btnEdit";
	public String back_btn = "//input[@value='Back']";
	public String loc_xp_fname = "//input[@value='Search']";
	public String loc_drpdwn = "loc_code";
	public String loc_xp_srchbtn = "Search";
	public String loc_xp_alchk = "//input[@name='allCheck']";
	public String loc_xp_dlt = "//input[@value='Delete']";
	public String logout_l= "Logout";
	public String loc_xp_addempclk = "//input[@value='Add']";
	public String slct_fst_nm_indltemp = "Emp. First Name";
}
