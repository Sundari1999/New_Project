package com.Pomcls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Click {
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement clk;
	public WebDriver driver;

	public Women_Click(WebDriver dr4) {
		this.driver = dr4;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClk() {
		return clk;
	}
	

}
