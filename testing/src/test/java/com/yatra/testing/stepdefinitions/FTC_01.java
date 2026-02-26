package com.yatra.testing.stepdefinitions;

import org.testng.annotations.Test;

import com.yatra.testing.hooks.StartupTeardown;

public class FTC_01 extends StartupTeardown {
	@Test
	public void test() {
		System.out.println("Testing :)");
	}
}
