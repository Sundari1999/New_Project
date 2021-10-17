package com.Pomcls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceedto_Check2 {
	@FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")
	private WebElement prcd;
	public WebDriver driver;

	public Proceedto_Check2(WebDriver dr6) {
		this.driver= dr6;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPrcd() {
		return prcd;
	}
	

}
