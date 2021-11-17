package com.shadi.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shadi.qa.base.TestBase;

public class HomePage extends TestBase{
	
	// defining properties
	public static void clickOnLetsBeginBtn() throws Exception {
		String clickOnBegin = "(//button[@type='button'])[1]";
		Thread.sleep(10000);
		driver.findElement(By.xpath(clickOnBegin)).click();
		Thread.sleep(5000);

	}

}
 