package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quickview {
	public WebDriver driver;

	@FindBy(xpath = "//img[@title='Printed Dress']")
	WebElement quickview;

	@FindBy(xpath = "//span[text()='Quick view']")
	WebElement quickview1;

	public Quickview(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getQuickview() {
		return quickview;
	}

	public WebElement getQuickview1() {
		return quickview1;
	}

}
