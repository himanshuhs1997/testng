package TESTNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class T_ActionsClassExample {
	WebDriver driver;
  @Test (priority=1)
  public void f() {
	  driver.get("https://eroomrent.in");
  }
  @Test (priority=2)
  public void f1() throws InterruptedException {
	  Actions obj= new Actions(driver);
	   WebElement ele = driver.findElement(By.linkText("Owner-G"));
	   obj.moveToElement(ele).build().perform();
	   driver.findElement(By.partialLinkText("Register")).click();
	  WebElement ele1 = driver.findElement(By.name("txtfname"));
	   WebElement ele2= driver.findElement(By.name("txtPassword"));
	   obj.moveToElement(ele1).click().sendKeys("himanshu");
	   obj.keyDown(Keys.CONTROL).sendKeys("a","c");
	   obj.moveToElement(ele2).click().keyDown(Keys.CONTROL).sendKeys("v");
	   obj.keyUp(Keys.CONTROL).build().perform();
	   Thread.sleep(2000);
	   WebElement ele3 = driver.findElement(By.name("txtmobile1"));
	   WebElement ele4 = driver.findElement(By.name("txtConfirmPassword"));
	   obj.moveToElement(ele3).click().sendKeys("8545256585");
	   obj.keyDown(Keys.CONTROL).sendKeys("a","x");
	   obj.moveToElement(ele4).click().keyDown(Keys.CONTROL).sendKeys("v");
	   obj.keyUp(Keys.CONTROL).build().perform();
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
	  System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
	    driver = new ChromeDriver(); 
  }

  @AfterTest
  public void afterTest() {
	  driver.navigate().refresh();
  }

}
