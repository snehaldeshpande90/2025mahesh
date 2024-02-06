package pkg1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_up {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * WebDriver driver=new ChromeDriver();
		 * driver.get("https://www.demo.guru99.com/test/delete_customer.php");
		 * Thread.sleep(2000); WebElement customer=driver.findElement(By.
		 * xpath("//input[@type='text' and@ name='cusid']")); customer.sendKeys("123");
		 * WebElement submit=driver.findElement(By.xpath("//input[@value='Submit']"));
		 * submit.click(); Thread.sleep(2000);
		 * 
		 * Alert alt=driver.switchTo().alert(); System.err.println(alt.getText());
		 * Thread.sleep(2000); //alt.accept(); alt.dismiss();
		 */
		
		
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demoqa.com/browser-windows");
/*
	        // Open new child window within the main window
	        driver.findElement(By.id("windowButton")).click();

	        //Get handles of the windows
	        String mainWindowHandle = driver.getWindowHandle();
	        Set<String> allWindowHandles = driver.getWindowHandles();
	        Iterator<String> iterator = allWindowHandles.iterator();

	        // Here we will check if child window has other child windows and will fetch the heading of the child window
	        while (iterator.hasNext()) {
	            String ChildWindow = iterator.next();
	                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
	                driver.switchTo().window(ChildWindow);
	                driver.manage().window().maximize();
	                WebElement text = driver.findElement(By.id("sampleHeading"));
	                System.out.println("Heading of child window is " + text.getText());
	            }*/
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newWindowBtn")).click();
	
		
				driver.findElement(By.id("newTabBtn")).click();
				driver.findElement(By.id("newWindowBtn")).click();
				
				Set<String>winName=driver.getWindowHandles();
				for(String win:winName)
				{
					String name=driver.switchTo().window(win).getTitle();
					//System.out.println(name);
					if(name.contentEquals("AlertsDemo - H Y R Tutorials"))
					{
						driver.switchTo().window(win);
						driver.findElement(By.id("alertBox")).click();
						Alert alt=driver.switchTo().alert();
						System.out.println(alt.getText());
						alt.accept();
					
					}
				
					
				}
				
		            System.out.println(winName);
		
		
		
	        }
		
	}


