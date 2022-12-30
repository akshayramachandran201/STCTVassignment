package com.stctv.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.stctv.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\24850\\Desktop\\assignment\\StctvTest\\src\\main\\java\\com\\stctv\\qa\\config\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {

		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\24850\\Downloads\\chromedriver_1.8\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeBrowserPath"));
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\24850\\Downloads\\geckodriver");
			System.setProperty("webdriver.gecko.driver", prop.getProperty("firefoxBrowserPath"));
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}
}
