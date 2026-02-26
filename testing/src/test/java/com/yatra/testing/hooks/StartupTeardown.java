package com.yatra.testing.hooks;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class StartupTeardown {
	@BeforeSuite
	public void startUp() {
		System.out.println("Start up suit");
	}
	
	@BeforeTest
	public void startBrowser() {
		System.out.println("Browser start");
	}

	@AfterTest
	public void stopBrowser() {
		System.out.println("Browser stop");
	}

	@AfterSuite
	public void tearDown() {
		System.out.println("Tear down suit");
	}
}
