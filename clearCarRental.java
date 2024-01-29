package TESTNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class clearCarRental {
	WebDriver driver;
	
  @Test (priority=1)
  public void f() {
	  driver.findElement(By.id("searchOpt1")).click();
		driver.findElement(By.id("oneW")).click();
		driver.findElement(By.name("sourceCity")).sendKeys("indore");
		driver.findElement(By.name("destinationCity")).sendKeys("bhopal");
		driver.findElement(By.name("travelDate")).sendKeys("08-sep-2023");
		driver.findElement(By.id("timePickExample")).sendKeys("05:15 PM");
		driver.findElement(By.xpath("//*[@id=\"buttonDiv\"]/button")).click();
		driver.navigate().back();
		}
  @Test (priority=2)
   public void f1(){
	  driver.findElement(By.id("searchOpt1")).click();
		driver.findElement(By.id("tripOpt1")).click();
		driver.findElement(By.id("sourceCity4")).sendKeys("mumbai");
		driver.findElement(By.id("destinationCity4")).sendKeys("delhi");
		driver.findElement(By.id("datepicker")).sendKeys("10-sep-2023");
		driver.findElement(By.name("travelDateEnd")).sendKeys("12-sep-2023");
		driver.findElement(By.name("pTime")).sendKeys("07:15 PM");
		driver.findElement(By.xpath("//html/body/div[2]/div[1]/div/div[3]/div/form/div/div[1]/div[7]/button")).click();

  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  Thread.sleep(3000);
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
		 driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.clearcarrental.com/");
	}

}
