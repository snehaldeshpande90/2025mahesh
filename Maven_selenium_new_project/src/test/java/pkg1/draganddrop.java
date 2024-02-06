package pkg1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement dragele=driver.findElement(By.xpath("//li[@id='credit1']/a"));//sales
		WebElement dropele=driver.findElement(By.xpath("//ol[@id='loan']/li"));
		Actions act= new Actions(driver);
		act.moveToElement(dragele);
		act.clickAndHold();
		act.moveToElement(dropele);
		act.release();
		act.build().perform();
		
		/*
		 * TakesScreenshot ts=(TakesScreenshot)driver; for(int i=1;i<5;i++) { File
		 * src=ts.getScreenshotAs(OutputType.FILE); File dest=new
		 * File("C:\\mahesh\\test"+i+".jpeg"); FileHandler.copy(src, dest); }
		 */
		SetuupScreenshot y=new SetuupScreenshot();
		y.test2(driver);
		 
	}

}
