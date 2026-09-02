package com.orangehrm.pages;

import org.openqa.selenium.Keys; // हे इम्पोर्ट ॲड करा
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class PersonalDetailsPage {
	WebDriver driver;
	WebDriverWait wait;

	By firstNameField = By.name("firstName");
	By saveBtn = By.xpath("//button[@type='submit']");

	public PersonalDetailsPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	public void updateFirstName(String name) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField));

		// Ctrl + A दाबून सिलेक्ट करा आणि मग Backspace दाबा
		driver.findElement(firstNameField).sendKeys(Keys.CONTROL + "a");
		driver.findElement(firstNameField).sendKeys(Keys.BACK_SPACE);

		driver.findElement(firstNameField).sendKeys(name);
	}

	public void clickSave() {
		wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
		driver.findElement(saveBtn).click();
	}
}