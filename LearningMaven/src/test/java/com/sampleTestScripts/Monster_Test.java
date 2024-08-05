package com.sampleTestScripts;

import org.testng.annotations.Test;

public class Monster_Test {
	
	@Test
	public void executeScripts() {
		System.out.println("Ram Ram Sa");
		String browserName = System.getProperty("bname");
		System.out.println(browserName);
		
		String username = System.getProperty("user");
		System.out.println(username);
		
	}

}
