package com.Property_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class Configuration_Reader {
	public static Properties p;
	
	
	public Configuration_Reader() throws Throwable  {
		File f = new File(
			"C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_New\\Oct_Maven_Project\\src\\main\\java\\com\\Property_File\\Configuration.properties");
	FileInputStream fis = new FileInputStream(f);
	
	p= new Properties();
	
	p.load(fis);
	
	}
	
	public String getUsername() {
		//retrieve the user name
		String username = p.getProperty("username");
		return username;

	}
	
	public String getPassword() {
		//retrieve the password
		String password = p.getProperty("password");
		return password;

	}
	public String getUrl() {
		//retrieve the url
		String url = p.getProperty("url");
		return url;

	}
	
	

}
