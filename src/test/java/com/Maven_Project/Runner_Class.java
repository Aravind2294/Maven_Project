package com.Maven_Project;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Runner_Class extends Base_Class {
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {

		driver = get_Driver("chrome");

		implicitlyWait(30);

		geturl("http://automationpractice.com/index.php");

		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		ClickOnElement(signin);

		WebElement emailid = driver.findElement(By.xpath("//input[@id='email']"));
		InputValueElement(emailid, "aravindrocks22@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		InputValueElement(password, "8098294433");

		WebElement clickbtn = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		ClickOnElement(clickbtn);

		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		ClickOnElement(dresses);

		WebElement eveningdresses = driver.findElement(By.xpath("(//a[contains(@title,'Browse our "
				+ "different dresses to choose the perfect dress for an unforgettable evening!')])[1]"));
		ClickOnElement(eveningdresses);

		WebElement quickview = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		Action_class(quickview);

		WebElement quickview1 = driver.findElement(By.xpath("//span[text()='Quick view']"));
		ClickOnElement(quickview1);

		WebElement quantity = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		iframe(quantity);

		WebElement quantity1 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		for (int i = 0; i < 9; i++) {
			ClickOnElement(quantity1);
		}
		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
		dropdown(size, "byValue", "2");

		WebElement colour = driver.findElement(By.xpath("//a[@name='Pink']"));
		ClickOnElement(colour);

		Screenshot("C:\\Users\\jegan\\eclipse-workspace\\Maven_Project\\Screenshot\\snap1.png");

		WebElement addtocart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		ClickOnElement(addtocart);

		Screenshot("C:\\Users\\jegan\\eclipse-workspace\\Maven_Project\\Screenshot\\snap2.png");

		parentFrame();

		WebElement checkout = driver.findElement(
				By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
		ClickOnElement(checkout);

		WebElement proceedtocheckout1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		ClickOnElement(proceedtocheckout1);

		WebElement processAddress1 = driver.findElement(By.xpath("//button[@name='processAddress']"));
		ClickOnElement(processAddress1);

		Screenshot("C:\\Users\\jegan\\eclipse-workspace\\Maven_Project\\Screenshot\\snap3.png");

		WebElement clk1 = driver.findElement(By.xpath("//input[@name='cgv']"));
		ClickOnElement(clk1);

		Screenshot("C:\\Users\\jegan\\eclipse-workspace\\Maven_Project\\Screenshot\\snap4.png");

		WebElement processCarrier1 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		ClickOnElement(processCarrier1);

		WebElement bankwire1 = driver.findElement(By.xpath("//a[@class='bankwire']"));
		ClickOnElement(bankwire1);

		WebElement buy = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		JavascriptExecutor(buy);
		Screenshot("C:\\Users\\jegan\\eclipse-workspace\\Maven_Project\\Screenshot\\snap5.png");
		ClickOnElement(buy);

		WebElement exclusive = driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']"));
		ClickOnElement(exclusive);

		WebElement shopping = driver
				.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a"));
		ClickOnElement(shopping);

		implicitlyWait(20);

		WebElement quick3 = driver.findElement(By.xpath("//img[@itemprop='image']"));
		Action_class(quick3);

		WebElement qview1 = driver.findElement(By.xpath("//span[text()='Quick view']"));
		ClickOnElement(qview1);

		WebElement quantity2 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		iframe(quantity2);

		WebElement quantity3 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		for (int i = 0; i < 9; i++) {
			ClickOnElement(quantity3);
		}

		WebElement size1 = driver.findElement(By.xpath("//select[@name='group_1']"));
		dropdown(size1, "byValue", "2");

		WebElement colour2 = driver.findElement(By.xpath("//a[@name='Blue']"));
		ClickOnElement(colour2);

		WebElement addtocard2 = driver.findElement(By.xpath("(//span[text()='Add to cart'])[1]"));
		ClickOnElement(addtocard2);

		parentFrame();
		WebElement icon = driver.findElement(By.xpath("//i[@class='icon-chevron-left left']"));
		ClickOnElement(icon);

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		ClickOnElement(women);

		WebElement quick4 = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[4]"));
		Action_class(quick4);

		WebElement qview3 = driver.findElement(By.xpath("(//span[text()='Quick view'])[3]"));
		ClickOnElement(qview3);

		WebElement quantity6 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		iframe(quantity6);

		WebElement quantity7 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		for (int i = 0; i < 9; i++) {
			ClickOnElement(quantity7);
		}

		WebElement size5 = driver.findElement(By.xpath("//select[@name='group_1']"));
		dropdown(size5, "byValue", "2");

		WebElement colour5 = driver.findElement(By.xpath("//a[@name='Orange']"));
		ClickOnElement(colour5);

		WebElement submit3 = driver.findElement(By.xpath("//button[@name='Submit']"));
		ClickOnElement(submit3);

		parentFrame();

		WebElement proceed1 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
		ClickOnElement(proceed1);

		WebElement proceedtocheckout3 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span"));
		ClickOnElement(proceedtocheckout3);

		WebElement protocheckout = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span"));
		ClickOnElement(protocheckout);

		WebElement checkout2 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		ClickOnElement(checkout2);

		WebElement checkout3 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span"));
		ClickOnElement(checkout3);

		WebElement checkout4 = driver.findElement(By.xpath("//a[@class='bankwire']"));
		ClickOnElement(checkout4);

		WebElement checkout5 = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
		ClickOnElement(checkout5);
	}
}
