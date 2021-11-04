package com.Oct_Maven_Project;

import org.openqa.selenium.WebDriver;
import com.Oct_Base.Base_Class;
import com.Property_File.File_Reader_Manager;
import com.Sdp.Page_Object_Manager;

public class Demo_Baseclass_Dress extends Base_Class {
	
	public static WebDriver driver = Base_Class.get_Driver("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws Throwable {
		waits(10);
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		get_URL(url);
		clickOnElement(pom.getInstanceHp().getSignin());
		
		//String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		String username = particular_Data_fromExcel("C:\\Users\\Lenovo\\Documents\\Testcase_dress purchase.xlsx", 0, 12, 5);
		
		inputValueElement(pom.getInstancelogin().getUsername(), username);
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		inputValueElement(pom.getInstancelogin().getPassword(), password);
		clickOnElement(pom.getInstancelogin().getSignin());
		clickOnElement(pom.getInstanceClickdrs().getClick_Btn());
		clickOnElement(pom.getInstanceclickbtn().getClick());
		ActionUse(pom.getInstanceQview().getMoveto_Quickview());
		clickOnElement(pom.getInstanceQview().getClk_quickview());
		Switchto(pom.getInstanceQview().getSwithto_quantity());
		for (int i = 0; i < 9; i++) {
			clickOnElement(pom.getInstanceQview().getQuantity());
		}
		selecting(pom.getInstanceQview().getSize(), "byVisibleText", "M");
		clickOnElement(pom.getInstanceQview().getColour());
		// takescreenshot(colour);
		takescreenshot(pom.getInstanceQview().getAddto_cart(), "SS1.png");
		clickOnElement(pom.getInstanceQview().getAddto_cart());
		parentframe();
		clickOnElement(pom.getInstancePrcd().getCheckout1());
		clickOnElement(pom.getInstanceSumm1().getSummary1());
		clickOnElement(pom.getInstanceadd().getAdd_proceed());
		takescreenshot(pom.getInstanceadd().getAdd_proceed(), "SS2.png");
		clickOnElement(pom.getInstanceShngchkout().getCheckbox_clk());
		clickOnElement(pom.getInstanceShngchkout().getShip_proceedclk());
		clickOnElement(pom.getInstancePayment1().getBank());
		javascript_exe(pom.getInstanceCnfrm1().getConfirm());
		clickOnElement(pom.getInstanceCnfrm1().getConfirm());
		clickOnElement(pom.getInstanceBack().getBack());
		clickOnElement(pom.getInstanceTshirt().getClick());
		ActionUse(pom.getInstanceQv2().getAction());
		clickOnElement(pom.getInstanceQv2().getClkqview());
		Switchto(pom.getInstanceQv2().getFrame2());
		clickOnElement(pom.getInstanceQv2().getColor());
		clickOnElement(pom.getInstanceQv2().getAddtocart());
		parentframe();
		clickOnElement(pom.getInstanceCntue().getCtnue());
		clickOnElement(pom.getInstanceWomen().getClk());
		ActionUse(pom.getInstanceQv3().getMoveto());
		clickOnElement(pom.getInstanceQv3().getClk_qckview());
		Switchto(pom.getInstanceQv3().getSwithto());
		for (int i = 0; i < 9; i++) {
			clickOnElement(pom.getInstanceQv3().getQuantity());
		}
		selecting(pom.getInstanceQv3().getSize(), "byIndex", "1");
		clickOnElement(pom.getInstanceQv3().getAddto_cart());
		parentframe();
		clickOnElement(pom.getInstanceProceedto().getPrcd());
		clickOnElement(pom.getInstanceSmryprcd2().getProceed_smry());
		clickOnElement(pom.getInstanceAddprcd2().getAdd_proceed());
		clickOnElement(pom.getInstanceFinalprcd().getChckbox());
		clickOnElement(pom.getInstanceFinalprcd().getFinalprcd());
		clickOnElement(pom.getInstancepay2().getBankdts());
		clickOnElement(pom.getInstanceCnfrmFnl().getCnfrm_click());

	}
}