package com.shadi.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.shadi.qa.base.TestBase;
import com.shadi.qa.pages.HomePage;
import com.shadi.qa.pages.RegistrationProfilePage;
import com.shadi.qa.util.*;

public class RegistrationBasicDetailsPageTest extends TestBase {

	HomePage homePage;
	RegistrationProfilePage registrationProfilePage;

	public RegistrationBasicDetailsPageTest() {
		super();
	}

	@BeforeMethod()
	public void setUp() {
		initialization();
	}

//	@DataProvider
//	public Object[][] getTestData() {
//		Object[][] data = TestUtil.getTestData("testData");
//		return data;
//	}

	@Test
	public void communityTest() {
//		community = "marathi";
//		website = "https://www.marathishaadi.com/";
		driver.get("https://www.marathishaadi.com/");
//		if (community.equals("marathi")) {
//			System.out.println(website);
//			driver.get(website);
//		} else if (community.equals("gujarati")) {
//			System.out.println(website);
//			driver.get(website);
//		}
	}

	@AfterMethod
	public void tearDown() {
//		driver.close();
	}

}
