package com.Hotelapp;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import com.Oct_Base.Base_Class;
	public class Adactin_Hotelapp extends Base_Class {

		public static WebDriver driver; // ----->null

		public static void main(String[] args) {

			driver = get_Driver("chrome");
			waits(10);
			get_URL("https://adactinhotelapp.com/");

			WebElement username = driver.findElement(By.id("username"));
			inputValueElement(username, "Sundari0207");

			WebElement password = driver.findElement(By.id("password"));
			inputValueElement(password, "Aruna@1234");

			WebElement login = driver.findElement(By.id("login"));
			clickOnElement(login);

			WebElement location = driver.findElement(By.id("location"));
			selecting(location, "byvalue", "London");

			WebElement selhotel = driver.findElement(By.id("hotels"));
			selecting(selhotel, "byVisibleText", "Hotel Sunshine");

			WebElement selroom_type = driver.findElement(By.id("room_type"));
			selecting(selroom_type, "byvalue", "Deluxe");

			WebElement no_of_rooms = driver.findElement(By.id("room_nos"));
			selecting(no_of_rooms, "byIndex", "3");

			WebElement adults_per_room = driver.findElement(By.id("adult_room"));
			selecting(adults_per_room, "byIndex", "3");

			WebElement child_per_room = driver.findElement(By.id("child_room"));
			selecting(child_per_room, "byIndex", "0");

			WebElement search = driver.findElement(By.id("Submit"));
			clickOnElement(search);

			WebElement hotel_radiobutton = driver.findElement(By.id("radiobutton_0"));
			clickOnElement(hotel_radiobutton);

			WebElement clickcontinue = driver.findElement(By.id("continue"));
			clickOnElement(clickcontinue);

			WebElement firstname = driver.findElement(By.id("first_name"));
			inputValueElement(firstname, "Sundari");

			WebElement lastname = driver.findElement(By.id("last_name"));
			inputValueElement(lastname, "Shankar");

			WebElement address = driver.findElement(By.id("address"));
			inputValueElement(address, "NO 15, Siraj Street, Nsk nagar");

			WebElement credit_card = driver.findElement(By.id("cc_num"));
			inputValueElement(credit_card, "9876543219876543");

			WebElement card_type = driver.findElement(By.id("cc_type"));
			selecting(card_type, "byVisibleText", "VISA");

			WebElement expiry_month = driver.findElement(By.id("cc_exp_month"));
			selecting(expiry_month, "byIndex", "2");

			WebElement expiry_year = driver.findElement(By.id("cc_exp_year"));
			selecting(expiry_year, "byValue", "2021");

			WebElement cvv_num = driver.findElement(By.id("cc_cvv"));
			inputValueElement(cvv_num, "376");

			WebElement booking = driver.findElement(By.id("book_now"));
			clickOnElement(booking);
			
			WebElement myItinerary = driver.findElement(By.xpath("(//input[@type='button'])[2]"));
			clickOnElement(myItinerary);

		}

	}



