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

public class T_checkTotalimage{
	/*
	WebDriver driver;
  @Test (priority=1)
  public void f() {
	  driver.get("https://eroomrent.in/index.php");
  }
  @Test (priority=2)
  public void f1() {
	  List<WebElement> ele = driver.findElements(By.className("img-fluid"));
	  System.out.println("total image is "+ele.size());
	  for(WebElement e:ele) {
		  String s= e.getAttribute("src");
		  System.out.println(s);
}}
  @BeforeMethod
  public void beforeMethod() {
	 driver.manage().window().maximize();
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");	
	    driver = new ChromeDriver();
  }
*/

//================================================================
	
	// check only total header and footer link
	
	WebDriver driver;
	  @Test (priority=1)
	  public void f() {
		  driver.get("https://eroomrent.in/index.php");
	  }
	  @Test (priority=2)
	  public void f1() {
		  WebElement header = driver.findElement(By.className("navbar"));
		  int th = header.findElements(By.tagName("a")).size();
		  System.out.println("total header link are "+th);
	}
	  @Test (priority=3)
	  public void f2() {
		  WebElement footer= driver.findElement(By.className("footer"));
		  int tf = footer.findElements(By.tagName("a")).size();
		  System.out.println("total footer link are "+tf);
	}
	  @BeforeMethod
	  public void beforeMethod() {
		 driver.manage().window().maximize();
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");	
		    driver = new ChromeDriver();
	  }
	
}
