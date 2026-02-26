package com.yatra.testing.stepdefinitions;

import org.testng.annotations.Test;

import com.yatra.testing.hooks.StartupTeardown;

public class HTC_01 extends StartupTeardown {
	@Test
	public void test() {
		System.out.println("Testing :)");
	}
}
