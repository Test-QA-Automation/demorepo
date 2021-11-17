package com.shadi.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shadi.qa.base.TestBase;

public class HomePage extends TestBase{
//	RegistrationProfilePage registrationProfilePage = new RegistrationProfilePage();
	
	// object identification
//	@FindBy(xpath="(//button[@type='button'])[1]")
//	WebElement letsBeginBtn;
	
	// initializing web elements
//	HomePage(){
//		PageFactory.initElements(driver, this);
//	}
//	
	// defining properties
	public static void clickOnLetsBeginBtn() throws Exception {
		String clickOnBegin = "(//button[@type='button'])[1]";
		Thread.sleep(10000);
		driver.findElement(By.xpath(clickOnBegin)).click();
		Thread.sleep(5000);
//		registrationProfilePage.passingEmailID("test@test.com");
//		registrationProfilePage.enteringPassword("12345");
//		letsBeginBtn.click();
//		return new RegistrationProfilePage();
	}

}
 