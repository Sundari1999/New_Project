package com.Pomcls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_Proceed1 {
	@FindBy(xpath ="(//a[@title='Proceed to checkout'])[2]")
	private WebElement summary1;
	public WebDriver driver;

	public Summary_Proceed1(WebDriver driver7) {
		this.driver = driver7;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSummary1() {
		return summary1;
	}
	

}
