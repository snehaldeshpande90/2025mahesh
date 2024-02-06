package pkg1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		 WebDriver driver=new ChromeDriver(options);
 driver.get("https://www.goibibo.com/");
 
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div[2]/span/span")).click();
 driver.findElement(By.xpath("//div[@class='sc-1gt8xf5-0 bPZJjI']//div[3]//div[1]")).click();
 //driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]/div[3]/p")).click();
 
 
 //driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[3]/span[2]")).click();
 
 
 
 
	/*
	 * List<WebElement> alldate=driver.findElements(By.xpath(
	 * "//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]"));  act.moveToElement((WebElement) alldate);
	 */

	
	 WebElement wb=driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div[7]/p"));
	 Actions act=new Actions(driver);
	act.click(wb);
	driver.findElement(By.xpath("class=\"fswTrvl__done\"")).click();

	act.build().perform();
	 
 }
 
 
 
 
 
 
 
	}

