package com.Pomcls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Continue_Shop {
	
	@FindBy(xpath = "//i[@class='icon-chevron-left left']")
	private WebElement ctnue;
	public WebDriver driver;

	public Continue_Shop(WebDriver dr3) {
		this.driver= dr3;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCtnue() {
		return ctnue;
	}
	
	

}
