package testngPack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Prerun {

	@BeforeSuite
	  public void beforeSuite() {
		  System.out.println("Inside the BeforeSuite method in Parent Class");  
	  }
	
	@AfterSuite
	  public void afterSuite() {
		  System.out.println("Inside the AfterSuite method in Parent Class");
	  }
}
