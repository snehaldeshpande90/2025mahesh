package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactDetailsPage {
    WebDriver driver;

    // Locators
    By street1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]");
    By saveBtn = By.xpath("//button[@type='submit']");

    public ContactDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void updateStreetAddress(String address) {
        driver.findElement(street1).clear();
        driver.findElement(street1).sendKeys(address);
    }

    public void clickSave() {
        driver.findElement(saveBtn).click();
    }
}