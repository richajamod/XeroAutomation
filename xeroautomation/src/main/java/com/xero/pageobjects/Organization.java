package com.xero.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Organization {

	WebDriver driver;

	public Organization(WebDriver WebDriver) {

		driver = WebDriver;

	}
	public void clickMyXero() {
		
		driver.findElement(By.cssSelector(".xn-h-org")).click();
	}
	public void clickXero() {
		
		driver.findElement(By.cssSelector(".myxero-link")).click();
	}
	public void clickAddOrg() {
		
		driver.findElement(By.cssSelector("#ext-gen1042")).click();
	}
	public void addName() {
		driver.findElement(By.cssSelector("#text-1022-inputEl")).sendKeys("self");
	}
}
