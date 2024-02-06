package pkg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//explicitly wait
		/*
		 * WebDriverWait wait=new WebDriverWait(driver,
		 * Duration.ofMillis(2000));//maximum time
		 * wait.until(ExpectedConditions.visibilityOf(null));//Frequency
		 */	}
	//Fluent wait
	
   
}
