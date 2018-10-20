package com.xero.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LaunchApp {

	WebDriver driver;

	public LaunchApp(WebDriver webDriver) {
		driver = webDriver;

		driver.get("https://www.xero.com/us/");

	}
	
	public void clickFreeTrialIcon() {
		driver.findElement(By.cssSelector(".global-ceiling-bar-cta2 > a:nth-child(1)")).click();
	}
	
}
