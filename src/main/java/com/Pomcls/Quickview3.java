package com.Pomcls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quickview3 {
	@FindBy(xpath = "(//img[@class='replace-2x img-responsive'])[4]")
	private WebElement moveto;
	@FindBy(xpath = "(//span[text()='Quick view'])[3]")
	private WebElement clk_qckview;
	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	private WebElement swithto;
	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement quantity;
	@FindBy(xpath = "//select[@name='group_1']")
	private WebElement size;
	@FindBy(xpath = "//button[@name='Submit']")
	private WebElement addto_cart;
	public WebDriver driver;
	public Quickview3(WebDriver dr5) {
		this.driver=dr5;
		PageFactory.initElements(driver, this);
	}
	public WebElement getMoveto() {
		return moveto;
	}
	public WebElement getClk_qckview() {
		return clk_qckview;
	}
	public WebElement getSwithto() {
		return swithto;
	}
	public WebElement getQuantity() {
		return quantity;
	}
	public WebElement getSize() {
		return size;
	}
	public WebElement getAddto_cart() {
		return addto_cart;
	}
	
	
}
