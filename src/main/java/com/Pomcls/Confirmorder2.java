package com.Pomcls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmorder2 {
	
	@FindBy(xpath="//span[text()='I confirm my order']")
	private WebElement cnfrm_click;
	public WebDriver driver;

	public Confirmorder2(WebDriver driver12) {
		this.driver=driver12;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCnfrm_click() {
		return cnfrm_click;
	}
	

}
