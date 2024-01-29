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

public class T_StaticandDynamicTable {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://demo.guru99.com/test/web-table-element.php");
  }
  @Test
  public void f1() {
	  List<WebElement> ele= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		System.out.println("total row are  "+ele.size());
		List<WebElement> ele1 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("total column are  "+ele1.size());
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.manage().window().maximize();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		 driver = new ChromeDriver();
  }

}
