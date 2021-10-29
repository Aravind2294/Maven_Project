package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContinueShopping2 {
	public WebDriver driver;

	@FindBy(xpath = "//i[@class='icon-chevron-left left']")
	private WebElement continue_shopping;

	public ContinueShopping2(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getContinue_shopping() {
		return continue_shopping;
	}

}
