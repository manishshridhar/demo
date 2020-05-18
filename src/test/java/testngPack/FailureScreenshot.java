package testngPack;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import listeners.CustomListener;

@Listeners(CustomListener.class)
public class FailureScreenshot {
	public static WebDriver driver;
	
	@BeforeMethod
	public void beforeTest() {
		System.out.println("Inside Before Test");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void method1() throws InterruptedException {
		System.out.println("Inside Test");
		Thread.sleep(5000);
		assertTrue(false);
	}
	
	@Test
	public void method2() throws InterruptedException {
		System.out.println("Inside Test");
		Thread.sleep(5000);
		assertTrue(false);
	}
	
	@AfterMethod
	public void afterTest() {
		driver.quit();
		System.out.println("Inside After Test");
	}

}
