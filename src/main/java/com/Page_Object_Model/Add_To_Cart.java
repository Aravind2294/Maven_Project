package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_To_Cart {
	public WebDriver driver;

	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	WebElement iframe;

	@FindBy(xpath = "//i[@class='icon-plus']")
	WebElement quantity;

	@FindBy(xpath = "//select[@name='group_1']")
	WebElement size;

	@FindBy(xpath = "//a[@name='Pink']")
	WebElement color;

	@FindBy(xpath = "//span[text()='Add to cart']")
	WebElement addtocart;

	public Add_To_Cart(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getIframe() {
		return iframe;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

}
