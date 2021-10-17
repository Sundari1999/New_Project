package com.Pomcls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceedto_Check1 {
	public WebDriver driver;
	
	@FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")
    private WebElement checkout1;
	

	public Proceedto_Check1(WebDriver driver6) {
		this.driver=driver6;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckout1() {
		return checkout1;
	}
	
}
