package com.Pomcls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Proceed {
	
	@FindBy(xpath = "//input[@name='cgv']")
	private WebElement checkbox_clk;
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement ship_proceedclk;
	
	
	public WebDriver driver;

	public WebElement getShip_proceedclk() {
		return ship_proceedclk;
	}

	
	public WebElement getCheckbox_clk() {
		return checkbox_clk;
	}

	public Shipping_Proceed(WebDriver driver9) {
		this.driver= driver9;
		PageFactory.initElements(driver, this);
	}

	
	

}
