package com.stctv.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stctv.qa.base.TestBase;
import com.stctv.qa.util.TestUtil;

public class LoginPage extends TestBase {

	// object repository/ page factory for login page

	@FindBy(id = "signin")
	WebElement signin;

	// @FindBy(xpath = "//a[@class = 'header-btns-country hide-mobile']")
	// WebElement selectcountry;

	@FindBy(xpath = "//a[@id = 'country-btn']")
	WebElement selectcountry;

	@FindBy(xpath = "//span[ contains(text() ,'Bahrain') and @class = 'countryName']")
	WebElement Bahrain;

	@FindBy(xpath = "//span[ contains(text() ,'KSA') and @class = 'countryName']")
	WebElement KSA;

	@FindBy(xpath = "//span[ contains(text() ,'Kuwait') and @class = 'countryName']")
	WebElement Kuwait;

//	@FindBy(xpath = "//parent::div[@class = 'packages packages Light']//button[contains(text(), 'Start your trial') and @class = 'packages-btn']")
//	WebElement lite;
	@FindBy(xpath = "//a[@id = 'lite-selection']")
	WebElement lite;

//	@FindBy(xpath = "//parent::div[@class = 'packages packages Classic']//button[contains(text(), 'Start your trial') and @class = 'packages-btn']")
//	WebElement classic;
//
//	@FindBy(xpath = "//parent::div[@class = 'packages packages Premium']//button[contains(text(), 'Start your trial') and @class = 'packages-btn']")
//	WebElement premium;
//
//	@FindBy(xpath = "//parent::div[@class = 'packages packages Light']//span[@class = 'amount']")
//	WebElement liteamount;
//
//	@FindBy(xpath = "//parent::div[@class = 'packages packages Classic']//span[@class = 'amount']")
//	WebElement classicamount;
//
//	@FindBy(xpath = "//parent::div[@class = 'packages packages Premium']//span[@class = 'amount']")
//	WebElement premiumamount;
//	
//	@FindBy(xpath = "//div[@class = 'packages packages Light']/h1")
//	WebElement subscriptionTypeLite;
//	
//	@FindBy(xpath = "//div[@class = 'packages packages Classic']/h1")
//	WebElement subscriptionTypeClassic;
//	
//	@FindBy(xpath = "//div[@class = 'packages packages Premium']/h1")
//	WebElement subscriptionTypePremium;
//	
//	@FindBy(xpath = "//a[@class = \"header-btns-country hide-mobile\"]")
//	WebElement countryselector;
//	
//	@FindBy(xpath = "//li[@id = 'bh']")
//	WebElement bh;
//	
//	@FindBy(xpath = "//li[@id = 'sa']")
//	WebElement sa;
//
//	@FindBy(xpath = "//li[@id = 'kw']")
//	WebElement kw;
//	
//	@FindBy(xpath = "//parent::div[@class = 'header-btns']//span[not(@*)]")
//	WebElement country;
	@FindBy(xpath = "//a[@id = 'bh']")
	WebElement bh;

	@FindBy(xpath = "//a[@id = 'sa']")
	WebElement sa;

	@FindBy(xpath = "//a[@id = 'kw']")
	WebElement kw;

	@FindBy(xpath = "//div[@class = 'price' and @id = 'currency-lite']//b")
	WebElement liteamount;

	@FindBy(xpath = "//div[@class = 'price' and @id = 'currency-classic']//b")
	WebElement classicamount;

	@FindBy(xpath = "//div[@class = 'price' and @id = 'currency-premium']//b")
	WebElement premiumamount;
	
	@FindBy(xpath = "//a[@id ='country-btn']")
	WebElement countryselector;
	
	@FindBy(xpath = "//strong[@id = 'name-lite']")
	WebElement subscriptionTypeLite;
	
	@FindBy(xpath = "//strong[@id = 'name-classic']")
	WebElement subscriptionTypeClassic;
	
	@FindBy(xpath = "//strong[@id = 'name-premium']")
	WebElement subscriptionTypePremium;
	
	@FindBy(xpath = "//span[@id= 'country-name']")
	WebElement country;
	

	// Initializing the page objects. Initializing all the elements of the
	// repository.
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	// Method to return the price of litePackage in SAR
	public int litePackagePriceinSAR() throws InterruptedException {

		countryselector.click();
		sa.click();
		Thread.sleep(6000);
		String amount = liteamount.getText();
		int price = Integer.parseInt(amount);
		return price;
	}

	// Method to return the price of ClassicPackage in SAR
	public int classicPackagePriceinSAR() throws InterruptedException {

		countryselector.click();
		sa.click();
		Thread.sleep(6000);
		String amount = classicamount.getText();
		int price = Integer.parseInt(amount);
		return price;
	}

	// Method to return the price of PremiumPackage in SAR
	public int premiumPackagePriceinSAR() throws InterruptedException {

		countryselector.click();
		sa.click();
		Thread.sleep(6000);
		String amount = premiumamount.getText();
		int price = Integer.parseInt(amount);
		return price;
	}

	// Method to return the price of litePackage in BHD
	public String litePackagePriceinBHD() throws InterruptedException {

		countryselector.click();
		bh.click();
		Thread.sleep(6000);
		String amount = liteamount.getText();
		float price = Float.parseFloat(amount);
		String value = TestUtil.convertTodecimal(price);
		return value;
	}

	// Method to return the price of ClassicPackage in BHD
	public String classicPackagePriceinBHD() throws InterruptedException {

		countryselector.click();
		bh.click();
		Thread.sleep(6000);
		String amount = classicamount.getText();
		float price = Float.parseFloat(amount);
		String value = TestUtil.convertTodecimal(price);
		return value;
	}

	// Method to return the price of PremiumPackage in BHD
	public String premiumPackagePriceinBHD() throws InterruptedException {

		countryselector.click();
		bh.click();
		Thread.sleep(6000);
		String amount = premiumamount.getText();
		float price = Float.parseFloat(amount);
		String value = TestUtil.convertTodecimal(price);
		return value;
	}

	// Method to return the price of litePackage in KWD
	public String litePackagePriceinKWD() throws InterruptedException {

		countryselector.click();
		kw.click();
		Thread.sleep(6000);
		String amount = liteamount.getText();
		float price = Float.parseFloat(amount);
		String value = TestUtil.convertTodecimal(price);
		return value;
	}

	// Method to return the price of ClassicPackage in KWD
	public String classicPackagePriceinKWD() throws InterruptedException {

		countryselector.click();
		kw.click();
		Thread.sleep(6000);
		String amount = classicamount.getText();
		float price = Float.parseFloat(amount);
		String value = TestUtil.convertTodecimal(price);
		return value;
	}

	// Method to return the price of PremiumPackage in KWD
	public String premiumPackagePriceinKWD() throws InterruptedException {

		countryselector.click();
		kw.click();
		Thread.sleep(6000);
		String amount = premiumamount.getText();
		float price = Float.parseFloat(amount);
		String value = TestUtil.convertTodecimal(price);
		return value;
	}

	// Method to return the lite subscription type
	public String subscriptionTypeLite() {
		String subscriptionType = subscriptionTypeLite.getText();
		return subscriptionType;
	}

	// Method to return the Classic Subscription type
	public String subscriptionTypeClassic() {
		String subscriptionType = subscriptionTypeClassic.getText();
		return subscriptionType;
	}

	// Method to return Premium Subscription type
	public String subscriptionTypePremium() {
		String subscriptionType = subscriptionTypePremium.getText();
		return subscriptionType;
	}

	// Method to select the bahrain country
	public String selectBahrain() throws InterruptedException {
		countryselector.click();
		bh.click();
		Thread.sleep(6000);
		String country1 = country.getText();
		return country1;
	}

	// Method to select KSA country
	public String selectKSA() throws InterruptedException {
		countryselector.click();
		sa.click();
		Thread.sleep(6000);
		String country1 = country.getText();
		return country1;
	}

	// Method to select Kuwait Country
	public String selectKuwait() throws InterruptedException {
		countryselector.click();
		kw.click();
		Thread.sleep(6000);
		String country1 = country.getText();
		return country1;
	}

	public SignUpPage signin() {
		signin.click();
		return new SignUpPage();
	}

}
