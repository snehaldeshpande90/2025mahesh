package Java_basic_pgm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

public class assertionSample 
{
	
	 public static void main(String args[])
	{
		// System.setProperty("webdriver.chrome.driver","C:\\\\work\\\\chromedriver.exe");  
		 ChromeOptions options=new ChromeOptions();
		// options.addArguments("--disable-notifications");
		 options.addArguments("--disable-notifications");
	        WebDriver driver = new ChromeDriver(options);  
			/*
			 * driver.navigate().to("https://www.spicejet.com/");
			 * Assert.assertFalse(driver.findElement(By.xpath(
			 * "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/div[1]/svg/g/circle[1]"
			 * )).isSelected()); System.out.println(driver.findElement(By.xpath(
			 * "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/div[1]/svg/g/circle[1]"
			 * )).isSelected());
			 * driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			 * driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			 * FluentWait wt=new FluentWait(driver);
			 * wt.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2));
			 */
	        driver.get("https://jqueryui.com/slider/");
	        WebElement  startpoint=driver.findElement(By.xpath("//span[@class=\'ui-slider-handle ui-corner-all ui-state-default\']"));
	        System.out.println(startpoint.getLocation());
	        System.out.println(startpoint.getSize());
	        
	        		
	}
}
