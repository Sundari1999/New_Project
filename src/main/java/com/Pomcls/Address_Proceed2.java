package com.Pomcls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Proceed2 {
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/form/p/button/span")
	private WebElement add_proceed;
	public WebDriver driver;

	public Address_Proceed2(WebDriver dr9) {
		this.driver=dr9;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdd_proceed() {
		return add_proceed;
	}
	

}
