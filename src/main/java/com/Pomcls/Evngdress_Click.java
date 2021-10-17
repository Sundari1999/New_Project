package com.Pomcls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Evngdress_Click {
	public WebDriver driver;
	
	@FindBy(xpath = "(//a[contains(@title,'Browse our "
				+ "different dresses to choose the perfect dress for an unforgettable evening!')])[1]")
  private WebElement click;
	

	public Evngdress_Click(WebDriver driver4) {
		this.driver= driver4;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClick() {
		return click;
	}
	
}
