package pkg1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class SetuupScreenshot 
{
	
	public void test2(WebDriver driver) throws IOException
	{
		
		TakesScreenshot tc=(TakesScreenshot)driver ;
		
		File src=tc.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\mahesh\\test11.jpeg");
		FileHandler.copy(src, dest);
	}
	
}
