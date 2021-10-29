package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_bank {
	public WebDriver driver;

	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement bankwire;

	public Payment_bank(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBankwire() {
		return bankwire;
	}

}
