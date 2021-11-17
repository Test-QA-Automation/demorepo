package com.shadi.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shadi.qa.base.TestBase;

public class RegistrationProfilePage extends TestBase {

	// define properties
	public static void passingEmailID(String emailID) {
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys(emailID);
	}

	public static void enteringPassword(String passwordvalue) {
		WebElement password = driver.findElement(By.name("password1"));
		password.sendKeys(passwordvalue);
	}

	public static void selectProfileFor(String profileforvalue) {
		WebElement profileFor = driver.findElement(
				By.xpath("//body/div[@id='__next']/div[13]/form[1]/div[2]/div[3]/div[1]/div[1]/div[2]/span[1]"));
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

	public static void clickOnGender() {
		WebElement gender = driver.findElement(By.xpath("//input[@type='radio' and @value='Male']"));
		gender.click();

	}

	public static void clickOnNextBtn() {
		WebElement nextBtn = driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
		nextBtn.click();

	}

}
