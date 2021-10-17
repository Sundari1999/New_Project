package com.Sdp;

import org.openqa.selenium.WebDriver;

import com.Pomcls.Address_Proceed1;
import com.Pomcls.Address_Proceed2;
import com.Pomcls.Backto_Orders;
import com.Pomcls.Click_Dress;
import com.Pomcls.Click_Tshirt;
import com.Pomcls.Confirm_Order1;
import com.Pomcls.Confirmorder2;
import com.Pomcls.Continue_Shop;
import com.Pomcls.Evngdress_Click;
import com.Pomcls.Finalproceed_Checkbox;
import com.Pomcls.Home_Page;
import com.Pomcls.Login_Page;
import com.Pomcls.Payment1;
import com.Pomcls.Payment2;
import com.Pomcls.Proceedto_Check1;
import com.Pomcls.Proceedto_Check2;
import com.Pomcls.Quickview2;
import com.Pomcls.Quickview3;
import com.Pomcls.Quickview_Page1;
import com.Pomcls.Shipping_Proceed;
import com.Pomcls.Summary_Procd2;
import com.Pomcls.Summary_Proceed1;
import com.Pomcls.Women_Click;



public class Page_Object_Manager {
	
	//private Class Name Object Name
	
	private Home_Page hp;
	
	private Login_Page login;

	public WebDriver driver;
	
	private Click_Dress click;
	private Evngdress_Click clickbtn;
	private Quickview_Page1 qv1;
	private Proceedto_Check1 check_out1;
	private Summary_Proceed1 proceed_summary;
	private Address_Proceed1 addcheckout;
	private Shipping_Proceed shiping_checkout;
	private Payment1 pay;
	private Confirm_Order1 cnfrm;
	private Backto_Orders backorder;
	private Click_Tshirt clk;
	private Quickview2 qkview;
	private Continue_Shop continuee;
	private Women_Click women;
	private Quickview3 qkv;
	private Proceedto_Check2 pc;
	private Summary_Procd2 sum;
	private Address_Proceed2 addr;
	private Finalproceed_Checkbox fnl;
	private Payment2 p;
	private Confirmorder2 cm;
	
	public Page_Object_Manager(WebDriver driver1) {
		this.driver=driver1;
	}

	public Home_Page getInstanceHp() {
		 hp = new Home_Page(driver);
		 return hp;

	}
	
	public Login_Page getInstancelogin() {
		login = new Login_Page(driver);
		return login;

	}
	
	public Click_Dress getInstanceClickdrs() {
		click = new Click_Dress(driver);
		return click;

	}
	public Evngdress_Click getInstanceclickbtn() {
	clickbtn = new Evngdress_Click(driver);
	return clickbtn;
	}
	public Quickview_Page1 getInstanceQview() {
		qv1 = new Quickview_Page1(driver);
		return qv1;
}
	public Proceedto_Check1 getInstancePrcd() {
		check_out1 = new Proceedto_Check1(driver);
		return check_out1;
	}
	 public Summary_Proceed1 getInstanceSumm1() {
		 proceed_summary = new Summary_Proceed1(driver);
		 return proceed_summary;

	}
	 public Address_Proceed1 getInstanceadd() {
		 addcheckout = new Address_Proceed1(driver);
		 return addcheckout;
		 }
	 public Shipping_Proceed getInstanceShngchkout() {
		 shiping_checkout = new Shipping_Proceed(driver);
		 return shiping_checkout;
		 }
	 
	 public Payment1 getInstancePayment1() {
		 pay = new Payment1(driver);
		 return pay;

	}
	 public Confirm_Order1 getInstanceCnfrm1() {
		 cnfrm = new Confirm_Order1(driver);
		 return cnfrm;

	}
	 public Backto_Orders getInstanceBack() {
		 backorder = new Backto_Orders(driver);
		 return backorder;
	}
	 public Click_Tshirt getInstanceTshirt() {
		 clk = new Click_Tshirt(driver);
		 return clk;

	}
	 public Quickview2 getInstanceQv2() {
		 qkview = new Quickview2(driver);
		 return qkview;

	}
	 public Continue_Shop getInstanceCntue() {
		 continuee = new Continue_Shop(driver);
		return continuee;
	}
	 public Women_Click getInstanceWomen() {
		 women = new Women_Click(driver);
		 return women;
        
	}
	 public Quickview3 getInstanceQv3() {
		 qkv = new Quickview3(driver);
		 return qkv;

	}
	 public Proceedto_Check2 getInstanceProceedto() {
		 pc = new Proceedto_Check2(driver);
		 return pc;

	}
	 public Summary_Procd2 getInstanceSmryprcd2() {
		 sum = new Summary_Procd2(driver);
		 return sum;

	}
	 public Address_Proceed2 getInstanceAddprcd2() {
		 addr = new Address_Proceed2(driver);
		 return addr;
	}
	 public Finalproceed_Checkbox getInstanceFinalprcd() {
		 fnl = new Finalproceed_Checkbox(driver);
		 return fnl;
	}
	 public Payment2 getInstancepay2() {
		 p = new Payment2(driver);
		 return p;
	}
	 public Confirmorder2 getInstanceCnfrmFnl() {
		 cm = new Confirmorder2(driver);
		 return cm;

	}
}

