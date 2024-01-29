package TESTNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class T_alertConfirmPromptExample {
	WebDriver driver;
  @Test (priority =1)
  public void f() {
	  driver.get("https://www.shivaconceptsolution.com/backupmain/test3.html");
  }
  @Test (priority =2)
  public void f1() {
	  driver.findElement(By.cssSelector("input[value=alert]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();  
  }
  @Test (priority =3)
  public void f2() throws InterruptedException {
	  Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value=confirm]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();  
  }
  @Test (priority =4)
  public void f3() throws InterruptedException {
	  Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value=prompt]")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Automation");
		driver.switchTo().alert().accept();  
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
	  System.setProperty("Webdrive.chrome.driver","c://chromedriver.exe");
	  driver = new ChromeDriver();
  }


}
