package testngPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Functional extends Prerun{
	
  @Test(timeOut = 1000)
  public void f() throws InterruptedException {
	  Thread.sleep(500);
	  System.out.println("Inside the test method");
	  //Assert.assertTrue(1 == 2);
  }
  
  @Test()
  @Parameters({"firstName", "lastName"})
  public void displayNames(String firstName, String lastName) {
	  System.out.println("First Name is: " + firstName);
	  System.out.println("Last Name is: " + lastName);
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Inside the BeforeTest method");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Inside the BeforeClass method");  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Inside the BeforeMethod method");
  }
  
  
  /*****************************************************************************/

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Inside the AftereMethod method");
  }
  

  @AfterClass
  public void afterClass() {
	  System.out.println("Inside the AfterClass method");
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("Inside the AfterTest method");
  }
  
  
}
