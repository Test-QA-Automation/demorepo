package com.shadi.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shadi.qa.base.TestBase;

public class RegistrationBasicDetailsPage extends TestBase{
	
	@FindBy(xpath = "//div[@class=\"Dropdown-placeholder is-selected\" and @xpath=\"1\"]")
	WebElement community;
	
	public RegistrationBasicDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getCommunityFieldValue() {
		return community.getText();
	}
}
