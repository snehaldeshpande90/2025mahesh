package pkg1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class winHandles {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");

        // Open new child window within the main window
        driver.findElement(By.id("windowButton")).click();

        //Get handles of the windows
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        
		/*
		 * Iterator<String> iterator = allWindowHandles.iterator();
		 * 
		 * // Here we will check if child window has other child windows and will fetch
		 * the heading of the child window while (iterator.hasNext()) { String
		 * ChildWindow = iterator.next(); if
		 * (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
		 * driver.switchTo().window(ChildWindow); driver.manage().window().maximize();
		 * WebElement text = driver.findElement(By.id("sampleHeading"));
		 * System.out.println("Heading of child window is " + text.getText()); } }
		 */
        
        ArrayList <String>list=new ArrayList<String>(allWindowHandles);
        String Mainwindow=list.get(0);
        String childWindow=list.get(1);
        System.out.println(Mainwindow);
        System.out.println(childWindow);
       String namechildurl= driver.switchTo().window(childWindow).getCurrentUrl();
       System.out.println(namechildurl);
       
       WebElement text = driver.findElement(By.id("sampleHeading"));
		  System.out.println("Heading of child window is " + text.getText());
		  driver.switchTo().window(Mainwindow);
		  
		  System.out.println(driver.getCurrentUrl());
		  
		  
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  for(int i=1;i<5;i++)
		  {
		  File src=ts.getScreenshotAs(OutputType.FILE);
		  File dest=new File("C:\\mahesh\\test"+i+".jpeg");
		  FileHandler.copy(src, dest);
		  }

}
}
