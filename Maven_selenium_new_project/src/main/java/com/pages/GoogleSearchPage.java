


	package com.pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class GoogleSearchPage {
	    WebDriver driver;

	    // १. लोकेटर्स (Locators)
	    By searchBox = By.name("q");

	    // २. कन्स्ट्रक्टर (Constructor)
	    public GoogleSearchPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // ३. ॲक्शन्स (Actions)
	    public void enterSearchText(String text) {
	        driver.findElement(searchBox).sendKeys(text);
	    }
	}

