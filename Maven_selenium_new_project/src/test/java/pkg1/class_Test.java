package pkg1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class class_Test {
	
	WebDriver driver=null;
	
	void test() throws IOException
	{
		
		
		driver.get("https://www.amazon.in/");
		
		SetuupScreenshot y=new SetuupScreenshot();
	
		y.test2(driver);
		

		
	}
	

}
