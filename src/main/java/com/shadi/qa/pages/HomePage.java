package com.shadi.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shadi.qa.base.TestBase;

public class HomePage extends TestBase{
	
	
	// object identification
	@FindBy(xpath="//button[contains(text(),\"Let's Begin\")]")
	WebElement letsBeginBtn;
	
	// initializing web elements
	HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	// defining properties
	public RegistrationProfilePage clickOnLetsBeginBtn() {
		letsBeginBtn.click();
		return new RegistrationProfilePage();
	}

}
 