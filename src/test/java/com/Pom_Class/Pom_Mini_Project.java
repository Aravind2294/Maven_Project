package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import com.Maven_Project.Base_Class;
import com.Page_Object_Model.Add_To_Cart;
import com.Page_Object_Model.Address1;
import com.Page_Object_Model.Back_To_Order;
import com.Page_Object_Model.Bankwire;
import com.Page_Object_Model.Cart;
import com.Page_Object_Model.ContinueShopping2;
import com.Page_Object_Model.Dress;
import com.Page_Object_Model.Home_Page;
import com.Page_Object_Model.Login_Page;
import com.Page_Object_Model.Order_confirm;
import com.Page_Object_Model.Payment1;
import com.Page_Object_Model.Payment_bank;
import com.Page_Object_Model.Quickview;
import com.Page_Object_Model.Quickview3;
import com.Page_Object_Model.Shipping1;
import com.Page_Object_Model.Shipping_checkout;
import com.Page_Object_Model.Summary1;
import com.Page_Object_Model.Summary_Address1;
import com.Page_Object_Model.Summary_checkout1;
import com.Page_Object_Model.T_Shirts;
import com.Page_Object_Model.Tshirt_qview;
import com.Page_Object_Model.Tshirts_qty;
import com.Page_Object_Model.Women;
import com.Page_Object_Model.Women_Cart;
import com.Page_Object_Model.Women_Qview;

public class Pom_Mini_Project extends Base_Class {

	public static WebDriver driver = Base_Class.get_Driver("chrome");
	
	public static Home_Page hp = new Home_Page(driver);
	public static Login_Page lp = new Login_Page(driver);
	public static Dress d = new Dress(driver);
	public static Quickview qv = new Quickview(driver);
	public static Add_To_Cart ad = new Add_To_Cart(driver);
	public static Cart ct = new Cart(driver);
	public static Summary1 s = new Summary1(driver);
	public static Address1 a1 = new Address1(driver);
	public static Shipping1 s1 = new Shipping1(driver);
	public static Bankwire b1 = new Bankwire(driver);
	public static Payment1 p1 = new Payment1(driver);
	public static Back_To_Order bto = new Back_To_Order(driver);
	public static T_Shirts ts = new T_Shirts(driver);
	public static Tshirt_qview tq = new Tshirt_qview(driver);
	public static Tshirts_qty tqty = new Tshirts_qty(driver);
	public static ContinueShopping2 cs2 = new ContinueShopping2(driver);
	public static Women w = new Women(driver);
	public static Quickview3 q3 = new Quickview3(driver);
	public static Women_Qview mq = new Women_Qview(driver);
	public static Women_Cart wc = new Women_Cart(driver);
	public static Summary_checkout1 sc = new Summary_checkout1(driver);
	public static Summary_Address1 sa = new Summary_Address1(driver);
	public static Shipping_checkout sc1 = new Shipping_checkout(driver);
	public static Payment_bank pb = new Payment_bank(driver);
	public static Order_confirm oc = new Order_confirm(driver);

	public static void main(String[] args) throws Throwable {

		implicitlyWait(30);

		geturl("http://automationpractice.com/index.php");

		ClickOnElement(hp.getSignin());

		InputValueElement(lp.getEmail(), "aravindrocks22@gmail.com");
		InputValueElement(lp.getPassword(), "8098294433");
		ClickOnElement(lp.getClickbtn());

		ClickOnElement(d.getDresses());
		ClickOnElement(d.getEveningdresses());

		Action_class(qv.getQuickview());
		ClickOnElement(qv.getQuickview1());

		iframe(ad.getIframe());
		for (int i = 0; i < 9; i++) {
			ClickOnElement(ad.getQuantity());
		}
		dropdown(ad.getSize(), "byValue", "2");
		ClickOnElement(ad.getColor());
		Screenshot("C:\\Users\\jegan\\eclipse-workspace\\Maven_Project\\Screenshot\\snap1.png");
		ClickOnElement(ad.getAddtocart());
		Screenshot("C:\\Users\\jegan\\eclipse-workspace\\Maven_Project\\Screenshot\\snap2.png");
		parentFrame();

		ClickOnElement(ct.getCart());

		ClickOnElement(s.getProceedtocheckout());

		ClickOnElement(a1.getAddress_checkout());
		Screenshot("C:\\Users\\jegan\\eclipse-workspace\\Maven_Project\\Screenshot\\snap3.png");

		ClickOnElement(s1.getCheckbox());
		Screenshot("C:\\Users\\jegan\\eclipse-workspace\\Maven_Project\\Screenshot\\snap4.png");
		ClickOnElement(s1.getProceedtocheckout());

		ClickOnElement(b1.getBankwire());

		JavascriptExecutor(p1.getConfirm_order());
		Screenshot("C:\\Users\\jegan\\eclipse-workspace\\Maven_Project\\Screenshot\\snap5.png");
		ClickOnElement(p1.getConfirm_order());

		ClickOnElement(bto.getBacktoorder());

		ClickOnElement(ts.getTshirts());

		implicitlyWait(20);

		Action_class(tq.getImageclk());
		ClickOnElement(tq.getQviewclk());

		iframe(tqty.getFrame());
		for (int i = 0; i < 9; i++) {
			ClickOnElement(tqty.getQuantity());
		}
		dropdown(tqty.getSize(), "byValue", "2");
		ClickOnElement(tqty.getColor());
		ClickOnElement(tqty.getAddtocart());
		parentFrame();

		ClickOnElement(cs2.getContinue_shopping());

		ClickOnElement(w.getWomen());

		Action_class(q3.getImageclk());
		ClickOnElement(q3.getQuickview());

		iframe(mq.getFrame());
		for (int i = 0; i < 9; i++) {
			ClickOnElement(mq.getQuantity());
		}
		dropdown(mq.getSize(), "byValue", "2");
		ClickOnElement(mq.getColor());
		ClickOnElement(mq.getAddtocart());
		parentFrame();

		ClickOnElement(wc.getProceedtocheckout1());

		ClickOnElement(sc.getProceedtocheckout());

		ClickOnElement(sa.getProceedtocheckout());

		ClickOnElement(sc1.getCheckbox());
		ClickOnElement(sc1.getProceedtocheckout());

		ClickOnElement(pb.getBankwire());

		ClickOnElement(oc.getConfirmorder());

	}

}
