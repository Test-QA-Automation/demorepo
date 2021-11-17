package com.shadi.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.shadi.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	// base constructor to initialize config file
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"F:\\Eclipse 2021\\ShadiDotComTestAutomation\\src\\main\\java\\com\\shadi\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// to initialize browser 
	public static void initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"F:\\Eclipse 2021\\seleniumwebdrivers\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver",
					"F:\\Eclipse 2021\\seleniumwebdrivers\\firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

	}

}
