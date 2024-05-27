package Java_basic_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SliderBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://jqueryui.com/slider/");
WebElement  startpoint=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default ui-state-hover ui-state-active']"));
System.out.println(startpoint.getLocation());
System.out.println(startpoint.getSize());


	}

}
