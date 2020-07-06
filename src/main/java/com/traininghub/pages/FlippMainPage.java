package com.traininghub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlippMainPage {

	WebDriver driver;
	
	public WebElement ShoppingListBtn() {
		return driver.findElement(By.xpath("//span[text()='Shopping List']"));
	}
}
