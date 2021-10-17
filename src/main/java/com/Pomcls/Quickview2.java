package com.Pomcls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quickview2 {
	@FindBy(xpath = "//img[@itemprop='image']")
	private WebElement action;
	@FindBy(xpath = "//span[text()='Quick view']")
	private WebElement clkqview;
	@FindBy (xpath = "//a[@name='Blue']")
	private WebElement color;
	@FindBy(xpath = "(//span[text()='Add to cart'])[1]")
	private WebElement addtocart;
	@FindBy (xpath = "//iframe[@class='fancybox-iframe']")
	private WebElement frame2;
	
	
	public WebElement getFrame2() {
		return frame2;
	}
	public WebDriver driver;
	public Quickview2(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	public WebElement getAction() {
		return action;
	}
	public WebElement getClkqview() {
		return clkqview;
	}
	public WebElement getColor() {
		return color;
	}
	public WebElement getAddtocart() {
		return addtocart;
	}
	

}
