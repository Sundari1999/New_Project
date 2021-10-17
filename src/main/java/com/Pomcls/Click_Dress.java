package com.Pomcls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click_Dress {
	public WebDriver driver;
	
	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement click_Btn;

	public Click_Dress(WebDriver driver3) {
		this.driver=driver3;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClick_Btn() {
		return click_Btn;
	}
	

}
