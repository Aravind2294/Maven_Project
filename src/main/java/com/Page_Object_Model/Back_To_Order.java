package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Back_To_Order {
	public WebDriver driver;

	@FindBy(xpath = "//a[@class='button-exclusive btn btn-default']")
	private WebElement backtoorder;

	public Back_To_Order(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBacktoorder() {
		return backtoorder;
	}

}
