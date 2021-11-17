package com.shadi.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.shadi.qa.base.TestBase;
import com.shadi.qa.pages.HomePage;
import com.shadi.qa.pages.RegistrationBasicDetailsPage;
import com.shadi.qa.pages.RegistrationProfilePage;
import com.shadi.qa.util.*;

public class RegistrationBasicDetailsPageTest extends TestBase {

	HomePage homePage;
	RegistrationProfilePage registrationProfilePage;
	RegistrationBasicDetailsPage registrationBasicDetailsPage;
	TestUtil testdata = new TestUtil();

	public RegistrationBasicDetailsPageTest() {
		super();
	}

	@BeforeMethod()
	public void setUp() {
		initialization();
	}

	@Test
	public void marathiCommunityTest() throws Exception {

		String url = testdata.testData(1, 1);
		driver.get(url);
		Thread.sleep(5000);
		homePage.clickOnLetsBeginBtn();
		Thread.sleep(5000);
		registrationProfilePage.passingEmailID("test@test.com");
		registrationProfilePage.enteringPassword("12345");
		registrationProfilePage.selectProfileFor("Self");
		Thread.sleep(3000);
		registrationProfilePage.clickOnGender();
		registrationProfilePage.clickOnNextBtn();
		Thread.sleep(2000);
		String communityValue = registrationBasicDetailsPage.getCommunityFieldValue();
		Assert.assertEquals(communityValue, "Marathi", "Community is not matched with selection");

	}

	@Test
	public void gujaratiCommunityTest() throws Exception {

		String url = testdata.testData(2, 1);
		driver.get(url);
		Thread.sleep(5000);
		homePage.clickOnLetsBeginBtn();
		Thread.sleep(5000);
		registrationProfilePage.passingEmailID("test@test.com");
		registrationProfilePage.enteringPassword("12345");
		registrationProfilePage.selectProfileFor("Self");
		Thread.sleep(3000);
		registrationProfilePage.clickOnGender();
		registrationProfilePage.clickOnNextBtn();
		Thread.sleep(2000);
		String communityValue = registrationBasicDetailsPage.getCommunityFieldValue();
		Assert.assertEquals(communityValue, "Gujarati", "Community is not matched with selection");

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
