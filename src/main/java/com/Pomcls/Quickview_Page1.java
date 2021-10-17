package com.Pomcls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quickview_Page1 {
	public WebDriver driver;
	
	@FindBy(xpath = "//img[@title='Printed Dress']")
	private WebElement moveto_Quickview;
	@FindBy(xpath = "//span[text()='Quick view']")
	private WebElement clk_quickview;
	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	private WebElement swithto_quantity;
	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement quantity;
	@FindBy(xpath = "//select[@name='group_1']")
	private WebElement size;
	@FindBy(xpath = "//a[@name='Pink']")
	private WebElement colour;
	@FindBy(xpath = "//span[text()='Add to cart']")
	private WebElement addto_cart;
	
//	public WebDriver getDriver() {
//		return driver;
//	}
//	public void setDriver(WebDriver driver) {
//		this.driver = driver;
//	}
	public WebElement getAddto_cart() {
		return addto_cart;
	}
	public Quickview_Page1(WebDriver driver5) {
		this.driver=driver5;
		PageFactory.initElements(driver, this);
	}
	public WebElement getMoveto_Quickview() {
		return moveto_Quickview;
	}
	public WebElement getClk_quickview() {
		return clk_quickview;
	}
	public WebElement getSwithto_quantity() {
		return swithto_quantity;
	}
	public WebElement getQuantity() {
		return quantity;
	}
	public WebElement getSize() {
		return size;
	}
	public WebElement getColour() {
		return colour;
	}
	
	
	

}
