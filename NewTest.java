package TESTNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class NewTest {
	WebDriver driver ;
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

}
