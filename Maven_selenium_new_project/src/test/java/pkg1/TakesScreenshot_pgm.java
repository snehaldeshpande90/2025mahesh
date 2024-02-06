package pkg1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshot_pgm 
{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 Thread.sleep(2000);
		 Actions act=new Actions(driver);
		 act.moveToElement(driver.findElement(By.xpath("//span[@class='icp-color-base']")));
		 act.build().perform();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp-footer-flyout\"]/div[2]/a[9]/span/div")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
		Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@aria-label='mobile under 15000']")).click();
			
			Thread.sleep(2000);
			
			 driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
				Thread.sleep(2000);
			 //driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_3\"]")).click();
			 Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,4000)");
			
			js.executeScript("window.scrollBy(0,-4000)");
			
			/*
			 * WebElement
			 * we=driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
			 * 
			 * Select dropdown=new Select(we);
			 * 
			 * dropdown.selectByVisibleText("Price: Low to High");
			 */
			
		//WebElement ele=driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));
		TakesScreenshot tc=(TakesScreenshot)driver ;
		
		File src=tc.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\mahesh\\test11.jpeg");
		FileHandler.copy(src, dest);
		
		////span[@class='icp-color-base']

	}

}
