package com.shadi.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shadi.qa.base.TestBase;

public class RegistrationProfilePage extends TestBase {

	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "password1")
	WebElement password;

	@FindBy(xpath = "Dropdown-control postedby_selector")
	WebElement profileFor;

	@FindBy(xpath = "//input[@name=\"gender\" and @value=\"Male\"]")
	WebElement genderMale;

	@FindBy(xpath = "//input[@name=\"gender\" and @value=\"Male\"]")
	WebElement genderFemale;

	@FindBy(xpath = "//button[contains(text(),'Next')]")
	WebElement nextBtn;

	RegistrationProfilePage() {
		PageFactory.initElements(driver, this);
	}

	public void passingEmailID(String emailID) {
		email.sendKeys(emailID);
	}

	public void enteringPassword(String passwordvalue) {
		password.sendKeys(passwordvalue);
	}

	public void selectProfileFor(String profileforvalue) {
		profileFor.click();
		List<WebElement> profileList = driver
				.findElements(By.xpath("//div[@class=\"Dropdown-menu postedby_options\"]//div"));
		boolean flag = false;
		for (int i = 0; i < profileList.size(); i++) {
			String profilevalue = profileList.get(i).getText();
			System.out.println(profilevalue);
			if (profilevalue.equals(profileforvalue)) {
				profileList.get(i).click();
				flag = true;
				break;
			}
			if (flag) {
				flag = false;
			}
		}
	}

	public RegistrationBasicDetailsPage clickOnNextBtn() {
		nextBtn.click();
		return new RegistrationBasicDetailsPage();
	}

}
