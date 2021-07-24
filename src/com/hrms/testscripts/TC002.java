package com.hrms.testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {

	General gn = new General();

	@Test(priority=2)
	public void testAddUser() throws IOException, Exception {
		gn.openBrowser();
		gn.login();
		gn.addEmployee();
		gn.logout();
		gn.closeBrowser();

	}
}
