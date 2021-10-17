package com.Pomcls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Order1 {
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement confirm;
	public WebDriver driver;

	public Confirm_Order1(WebDriver dr11) {
		this.driver = dr11;
		PageFactory.initElements(driver, this);
	}

	public WebElement getConfirm() {
		return confirm;
	}
	

}
