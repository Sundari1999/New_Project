package com.Oct_Base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver get_Driver(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Driver//geckodriver.exe");
			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void waits(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}

	public static void get_URL(String url) {
		driver.get(url);

	}

	public static void clickOnElement(WebElement element) {
		element.click();

	}

	public static void inputValueElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void ActionUse(WebElement element) {
		Actions act = new Actions(driver);
		
		act.moveToElement(element).perform();

	}

	public static void Switchto(WebElement element) {

		driver.switchTo().frame(element);

	}
	
	public static void selecting(WebElement element, String type, String vaule) {
		
		Select s = new Select(element);
		
		if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(vaule);	
		}
		else if (type.equalsIgnoreCase("byVisibleText")) {
            s.selectByVisibleText(vaule);			
		}
		else if (type.equalsIgnoreCase("byIndex")) {
            int parseInt = Integer.parseInt(vaule);
            s.selectByIndex(parseInt);
		}
		
		//s.selectByValue("2");

	}
	
	public static void takescreenshot(WebElement element, String name) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File  ("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_New\\Oct_Maven_Project\\ScreenShot\\"+name);
		FileUtils.copyFile(src, dest);  

	}
	
	public static void parentframe() {
		driver.switchTo().parentFrame();

	}
	public static void javascript_exe(WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);


	}
	
	
}
