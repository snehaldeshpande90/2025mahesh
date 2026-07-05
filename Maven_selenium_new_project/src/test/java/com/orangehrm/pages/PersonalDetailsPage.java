package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalDetailsPage {
    WebDriver driver;

    // Locators
    By firstName = By.name("firstName");
    By saveBtn = By.xpath("//button[@type='submit']");

    public PersonalDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void updateFirstName(String name) {
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(name);
    }

    public void clickSave() {
        driver.findElement(saveBtn).click();
    }
}