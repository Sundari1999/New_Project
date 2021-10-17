package com.Pomcls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click_Tshirt {
	@FindBy(xpath= "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")
	private WebElement click;
	public WebDriver driver;

	public Click_Tshirt(WebDriver dr01) {
		this.driver= dr01;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClick() {
		return click;
	}
	

}
