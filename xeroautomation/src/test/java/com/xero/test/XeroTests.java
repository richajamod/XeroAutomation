package com.xero.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.xero.pageobjects.HomePage;
import com.xero.pageobjects.LaunchApp;
import com.xero.pageobjects.Login;
import com.xero.pageobjects.Organization;
import com.xero.pageobjects.SignUp;

public class XeroTests extends BaseTest {

	String browser = "firefox";

	@Test(groups = { "LOGIN" })
	public void testcase01() {

		// init driver
		WebDriver driver = intializeDriver(browser);

		// load login
		Login login = new Login(driver);
		login.enterUsername("jamodricha@gmail.com");

		login.enterPassword("HimRich2018");

		login.clickLogin();

		HomePage homepage = new HomePage(driver);

		String expectedHeader = "Welcome to Xero";

		String header = homepage.getHeaderText();
		Assert.assertEquals(header, expectedHeader);

		closeDriver();

	}

	@Test(groups = { "LOGIN" })
	public void testcase02() {

		WebDriver driver = intializeDriver(browser);

		Login login = new Login(driver);
		login.enterUsername("jamodricha@gmail.com");

		login.enterPassword("abcd123");

		login.clickLogin();

		String ErrorMsg = login.getErrorMsg();

		String expectedErrorMsg = "Your email or password is incorrect";
		Assert.assertEquals(ErrorMsg, expectedErrorMsg);

		closeDriver();

	}

	@Test(groups = { "LOGIN" })
	public void testcase03() {

		WebDriver driver = intializeDriver(browser);

		Login login = new Login(driver);
		login.enterUsername("absc678@gmail.com");

		login.enterPassword("HimRich2018");

		login.clickLogin();

		String ErrorMsg = login.getErrorMsg();

		String expectedErrorMsg = "Your email or password is incorrect";
		Assert.assertEquals(ErrorMsg, expectedErrorMsg);

		closeDriver();

	}

	@Test(groups = { "LOGIN" })
	public void testcase04() {

		WebDriver driver = intializeDriver(browser);

		Login login = new Login(driver);

		login.clickForgotPassword();

		String errorMsg = login.getForgottenPasswordMsg();
		String forgoterrorMsg = "Forgotten your password?";
		Assert.assertEquals(errorMsg, forgoterrorMsg);

		closeDriver();

	}

	@Test(groups = { "SIGNUP" })
	public void testcase05() {

		WebDriver driver = intializeDriver(browser);

		Login login = new Login(driver);

		login.clickTryXeroForFree();

		SignUp signUp = new SignUp(driver);

		String headerOnSignUp = signUp.getPageHeader();

		Assert.assertEquals(headerOnSignUp, "30 day free trial");

		signUp.enteFirstname("ABC");
		signUp.enterLastname("XYZ");
		signUp.enterEmail("abc@xyz.com");
		signUp.enterNumber("4084084081");

		closeDriver();

	}

	@Test
	public void testcase06() {

		WebDriver driver = intializeDriver(browser);

		Login login = new Login(driver);

		login.clickTryXeroForFree();

		SignUp signUp = new SignUp(driver);

		String headerOnSignUp = signUp.getPageHeader();

		Assert.assertEquals(headerOnSignUp, "30 day free trial");

		signUp.enteFirstname("ABC");
		signUp.enterLastname("XYZ");
		signUp.enterEmail("abc@xyz.com");
		signUp.enterNumber("4084084081");

		signUp.checkBoxAgree();

		signUp.clickGetStartedBtn();

		signUp.getErrorMsg();

		closeDriver();

	}

	@Test
	public void testcase07() {

		WebDriver driver = intializeDriver(browser);

		Login login = new Login(driver);

		login.clickTryXeroForFree();

		SignUp signUp = new SignUp(driver);

		String headerOnSignUp = signUp.getPageHeader();
		Assert.assertEquals(headerOnSignUp, "30 day free trial");

		signUp.termOfUse();
		String termsOfUse = signUp.termsOfUse();
		Assert.assertEquals(termsOfUse, "Terms of use");

		driver.navigate().back();

		signUp.clickPrivacy();
		String privacyPolicy = signUp.privacyPolicy();
		Assert.assertEquals(privacyPolicy, "Privacy notice");

		closeDriver();
	}

	@Test
	public void testcase08() {

		WebDriver driver = intializeDriver(browser);

		LaunchApp launchApp = new LaunchApp(driver);
		launchApp.clickFreeTrialIcon();

		SignUp signUp = new SignUp(driver);
		signUp.clickOfferDetails();

		closeDriver();

	}

	@Test
	public void testcase09() {

		WebDriver driver = intializeDriver(browser);

		LaunchApp launchApp = new LaunchApp(driver);
		launchApp.clickFreeTrialIcon();

		SignUp signUp = new SignUp(driver);
		signUp.clickAccountantOrBookkeeper();

		String letgetstart = signUp.letsGetstartedHeader();
		Assert.assertEquals(letgetstart, "Let’s get started");
		closeDriver();

	}

	@Test(groups = { "LOGIN" })
	public void testcase10() {

		// init driver
		WebDriver driver = intializeDriver(browser);

		// load login
		Login login = new Login(driver);
		login.enterUsername("jamodricha@gmail.com");

		login.enterPassword("HimRich2018");

		login.clickLogin();

		HomePage homepage = new HomePage(driver);

		String expectedHeader = "Welcome to Xero";

		String header = homepage.getHeaderText();
		Assert.assertEquals(header, expectedHeader);

		homepage.clickAccount();
		homepage.clickReports();
		homepage.clickContact();
		homepage.clickSettings();
		homepage.clickNewTab();
		homepage.clickFile();
		driver.navigate().back();
		homepage.clickNotify();
		homepage.clickSeach();
		homepage.clickHelp();

		closeDriver();

	}

	@Test(groups = { "LOGIN" })
	public void testcase11() {

		// init driver
		WebDriver driver = intializeDriver(browser);

		// load login
		Login login = new Login(driver);
		login.enterUsername("jamodricha@gmail.com");

		login.enterPassword("HimRich2018");

		login.clickLogin();

		HomePage homepage = new HomePage(driver);

		String expectedHeader = "Welcome to Xero";

		String header = homepage.getHeaderText();
		Assert.assertEquals(header, expectedHeader);

		homepage.clickLogout();

		homepage.clickout();
		login.enterUsername("jamodricha@gmail.com");

		login.enterPassword("HimRich2018");
		closeDriver();
	}

	@Test(groups = { "LOGIN" })
	public void testcase12() {

		// init driver
		WebDriver driver = intializeDriver(browser);

		// load login
		Login login = new Login(driver);
		login.enterUsername("jamodricha@gmail.com");

		login.enterPassword("HimRich2018");

		login.clickLogin();

		HomePage homepage = new HomePage(driver);

		homepage.clickProfileArrow();
		homepage.clickProfileLink();
		homepage.clickUploadImage();
		homepage.clickBrowseBtn();
		homepage.clickUpload();
			
		
		closeDriver();
	}
	@Test(groups = { "LOGIN" })
	public void testcase13() {

		// init driver
		WebDriver driver = intializeDriver(browser);

		// load login
		Login login = new Login(driver);
		login.enterUsername("jamodricha@gmail.com");

		login.enterPassword("HimRich2018");

		login.clickLogin();

		Organization organization = new Organization(driver);
		
		organization.clickMyXero();
		organization.clickXero();
		organization.clickAddOrg();
		organization.addName();
		closeDriver();
		
		
	}
	
}
