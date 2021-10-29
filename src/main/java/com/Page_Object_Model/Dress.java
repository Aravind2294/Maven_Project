package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress {
	public WebDriver driver;

	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	WebElement dresses;

	@FindBy(xpath = "(//a[contains(@title,'Browse our "
			+ "different dresses to choose the perfect dress for an unforgettable evening!')])[1]")
	WebElement eveningdresses;

	public Dress(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getEveningdresses() {
		return eveningdresses;
	}

}
