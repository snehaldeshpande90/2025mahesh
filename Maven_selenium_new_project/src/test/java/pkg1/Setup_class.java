package pkg1;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Setup_class {

	public static void main(String[] args) throws IOException 
	{
		class_Test x=new class_Test();

		x.driver=new ChromeDriver();
		x.test();
		
		x.driver=new FirefoxDriver();
		x.test();
		x.driver=new EdgeDriver();
		x.test();
	}

}
