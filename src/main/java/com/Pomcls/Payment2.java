package com.Pomcls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment2 {
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement bankdts;
	public WebDriver driver;

	public Payment2(WebDriver dr23) {
		this.driver = dr23;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBankdts() {
		return bankdts;
	}
	

}
