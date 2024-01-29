package TESTNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class T_RegistrationAndLogin {
	WebDriver driver;
  @Test (priority = 1)
  public void f() {
	  driver.get("https://eroomrent.in/index.php");
  }
  @Test (priority = 2)
  public void f1() {
	  Actions obj = new Actions(driver);
	  WebElement ele = driver.findElement(By.linkText("Owner-G"));
	  obj.moveToElement(ele).build().perform();
	  driver.findElement(By.partialLinkText("Register")).click();
  }
  @Test (priority = 3)
  public void f2() {
	   driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.id("txtfname")).sendKeys("himanshu");
		driver.findElement(By.id("txtmobile1")).sendKeys("6526562585");
		driver.findElement(By.id("txtpass")).sendKeys("dhksh@7865");
		driver.findElement(By.id("txtcpass")).sendKeys("dhksh@7865");
		driver.findElement(By.name("txtEmail")).sendKeys("hmsha1997@gmail.com");
		driver.findElement(By.name("btnsubmit")).click();
		driver.switchTo().alert().accept();
  }
  @Test (priority = 4)
  public void f3() { 
	  Actions obj1 = new Actions(driver);
	  WebElement ele1 = driver.findElement(By.linkText("Owner-G"));
	  obj1.moveToElement(ele1).build().perform();
	  
	  driver.findElement(By.partialLinkText("Login")).click();
  }
  @Test (priority =5)
  public void f4() throws InterruptedException {
	  driver.navigate().refresh();
	  Thread.sleep(2000);
	  driver.findElement(By.name("txtEmail")).sendKeys("hmsha1997@gmail.com");
		driver.findElement(By.name("txtPassword")).sendKeys("dhksh@7865");
		driver.findElement(By.name("btnsubmit")).click();
	}
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");
	   driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  }

  @AfterTest
  public void afterTest() {
	  driver.navigate().refresh();
  }

}
