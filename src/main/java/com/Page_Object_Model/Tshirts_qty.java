package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirts_qty {
	public WebDriver driver;

	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	private WebElement frame;

	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement quantity;

	@FindBy(xpath = "//select[@name='group_1']")
	private WebElement size;

	@FindBy(xpath = "//a[@name='Blue']")
	private WebElement color;

	@FindBy(xpath = "(//span[text()='Add to cart'])[1]")
	private WebElement addtocart;

	public Tshirts_qty(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFrame() {
		return frame;
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
