package com.stctv.qa.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.stctv.qa.base.TestBase;
import com.stctv.qa.pages.LoginPage;
import com.stctv.qa.pages.SignUpPage;
import com.stctv.qa.util.TestUtil;

public class LoginPageTest extends TestBase {

	LoginPage loginpage;
	Logger log = Logger.getLogger(LoginPageTest.class);

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();

	}

	// validate the title of the application in login page
	@Test
	public void loginPageTitleTest() {
		String loginPageTitle = loginpage.validateLoginPageTitle();
		log.info("login page title is ---------->"+loginPageTitle);
		Assert.assertEquals(loginPageTitle, TestUtil.LOGINPAGETITLE);
	}
	
	//Validate whether we can select country Bahrain
	@Test
	public void validateCountryBahrain() throws InterruptedException {
		String actualcountry =loginpage.selectBahrain().toLowerCase();
		log.info("Actual Country is ----->"+actualcountry);
		String expectedcountry = "bahrain";
		log.info("Expected Country is ----->"+expectedcountry);
		Assert.assertEquals(actualcountry, expectedcountry);
		
	}
	
	//Validate whether we can select country ksa
	@Test
	public void validateCountryKSA() throws InterruptedException {
		String actualcountry =loginpage.selectKSA().toLowerCase();
		log.info("Actual Country is ----->"+actualcountry);
		String expectedcountry = "ksa";
		log.info("Expected Country is ----->"+expectedcountry);
		Assert.assertEquals(actualcountry, expectedcountry);
		
	}
	
	
	//Validate whether we can select country kuwait
	@Test
	public void validateCountryKuwait() throws InterruptedException {
		String actualcountry =loginpage.selectKuwait().toLowerCase();
		log.info("Actual Country is ----->"+actualcountry);
		String expectedcountry = "kuwait";
		log.info("Expected Country is ----->"+expectedcountry);
		Assert.assertEquals(actualcountry, expectedcountry);
		
	}
	

	//Validate whether the SAR Price displayed for lite package is correct
	@Test
	public void validateLitePackagePriceForSAR() throws InterruptedException {
		int price = loginpage.litePackagePriceinSAR();
		log.info("Lite Package price is: "+price+"SAR");
		Assert.assertEquals(price, 15);
	}
	

	//Validate whether the SAR Price displayed for classic package is correct
	@Test
	public void validateClassicPackagePriceForSAR() throws InterruptedException {
		int price = loginpage.classicPackagePriceinSAR();
		log.info("CLassic Package price is: "+price+"SAR");
		Assert.assertEquals(price, 25);
	}

	//Validate whether the SAR Price  displayed for premium package is correct
	@Test
	public void validatepremiumPackagePriceForSAR() throws InterruptedException {
		int price = loginpage.premiumPackagePriceinSAR();
		log.info("Premium Package price is: "+price+"SAR");
		Assert.assertEquals(price, 60);
	}


	//Validate whether the KWD Price displayed for lite package is correct
		@Test
		public void validateLitePackagePriceForKWD() throws InterruptedException {
			String price = loginpage.litePackagePriceinKWD();
			log.info("Lite Package price is: "+price+"KWD");
			String expectedPrice = "1.2";
			Assert.assertEquals(price, expectedPrice);
		}
		

		//Validate whether the KWD Price displayed for classic package is correct
		@Test
		public void validateClassicPackagePriceForKWD() throws InterruptedException {
			String price = loginpage.classicPackagePriceinKWD();
			log.info("Classic Package price is: "+price+"KWD");
			String expectedPrice = "2.5";
			Assert.assertEquals(price, expectedPrice);
		}

		//Validate whether the KWD Price  displayed for premium package is correct
		@Test
		public void validatepremiumPackagePriceForKWD() throws InterruptedException {
			String price = loginpage.premiumPackagePriceinKWD();
			log.info("Premium Package price is: "+price+"KWD");
			String expectedPrice = "4.8";
			Assert.assertEquals(price, expectedPrice);
		}

		//Validate whether the BHD Price displayed for lite package is correct
		@Test
		public void validateLitePackagePriceForBHD() throws InterruptedException {
			String price = loginpage.litePackagePriceinBHD();
			log.info("Lite Package price is: "+price+"BHD");
			String expectedPrice = "2.0";
			Assert.assertEquals(price, expectedPrice);
		}
		

		//Validate whether the BHD Price displayed for classic package is correct
		@Test
		public void validateClassicPackagePriceForBHD() throws InterruptedException {
			String price = loginpage.classicPackagePriceinBHD();
			log.info("CLassic Package price is: "+price+"BHD");
			String expectedPrice = "3.0";
			Assert.assertEquals(price, expectedPrice);
		}

		//Validate whether the BHD Price  displayed for premium package is correct
		@Test
		public void validatepremiumPackagePriceForBHD() throws InterruptedException {
			String price = loginpage.premiumPackagePriceinBHD();
			log.info("Premium Package price is: "+price+"BHD");
			String expectedPrice = "6.0";
			Assert.assertEquals(price, expectedPrice);
		}
	
	//Validate the subscription type is lite
	@Test
	public void subscriptionTypeLite() {
		String expectedResponse = "lite";
		String actualResponse = loginpage.subscriptionTypeLite().toLowerCase();
		log.info("Subscription Type is :" +actualResponse );
		Assert.assertEquals(actualResponse, expectedResponse);
		
	}
	
	//Validate the subscription type is Classic
	@Test
	public void subscriptionTypeClassic() {
		String expectedResponse = "classic";
		String actualResponse = loginpage.subscriptionTypeClassic().toLowerCase();
		log.info("Subscription Type is :" +actualResponse );
		Assert.assertEquals(actualResponse, expectedResponse);
		
	}
	
	//Validate the subscription type is Premium
	@Test
	public void subscriptionTypePremium() {
		String expectedResponse = "premium";
		String actualResponse = loginpage.subscriptionTypePremium().toLowerCase();
		log.info("Subscription Type is :" +actualResponse );
		Assert.assertEquals(actualResponse, expectedResponse);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
