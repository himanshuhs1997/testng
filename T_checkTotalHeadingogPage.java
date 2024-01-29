package TESTNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class T_checkTotalHeadingogPage {
	WebDriver driver;
  @Test (priority =1)
  public void f() {
	  driver.get("https://eroomrent.in");
  }
  @Test (priority =2)
  public void f1() {
	  List<WebElement> ele = driver.findElements(By.tagName("h1"));
		System.out.println(ele.size());
       for (WebElement e:ele) {
			System.out.println(e.getText());
		   }
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.navigate().refresh();
  }

  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		 driver = new ChromeDriver();
  }

}
