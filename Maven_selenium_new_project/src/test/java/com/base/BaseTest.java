package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager; // WebDriverManager import करा

public class BaseTest 
{
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        // WebDriverManager वापरून ब्राउझर ड्रायव्हर ऑटोमॅटिक मॅनेज करा
        WebDriverManager.chromedriver().setup();
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @AfterMethod
    public void tearDown() {
        // ब्राउझर बंद करणे गरजेचे आहे, जेणेकरून बॅकग्राउंडमध्ये मेमरी वापरली जाणार नाही
        if (driver != null) {
            //driver.quit();
        }
    }
}