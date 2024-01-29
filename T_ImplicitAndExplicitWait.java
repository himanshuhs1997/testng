package TESTNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class T_ImplicitAndExplicitWait {
	WebDriver driver;
  @Test 
  public void f() {
	  driver.get("https://eroomrent.in/index.php");
  }
  @Test
  public void f1() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
	  Select s = new Select(driver.findElement(By.name("ddlcat")));
		s.selectByVisibleText("Flat");
		Thread.sleep(2000);
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("subcat")));
		Select s1 = new Select(driver.findElement(By.id("subcat")));
		s1.selectByVisibleText("3 BHK");
		Select s2 = new Select(driver.findElement(By.name("ddllocation")));
		s2.selectByVisibleText("Tilak Nagar");
		driver.findElement(By.className("btn-one")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.manage().window().maximize();
  } @BeforeTest
  public void beforeTest() {
	  System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		 driver = new ChromeDriver();
  }
}
