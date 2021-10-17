package com.Pomcls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Backto_Orders {
	
	@FindBy(xpath = "//a[@class='button-exclusive btn btn-default']")
	private WebElement back;
	public WebDriver driver;

	public Backto_Orders(WebDriver dr12) {
		this.driver = dr12;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBack() {
		return back;
	}
	

}
