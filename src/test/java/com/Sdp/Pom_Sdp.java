package com.Sdp;

import org.openqa.selenium.WebDriver;

import com.Maven_Project.Base_Class;

public class Pom_Sdp extends Base_Class {

	public static WebDriver driver = Base_Class.get_Driver("chrome");

	public static Project_Object_Manager pom = new Project_Object_Manager(driver);

	public static void main(String[] args) throws Throwable {

		implicitlyWait(30);

		geturl("http://automationpractice.com/index.php");

		ClickOnElement(pom.getInstanceHp().getSignin());

		InputValueElement(pom.getInstancelp().getEmail(), "aravindrocks22@gmail.com");
		InputValueElement(pom.getInstancelp().getPassword(), "8098294433");
		ClickOnElement(pom.getInstancelp().getClickbtn());

		ClickOnElement(pom.getInstanceDr().getDresses());
		ClickOnElement(pom.getInstanceDr().getEveningdresses());

		Action_class(pom.getInstanceQv().getQuickview());
		ClickOnElement(pom.getInstanceQv().getQuickview1());

		iframe(pom.getInstanceAtc1().getIframe());
		for (int i = 0; i < 9; i++) {
			ClickOnElement(pom.getInstanceAtc1().getQuantity());
		}
		dropdown(pom.getInstanceAtc1().getSize(), "byValue", "2");
		ClickOnElement(pom.getInstanceAtc1().getColor());
		Screenshot("C:\\Users\\jegan\\eclipse-workspace\\Maven_Project\\Screenshot\\snap1.png");
		ClickOnElement(pom.getInstanceAtc1().getAddtocart());
		Screenshot("C:\\Users\\jegan\\eclipse-workspace\\Maven_Project\\Screenshot\\snap2.png");
		parentFrame();

		ClickOnElement(pom.getInstancecart().getCart());

		ClickOnElement(pom.getInstancesum1().getProceedtocheckout());

		ClickOnElement(pom.getInstanceAdd1().getAddress_checkout());
		Screenshot("C:\\Users\\jegan\\eclipse-workspace\\Maven_Project\\Screenshot\\snap3.png");

		ClickOnElement(pom.getInstanceShip1().getCheckbox());
		Screenshot("C:\\Users\\jegan\\eclipse-workspace\\Maven_Project\\Screenshot\\snap4.png");
		ClickOnElement(pom.getInstanceShip1().getProceedtocheckout());

		ClickOnElement(pom.getInstanceBank1().getBankwire());

		JavascriptExecutor(pom.getInstancePay().getConfirm_order());
		Screenshot("C:\\Users\\jegan\\eclipse-workspace\\Maven_Project\\Screenshot\\snap5.png");
		ClickOnElement(pom.getInstancePay().getConfirm_order());

		ClickOnElement(pom.getInstanceBack1().getBacktoorder());

		ClickOnElement(pom.getInstanceTshirt().getTshirts());

		implicitlyWait(20);

		Action_class(pom.getInstanceTshirtqview().getImageclk());
		ClickOnElement(pom.getInstanceTshirtqview().getQviewclk());

		iframe(pom.getInstanceTshirtqty().getFrame());
		for (int i = 0; i < 9; i++) {
			ClickOnElement(pom.getInstanceTshirtqty().getQuantity());
		}
		dropdown(pom.getInstanceTshirtqty().getSize(), "byValue", "2");
		ClickOnElement(pom.getInstanceTshirtqty().getColor());
		ClickOnElement(pom.getInstanceTshirtqty().getAddtocart());
		parentFrame();

		ClickOnElement(pom.getInstanceContinue().getContinue_shopping());

		ClickOnElement(pom.getInstanceWomen().getWomen());

		Action_class(pom.getInstanceQv3().getImageclk());
		ClickOnElement(pom.getInstanceQv3().getQuickview());

		iframe(pom.getInstanceWoQv().getFrame());
		for (int i = 0; i < 9; i++) {
			ClickOnElement(pom.getInstanceWoQv().getQuantity());
		}
		dropdown(pom.getInstanceWoQv().getSize(), "byValue", "2");
		ClickOnElement(pom.getInstanceWoQv().getColor());
		ClickOnElement(pom.getInstanceWoQv().getAddtocart());
		parentFrame();

		ClickOnElement(pom.getInstanceWoCt().getProceedtocheckout1());

		ClickOnElement(pom.getInstanceSuCo().getProceedtocheckout());

		ClickOnElement(pom.getInstanceSuAdd().getProceedtocheckout());

		ClickOnElement(pom.getInstanceShCo().getCheckbox());
		ClickOnElement(pom.getInstanceShCo().getProceedtocheckout());

		ClickOnElement(pom.getInstancePayBank().getBankwire());

		ClickOnElement(pom.getInstanceConOr().getConfirmorder());

	}

}
