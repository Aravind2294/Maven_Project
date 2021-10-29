package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_qview {
	public WebDriver driver;

	@FindBy(xpath = "//img[@itemprop='image']")
	private WebElement imageclk;

	@FindBy(xpath = "//span[text()='Quick view']")
	private WebElement qviewclk;

	public Tshirt_qview(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getImageclk() {
		return imageclk;
	}

	public WebElement getQviewclk() {
		return qviewclk;
	}

}
