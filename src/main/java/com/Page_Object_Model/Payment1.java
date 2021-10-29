package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment1 {
	public WebDriver driver;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement confirm_order;

	public Payment1(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getConfirm_order() {
		return confirm_order;
	}

}
