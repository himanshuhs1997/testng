package TESTNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class T_cssvalueAndLocation {
	WebDriver driver;
  @Test (priority=1)
  public void f() {
	  driver.get("https://www.shivaconceptsolution.com/backupmain/test.html");
  }
  @Test (priority=2)
  public void f1() {
	  WebElement textele = driver.findElement(By.xpath("//html/body/input[8]"));
		String color = textele.getCssValue("color");
		String width = textele.getCssValue("width");
		String height = textele.getCssValue("height");
	     System.out.println("color is "+color);
		 System.out.println("width is "+width);
		 System.out.println("height is "+height);
  }
  
    // location
  @Test (priority=3)
  public void f2() {
	  WebElement ele = driver.findElement(By.tagName("input"));
	    int s= ele.getLocation().x;
	    int s1=ele.getLocation().y;
	    System.out.println("x is "+s);
	    System.out.println("y is "+s1);  
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
