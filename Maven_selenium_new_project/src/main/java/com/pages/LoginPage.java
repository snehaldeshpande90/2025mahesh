package com.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    // लोकेटर्स
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        // १० सेकंदांचा वेट (Wait) सेट करणे
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void login(String user, String pass) {
        // 'username' फील्ड दिसेपर्यंत थांबणे
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys(user);
        driver.findElement(passwordField).sendKeys(pass);
        driver.findElement(loginButton).click();
    }
}