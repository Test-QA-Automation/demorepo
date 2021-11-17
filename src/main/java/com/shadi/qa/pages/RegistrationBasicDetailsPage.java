package com.shadi.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.shadi.qa.base.TestBase;

public class RegistrationBasicDetailsPage extends TestBase {

	// defining properties
	public static String getCommunityFieldValue() {
		WebElement community = driver.findElement(
				By.xpath("//body/div[@id='__next']/div[13]/form[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]"));
		return community.getText();
	}
}
