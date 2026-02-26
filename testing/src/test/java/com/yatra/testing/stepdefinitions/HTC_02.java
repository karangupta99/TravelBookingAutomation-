package com.yatra.testing.stepdefinitions;

import org.testng.annotations.Test;

import com.yatra.testing.hooks.StartupTeardown;

public class HTC_02 extends StartupTeardown {
	@Test
	public void test2() {
		System.out.println("Test 2 :)");
	}
}