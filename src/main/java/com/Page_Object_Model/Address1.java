package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address1 {
	public WebDriver driver;

	@FindBy(xpath = "//button[@name='processAddress']")
	WebElement address_checkout;

	public Address1(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddress_checkout() {
		return address_checkout;
	}

}
