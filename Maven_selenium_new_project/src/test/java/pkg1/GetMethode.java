package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethode 
{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@name='field-keywords']"));
	
		/*
		 * WebElement
		 * serchbox=driver.findElement(By.xpath("//input[@name='field-keywords']"));
		 * //serchbox.getAttribute("id");
		 * System.out.println(serchbox.getAttribute("placeholder"));
		 * if(serchbox.isDisplayed()&&serchbox.isEnabled()) {
		 * serchbox.sendKeys("Mobile"); }
		 */
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		// js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,1000)");
		 
		List<WebElement> link=driver.findElements(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]//a"));
		for(WebElement ele:link)
		{
			//ele.getText();
			//System.out.println(ele.getText());
			
			String name =ele.getText();
			
			if(name.equalsIgnoreCase("About us"))
			{
				System.out.println(ele.getText());
				Thread.sleep(2000);
				ele.click();			}
		}
		
		driver.manage().window().maximize();
		
	}

}
