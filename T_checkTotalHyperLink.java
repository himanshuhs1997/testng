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

public class T_checkTotalHyperLink {
	WebDriver driver;
  @Test (priority =1)
  public void f() {
	  driver.get("https://eroomrent.in");
  }
  @Test (priority=2)
  public void f2() {
	  List<WebElement> ele= driver.findElements(By.tagName("a"));
	  System.out.println(ele.size());
	  int w=0;
	  int nw=0;
	  for(WebElement e:ele) {
		 String s= e.getAttribute("href");
		 int Slashposition =s.lastIndexOf("/");
		 System.out.println(Slashposition);
		 String s1 = s.substring(Slashposition+1);
		 System.out.println(s1);
		 if (s1.equals("")|| s1.equals("#")) {
			 nw++;
		 }else {
			 w++;
		 }
		 System.out.println("path "+s);
		// System.out.println(ele.size());
		 System.out.println("total working link "+w);
		 System.out.println("total not working link "+nw);		 
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

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
