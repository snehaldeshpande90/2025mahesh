package Java_basic_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEbTable 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://cosmocode.io/automation-practice-webtable/");
  int rowcount=driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
  int colcount=driver.findElements(By.xpath("//table[@id='countries']//tr[1]//td")).size();
  for(int i=2;i<=rowcount;i++)
  {
	  for(int j=2;j<=colcount;j++)
	  {
		 String value=driver.findElement(By.xpath("//table[@id='countries']//tr["+i+"]//td["+j+"]")).getText();
	  
	   System.out.print(value);
	   System.out.println(",");
	  }
	  System.out.println();
  }
  }

}
