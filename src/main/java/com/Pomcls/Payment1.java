package com.Pomcls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment1 {
	
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement bank;
	public WebDriver driver;

	public Payment1(WebDriver dr10) {
		this.driver= dr10;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBank() {
		return bank;
	}
	

}
