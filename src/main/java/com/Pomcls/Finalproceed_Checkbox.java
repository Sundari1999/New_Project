package com.Pomcls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finalproceed_Checkbox {
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement chckbox;
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span")
	private WebElement finalprcd;
	public WebDriver driver;
	

	public Finalproceed_Checkbox(WebDriver driver00) {
		this.driver=driver00;
		PageFactory.initElements(driver, this);
	}


	public WebElement getFinalprcd() {
		return finalprcd;
	}


	public WebElement getChckbox() {
		return chckbox;
	}
	

}
