package com.Pomcls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Proceed1 {
	
	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement add_proceed;
	public WebDriver driver;

	public Address_Proceed1(WebDriver driver8) {
		this.driver= driver8;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdd_proceed() {
		return add_proceed;
	}
	

}
