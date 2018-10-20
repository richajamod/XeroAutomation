package com.xero.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver WebDriver) {

		driver = WebDriver;

	}

	public String getHeaderText() {

		String header = driver.findElement(By.cssSelector(".xui-page-title")).getText();
		return header;

	}

	public void clickAccount() {
		
		driver.findElement(By.cssSelector("li.xn-h-menu:nth-child(2) > a:nth-child(1)")).click();
	}
	public void clickReports() {
		
		driver.findElement(By.cssSelector("li.xn-h-menu:nth-child(5) > a:nth-child(1)")).click();
	}
	
	public void clickContact() {
		
		driver.findElement(By.cssSelector("li.xn-h-menu:nth-child(6) > a:nth-child(1)")).click();
	}
	public void clickSettings() {
		
		driver.findElement(By.cssSelector("li.xn-h-menu:nth-child(7) > a:nth-child(1)")).click();
	}
	public void clickNewTab() {
		
		driver.findElement(By.cssSelector("#quicklaunchTab")).click();
	}
	public void clickFile() {
		
		driver.findElement(By.cssSelector(".files")).click();
	}
	public void clickNotify() {
		
		driver.findElement(By.cssSelector(".xn-h-header-info > li:nth-child(3)")).click();
		
	}
	public void clickSeach() {
		
		driver.findElement(By.cssSelector(".search")).click();
	}
	public void clickHelp() {
		
		driver.findElement(By.cssSelector(".help")).click();
	}
	public void clickLogout() {
		
		driver.findElement(By.cssSelector(".username")).click();
	}
	public void clickout() {
		
		driver.findElement(By.cssSelector("li.xn-h-profile-card-navigation-item:nth-child(3) > a:nth-child(1)")).click();
	}
	public void clickProfileArrow() {
		
		driver.findElement(By.cssSelector(".xn-h-user")).click();
	}
	public void clickProfileLink() {
		
		driver.findElement(By.cssSelector("li.xn-h-profile-card-navigation-item:nth-child(1) > a:nth-child(1)")).click();
	}
	public void clickUploadImage() {
		
		driver.findElement(By.cssSelector("#button-1041")).click();
	}
	public void clickBrowseBtn() {		
		driver.findElement(By.cssSelector(".x-form-file-input")).sendKeys("/Users/richirich/Desktop/pumpkin-patch.jpg");		
	}
	
	public void clickUpload() {
		driver.findElement(By.cssSelector("#button-1178")).click();
	}
}
