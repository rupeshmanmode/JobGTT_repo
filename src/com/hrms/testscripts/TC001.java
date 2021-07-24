package com.hrms.testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001 {

	General gn = new General();
	
	@Test(priority=1)
	public void testLoginLogout() throws IOException, Exception {
		
		gn.openBrowser();
		gn.login();
		gn.logout();
		gn.closeBrowser();
	}

}
