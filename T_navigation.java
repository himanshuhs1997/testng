package TESTNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class T_navigation {
	WebDriver driver;

  @Test (priority=1)
  public void f() {
	  driver.get("https://shivaconceptsolution.com/");
  }
  @Test (priority=2)
  public void f1() {
	  driver.navigate().to("https://shivaconceptdigital.com/");
  }
  @Test (priority=3)
  public void f2() {
	  driver.navigate().back();
  }
  @Test (priority=4)
  public void f3() {
	  driver.navigate().forward();;
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
  }

  @BeforeTest
  public void beforeTest() {
		System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");
		 driver = new ChromeDriver();
  }		 
 

}
