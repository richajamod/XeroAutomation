package com.xero.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUp {

	WebDriver driver;

	public SignUp(WebDriver WebDriver) {

		driver = WebDriver;

	}
	
	public String getPageHeader() {
		
		String header = driver.findElement(By.cssSelector("h2.title")).getText();
		return header;
		
	}
	public String termsOfUse() {
		
		String header1 = driver.findElement(By.cssSelector("h1.title")).getText();
		return header1;
		
	}
	
	public String privacyPolicy() {
		
		String head = driver.findElement(By.cssSelector("h1.title")).getText();
		return head;
		
	}
	
	public void enteFirstname(String firstname) {
		driver.findElement(By.cssSelector(".signup-form-firstname > label:nth-child(1) > input:nth-child(2)")).sendKeys(firstname);
		
	}	
	
	public void enterLastname(String lastname) {
		driver.findElement(By.cssSelector(".signup-form-lastname > label:nth-child(1) > input:nth-child(2)")).sendKeys(lastname);
		
	}
	
	public void enterEmail(String email) {
		driver.findElement(By.cssSelector(".signup-form-email > label:nth-child(1) > input:nth-child(2)")).sendKeys(email);
		
	}
	
	public void enterNumber(String number) {
		driver.findElement(By.cssSelector(".signup-form-phone > label:nth-child(1) > input:nth-child(2)")).sendKeys(number);
		
	}
	
	public void selectcountryName(String country) {
		
		Select select = new Select(driver.findElement(By.tagName("LocationCode")));
		select.selectByVisibleText(country);	
	}
	
	
	public void checkBoxAgree() {
		driver.findElement(By.cssSelector("label.text > input:nth-child(1)")).click();
	}
	
	public void clickGetStartedBtn() {
		driver.findElement(By.cssSelector(".g-recaptcha-submit")).click();
	}
	
	public String getErrorMsg() {
		String errorMsg = driver.findElement(By.cssSelector("#signup-form-error-message-1")).getText();
		return errorMsg;
	}
	
	public void termOfUse() {
		
		driver.findElement(By.cssSelector(".glf-quick > li:nth-child(2) > a:nth-child(1)")).click();
	}
	
	public void clickPrivacy() {
		
		driver.findElement(By.cssSelector(".glf-quick > li:nth-child(3) > a:nth-child(1)")).click();
	}
	
	public void clickOfferDetails() {
		driver.findElement(By.cssSelector("label.text > a:nth-child(4)")).click();
	}
	
	public void clickAccountantOrBookkeeper() {
		driver.findElement(By.cssSelector(".component > p:nth-child(1) > a:nth-child(1)")).click();
	}

	public String offerDetailsHeader() {
		
		String header = driver.findElement(By.cssSelector("h2.title")).getText();
		return header;
		
	}
	public String letsGetstartedHeader() {
		
		String header = driver.findElement(By.cssSelector(".title-2")).getText();
		return header;
		
	}
}
