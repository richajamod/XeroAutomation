package com.xero.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	WebDriver driver;

	public Login(WebDriver webDriver) {

		driver = webDriver;

		driver.get("https://login.xero.com/");
	}

	public void enterUsername(String username) {
		driver.findElement(By.cssSelector("#email")).sendKeys(username);
		
	}

	public void enterPassword(String password) {
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		
	}

	public void clickLogin() {
		driver.findElement(By.cssSelector("#submitButton")).click();
	}

	public String getErrorMsg() {
		String ErrorMsg = driver.findElement(By.cssSelector("div.x-boxed:nth-child(4)")).getText();
		return ErrorMsg;
	}

	public void clickForgotPassword() {

		driver.findElement(By.cssSelector(".forgot-password-advert")).click();
	}

	public String getForgottenPasswordMsg() {

		String msg = driver.findElement(By.cssSelector("div.x-boxed:nth-child(1) > h2:nth-child(1)")).getText();
		return msg;

	}
	
	public void clickTryXeroForFree() {
		
		driver.findElement(By.cssSelector("p.center:nth-child(1) > a:nth-child(1)")).click();
	}
	
	
}
