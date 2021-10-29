package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_confirm {
	public WebDriver driver;

	@FindBy(xpath = "//span[text()='I confirm my order']")
	private WebElement confirmorder;

	public Order_confirm(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getConfirmorder() {
		return confirmorder;
	}

}
