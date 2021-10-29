package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping1 {
	public WebDriver driver;

	@FindBy(xpath = "//input[@name='cgv']")
	private WebElement checkbox;

	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement proceedtocheckout;

	public Shipping1(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getProceedtocheckout() {
		return proceedtocheckout;
	}

}
