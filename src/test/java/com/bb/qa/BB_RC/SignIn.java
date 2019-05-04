package com.bb.qa.BB_RC;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class SignIn {
	Selenium selenium;

	@Test
	public void f() throws InterruptedException {
		selenium.click("id=navLogin");
		selenium.type("id=userID", "username");
		selenium.type("id=password", "password");
		selenium.click("id=login");
		Thread.sleep(5000);
		selenium.click("link=Log out");
	}

	@BeforeMethod
	public void beforeMethod() {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome",
				"http://test-app:5000");
		selenium.start();
		selenium.open("/");
		selenium.deleteAllVisibleCookies();
		selenium.windowMaximize();
		System.out.println("Selenium Remote control has been started ...");
	}

	@AfterMethod
	public void afterMethod() {
		selenium.stop();
		System.out.println("Selenium Remote control has been stopped ...");
	}

}
