package pkg1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_pgm1
{
	@BeforeClass
	  public void beforeClass()
	     {
	    	 System.out.println("beforeClas");
	     }
	
	@BeforeMethod
	  public void beforemethode()
	     {
		System.out.println("beforemethode");
	     }
	@Test
	  public void test()
	     {
		System.out.println("test");
	     
	     }
	@AfterClass
	  public void afterClass()
	     {
		System.out.println("afterClass");
	     
	     }
	
}
