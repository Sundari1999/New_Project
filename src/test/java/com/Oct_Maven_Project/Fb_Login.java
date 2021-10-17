package com.Oct_Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Oct_Base.Base_Class;

public class Fb_Login extends Base_Class {
	
	public static WebDriver driver; // ----->null

	public static void main(String[] args) {

		driver = get_Driver("chrome");
		waits(10);
		get_URL("https://www.facebook.com/");
		
		WebElement emailid = driver.findElement(By.id("email"));
		inputValueElement(emailid, "arunashankar37@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		inputValueElement(password, "aruna@7409");
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		clickOnElement(login);


}
}