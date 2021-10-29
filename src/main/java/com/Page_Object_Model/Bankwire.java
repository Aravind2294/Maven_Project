package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bankwire {
	public WebDriver driver;

	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement bankwire;

	public Bankwire(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBankwire() {
		return bankwire;
	}

}
