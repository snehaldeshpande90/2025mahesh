package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.get("https://www.amazon.in/");
		WebElement signin=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		WebElement orderout=driver.findElement(By.xpath(("//span[text()='Your Orders']")));
		act.moveToElement(signin).perform();
		act.moveToElement(orderout).perform();
		act.click().perform();
		
		

	}

}
