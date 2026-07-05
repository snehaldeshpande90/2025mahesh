package com.orangehrm.pages;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class LoginPage {
	    WebDriver driver;

	    // वेबपेजवरील एलिमेंट्सचे लोकेटर्स (Locators)
	    By username = By.name("username");
	    By password = By.name("password");
	    By loginBtn = By.tagName("button");

	    // कॉन्स्ट्रक्टर (Constructor) - ड्रायव्हर पास करण्यासाठी
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // लॉगिन करण्यासाठी मेथड्स
	    public void login(String user, String pass) {
	        driver.findElement(username).sendKeys(user);
	        driver.findElement(password).sendKeys(pass);
	        driver.findElement(loginBtn).click();
	    }
	}

