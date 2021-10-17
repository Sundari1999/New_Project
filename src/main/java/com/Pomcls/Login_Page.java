package com.Pomcls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver;//-------------->null
	
	@FindBy(xpath= "//input[@id='email']")
	private WebElement username;
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement password;
	@FindBy(xpath = "//i[@class='icon-lock left']")
	private WebElement signin;
	

	
	public WebElement getSignin() {
		return signin;
	}

	public WebElement getPassword() {
		return password;
	}

	public Login_Page(WebDriver driver2) {
		this.driver=driver2;  //---------->runner class driver
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}
	

}
