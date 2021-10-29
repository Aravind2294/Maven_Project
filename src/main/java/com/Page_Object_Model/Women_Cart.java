package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Cart {

	public WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
	private WebElement proceedtocheckout1;

	public Women_Cart(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceedtocheckout1() {
		return proceedtocheckout1;
	}

}
