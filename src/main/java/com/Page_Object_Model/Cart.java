package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {

	public WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
	WebElement cart;

	public Cart(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCart() {
		return cart;
	}
}
