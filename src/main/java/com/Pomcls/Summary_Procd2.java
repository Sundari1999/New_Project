package com.Pomcls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_Procd2 {
	@FindBy(xpath= "/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")
	private WebElement proceed_smry;
	public WebDriver driver;

	public Summary_Procd2(WebDriver drive) {
		this.driver = drive;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceed_smry() {
		return proceed_smry;
	}
	

}
