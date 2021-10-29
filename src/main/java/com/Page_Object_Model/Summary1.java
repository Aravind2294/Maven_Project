package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary1 {
	public WebDriver driver;

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	WebElement proceedtocheckout;

	public Summary1(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceedtocheckout() {
		return proceedtocheckout;
	}

}
