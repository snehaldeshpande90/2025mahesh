package com.orangehrm.pages; // हे पॅकेज ओळखून घेते

import org.openqa.selenium.By; // सेलेनियममधील बाय क्लास इम्पोर्ट करतो
import org.openqa.selenium.WebDriver; // वेबड्रायव्हर इंटरफेस इम्पोर्ट करतो
import org.openqa.selenium.support.ui.WebDriverWait; // स्पष्ट वेट (Wait) साठी इम्पोर्ट करतो
import org.openqa.selenium.support.ui.ExpectedConditions; // विशिष्ट स्थितीची वाट पाहण्यासाठी इम्पोर्ट करतो
import java.time.Duration; // वेळ मोजण्यासाठी ड्यूरेशन क्लास इम्पोर्ट करतो

public class LoginPage { // लॉगिन पेजचा मुख्य क्लास
	WebDriver driver; // ड्रायव्हरचा ऑब्जेक्ट तयार करतो
	WebDriverWait wait; // वेटचा ऑब्जेक्ट तयार करतो

	By username = By.name("username"); // युजरनेम इनपुट फील्डचा लोकेटर
	By password = By.name("password"); // पासवर्ड इनपुट फील्डचा लोकेटर
	By loginBtn = By.xpath("//button[@type='submit']"); // लॉगिन बटणाचा लोकेटर

	public LoginPage(WebDriver driver) { // कॉन्स्ट्रक्टर - ड्रायव्हर इनिशियलाईज करतो
		this.driver = driver; // क्लासमधील ड्रायव्हरला व्हॅल्यू देतो
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // २० सेकंदाचा वेट सेट करतो
	}

	public void login(String user, String pass) { // लॉगिन करण्यासाठी मेथड
		wait.until(ExpectedConditions.visibilityOfElementLocated(username)); // युजरनेम दिसेपर्यंत वाट पाहतो
		driver.findElement(username).sendKeys(user); // युजरनेम टाईप करतो
		driver.findElement(password).sendKeys(pass); // पासवर्ड टाईप करतो
		driver.findElement(loginBtn).click(); // लॉगिन बटणावर क्लिक करतो
	}
}