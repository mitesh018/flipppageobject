package com.traininghub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlippHomePage {
	WebDriver driver;
	public WebElement postalCode() {
		return driver.findElement(By.xpath("//input[@class = 'content-input']"));
	}
	
}
