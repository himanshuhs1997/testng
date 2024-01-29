package TESTNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class T_cssSelectorAndPagesourceCode {
	WebDriver driver;
  @Test (priority=1)
  public void f() {
	  driver.get("https://eroomrent.in/ownerreg.php");
  }
  @Test (priority=2)
  public void f1() {
	  driver.findElement(By.cssSelector("input[type=text]")).sendKeys("himanshu");
		driver.findElement(By.cssSelector("input[type=number]")).sendKeys("8545652535");
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("hsaasd97@852");
		driver.findElement(By.cssSelector("input[name=txtConfirmPassword]")).sendKeys("hsaasd97@852");
		driver.findElement(By.cssSelector("input[type=email]")).sendKeys("hshimnsu97181@gmail.com");
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		driver.switchTo().alert().accept();
  }
  @Test (priority =3)
  public void f2() {
	  driver.navigate().to("https://eroomrent.in/ownerlogin.php");
		driver.findElement(By.cssSelector("input[type=email]")).sendKeys("hshimnsu97181@gmail.com");
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("hsaasd97@852");
		driver.findElement(By.cssSelector("input[type=submit")).click();
		driver.findElement(By.cssSelector("a[href='logout.php']")).click();
  }
  @AfterTest 
  public void aftertest() {
	 System.out.println(driver.getPageSource()); 
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
