package pkg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class newclass 
{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		 * WebDriver driver=new ChromeDriver();
		 * driver.get("https://formstone.it/components/dropdown/demo/");
		 * driver.manage().window().maximize(); 
		 * JavascriptExecutor js =
		 * (JavascriptExecutor) driver; js.executeScript("window.scrollBy(0,8000)");
		 */
   //driver.get("https://www.amazon.in/");
   //WebElement button=driver.findElement(By.name("demo_basic"));
   //Thread.sleep(2000);
   
  // WebElement btn=driver.findElement(By.id("demo_basic-dropdown-selected"));
   //btn.click();
	/*
	 * Select fruits = new Select(driver.findElement(By.id("demo_native")));
	 * fruits.selectByVisibleText("Three");
	 */
   
	/*
	 * String baseURL = "https://demo.guru99.com/test/newtours/register.php";
	 * 
	 * driver.get(baseURL);
	 * 
	 * Select drpCountry = new Select(driver.findElement(By.name("country")));
	 * drpCountry.selectByIndex(1);s
	 */
	
	
	/*
	 * List<WebElement> list1=driver.findElements(By.id("demo_native")); Iterator
	 * itr =list1.listIterator(); 
	 * while(itr.hasNext()) {
	 * 
	 * System.out.println(itr); }
	 */
	
	ArrayList al=new ArrayList();

	
	al.add("snehal");
	al.add("mahesh");
	
	al.add("snehal1");
	al.add("mahesh2");
	
	//System.out.println(al);
	Iterator itr =al.iterator(); 
	
	
	 while(itr.hasNext()) {
		 
	 
	 String s1=(String) itr.next();	 
	 System.out.println(s1);
	 }
	 
	 List<String> list1=new ArrayList<String>();  
	 list1.add("Mango");  
	  list1.add("Apple");  
	  list1.add("Banana");  
	  list1.add("Grapes");  
	  //Sorting the list  
	  //Collections.sort(list1);  
	   //Traversing list through the for-each loop
	  
	  for(String snehal:list1) 
		  
	    System.out.println(snehal);  
	}

}
