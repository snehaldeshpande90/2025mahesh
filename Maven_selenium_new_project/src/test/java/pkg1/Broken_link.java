package pkg1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_link {

	public static void main(String[] args) throws IOException {
		
		WebElement link=null;
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement>links=driver.findElements(By.xpath("//a"));
		
		int linksize=links.size();
		for(int i=0;i<linksize;i++)
		{
			 link=links.get(i);
		}
		String linkurl=link.getAttribute("href");
		URL url=new URL(linkurl);
		HttpURLConnection httpUrlConnection=(HttpURLConnection) url.openConnection();
		httpUrlConnection.setConnectTimeout(3000);
		httpUrlConnection.connect();
		
		int responsecode=httpUrlConnection.getResponseCode();
		if(responsecode==200)
		{
			System.out.println("link not broken");
			System.out.println(httpUrlConnection.getResponseMessage());
		}
		else
		{
			System.out.println("link is broken");
			System.out.println(httpUrlConnection.getResponseMessage());
		}

	}

}
