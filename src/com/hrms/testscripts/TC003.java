package com.hrms.testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC003 {
	General gn = new General();

	@Test(priority=3)
	public void testDeleteUser() throws IOException, Exception {
		gn.openBrowser();
		gn.login();
		gn.deleteEmployee();
		gn.logout();
		gn.closeBrowser();
}
}