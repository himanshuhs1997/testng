package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver ;
	@BeforeSuite
	public void beforesuite() {
		System.out.println("before suite");
	}
	@BeforeClass 
	public void beforeclass() {
		System.out.println("before class ");
	}
	  @Test (priority= 2)
	  public void f() {
		   driver.get("https://www.shivaconceptsolution.com");
	  }
	  @Test (priority = 1)
	  public void f1() {
		   driver.get("https://shivaconceptdigital.com/");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("ChromeDriver.chrome.driver","c://Chromedriver.exe");
		  driver = new ChromeDriver();
	  }
	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }
	  @BeforeMethod
	  public void beforemethod() {
		  driver.manage().window().maximize();
	  }
	  @AfterMethod
	  public void aftermethod() throws InterruptedException {
		  driver.get("https://www.shivatutorials.com/");
		  Thread.sleep(2000);
	  }
	  @AfterClass 
	  public void afterclass() {
		  System.out.println("after class");
	  }
	  @AfterSuite
	  public void aftersuite() {
		System.out.println("after suite");  
	  }
}
