package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quickview3 {
	public WebDriver driver;

	@FindBy(xpath = "(//img[@class='replace-2x img-responsive'])[4]")
	private WebElement imageclk;

	@FindBy(xpath = "(//span[text()='Quick view'])[3]")
	private WebElement quickview;

	public Quickview3(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getImageclk() {
		return imageclk;
	}

	public WebElement getQuickview() {
		return quickview;
	}

}
