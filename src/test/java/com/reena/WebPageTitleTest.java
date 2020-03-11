package com.reena;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebPageTitleTest {
	
	
	private WebDriver driver;

	@BeforeClass
	public static void setupClass() {		
		WebDriverManager.phantomjs().setup();
	}
	
	@BeforeMethod
	public void launchDriver() {	
		driver = new PhantomJSDriver();
	}
	
	@Test
	public void test2() {
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		Assert.assertEquals("Google", title);
	}

	@AfterMethod
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}
	

}
