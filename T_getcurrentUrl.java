package TESTNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class T_getcurrentUrl {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://eroomrent.in");
  }
  @Test
  public void f1() {
	  driver.findElement(By.partialLinkText("Contact")).click();
	  System.out.println(driver.getCurrentUrl());
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.manage().window().maximize();
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("WebDriver.chrome.driver","C://ChromeDriver.exe");
		driver = new ChromeDriver();
  }

}
