package TESTNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class T_imageNameLogoPath {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://eroomrent.in");
  }
  @Test
  public void f1() {
	  WebElement ele = driver.findElement(By.className("img-fluid"));
	  String s= ele.getAttribute("src");
	  int position = s.lastIndexOf("/");
	  String image = s.substring(position+1);
	  System.out.println("image name "+image);     // image name
	  String alt = ele.getAttribute("alt");
	  System.out.println("src is "+s);            // logo path
	  driver.get(s);                             // image show 
	  System.out.println("alt is "+alt);
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void beforeTest() {
		System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");
		 driver = new ChromeDriver();
  }

}
