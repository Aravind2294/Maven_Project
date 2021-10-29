package com.Sdp;

import org.openqa.selenium.WebDriver;

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

public class Project_Object_Manager {

	public WebDriver driver;

	// private Class name Object name

	private Home_Page hp;
	private Login_Page lp;
	private Dress d;
	private Quickview qv;
	private Add_To_Cart ad;
	private Cart ct;
	private Summary1 s;
	private Address1 a1;
	private Shipping1 s1;
	private Bankwire b1;
	private Payment1 p1;
	private Back_To_Order bto;
	private T_Shirts ts;
	private Tshirt_qview tq;
	private Tshirts_qty tqty;
	private ContinueShopping2 cs2;
	private Women w;
	private Quickview3 q3;
	private Women_Qview mq;
	private Women_Cart wc;
	private Summary_checkout1 sc;
	private Summary_Address1 sa;
	private Shipping_checkout sc1;
	private Payment_bank pb;
	private Order_confirm oc;

	public Project_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Home_Page getInstanceHp() {
		hp = new Home_Page(driver);
		return hp;
	}

	public Login_Page getInstancelp() {
		lp = new Login_Page(driver);
		return lp;
	}

	public Dress getInstanceDr() {
		d = new Dress(driver);
		return d;
	}

	public Quickview getInstanceQv() {
		qv = new Quickview(driver);
		return qv;
	}

	public Add_To_Cart getInstanceAtc1() {
		ad = new Add_To_Cart(driver);
		return ad;
	}

	public Cart getInstancecart() {
		ct = new Cart(driver);
		return ct;
	}

	public Summary1 getInstancesum1() {
		s = new Summary1(driver);
		return s;
	}

	public Address1 getInstanceAdd1() {
		a1 = new Address1(driver);
		return a1;
	}

	public Shipping1 getInstanceShip1() {
		s1 = new Shipping1(driver);
		return s1;
	}

	public Bankwire getInstanceBank1() {
		b1 = new Bankwire(driver);
		return b1;
	}

	public Payment1 getInstancePay() {
		p1 = new Payment1(driver);
		return p1;
	}

	public Back_To_Order getInstanceBack1() {
		bto = new Back_To_Order(driver);
		return bto;
	}

	public T_Shirts getInstanceTshirt() {
		ts = new T_Shirts(driver);
		return ts;
	}

	public Tshirt_qview getInstanceTshirtqview() {
		tq = new Tshirt_qview(driver);
		return tq;
	}

	public Tshirts_qty getInstanceTshirtqty() {
		tqty = new Tshirts_qty(driver);
		return tqty;
	}

	public ContinueShopping2 getInstanceContinue() {
		cs2 = new ContinueShopping2(driver);
		return cs2;
	}

	public Women getInstanceWomen() {
		w = new Women(driver);
		return w;
	}

	public Quickview3 getInstanceQv3() {
		q3 = new Quickview3(driver);
		return q3;
	}

	public Women_Qview getInstanceWoQv() {
		mq = new Women_Qview(driver);
		return mq;
	}

	public Women_Cart getInstanceWoCt() {
		wc = new Women_Cart(driver);
		return wc;
	}

	public Summary_checkout1 getInstanceSuCo() {
		sc = new Summary_checkout1(driver);
		return sc;
	}

	public Summary_Address1 getInstanceSuAdd() {
		sa = new Summary_Address1(driver);
		return sa;
	}

	public Shipping_checkout getInstanceShCo() {
		sc1 = new Shipping_checkout(driver);
		return sc1;
	}

	public Payment_bank getInstancePayBank() {
		pb = new Payment_bank(driver);
		return pb;
	}

	public Order_confirm getInstanceConOr() {
		oc = new Order_confirm(driver);
		return oc;
	}

}
