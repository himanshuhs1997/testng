package TESTNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class T_fullbooking {
	
	WebDriver driver;
  @Test (priority =1)
  public void f() {
	  driver.get("https://eroomrent.in/index.php");
  }
  @Test (priority =2)
  public void f1() {
	  Actions obj = new Actions(driver);
		WebElement ele = driver.findElement(By.linkText("Owner-G"));
		obj.moveToElement(ele).build().perform();
		driver.findElement(By.partialLinkText("Login")).click();
  }
  @Test (priority =3)
  public void f2() {
	  driver.findElement(By.name("txtEmail")).sendKeys("himanshusharma0805@gmail.com");
		driver.findElement(By.name("txtPassword")).sendKeys("Anshu@987");
		driver.findElement(By.name("btnsubmit")).click();
  }
  @Test (priority =4)
  public void f3() {
	  driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Add Room")).click();
		Select dd1= new Select(driver.findElement(By.name("ddllocation")));
		dd1.selectByVisibleText("Tilak Nagar");
		Select dd2= new Select(driver.findElement(By.name("ddlcat")));
		dd2.selectByVisibleText("Flat");
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name("ddlsubcat")));
		Select dd3= new Select(driver.findElement(By.name("ddlsubcat")));
		dd3.selectByVisibleText("3 BHK");
		driver.findElement(By.name("txtdesc")).sendKeys("tilak nagar flat 2bhk");
		driver.findElement(By.name("file")).sendKeys("D://MY PLAN//3D View 3.jpg");
		driver.findElement(By.name("txtamount")).sendKeys("10000");
		driver.findElement(By.name("txtfacility")).sendKeys("fully furnised");
		driver.findElement(By.name("btnsubmit")).click();     
  }
  @Test (priority =5)
  public void f4() {
	  driver.findElement(By.partialLinkText("View")).click();
		List<WebElement> ele1 = driver.findElements(By.xpath("/html/body/div[2]/div/div[2]/center/table/tbody/tr/td[1]"));
		System.out.println("total view book row"+ele1.size());
		driver.findElement(By.linkText("Booking")).click();
		List<WebElement> Ele= driver.findElements(By.xpath("//html/body/div[2]/div/div[2]/center/table/tbody/tr/td[1]"));
		System.out.println("total row of booking before "+Ele.size());
		driver.findElement(By.linkText("Logout")).click();
  }
  @Test (priority =6)
  public void f5() throws InterruptedException {
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
  @Test (priority =7)
  public void f6() throws InterruptedException {
	  driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Click")).click();
		driver.navigate().to("https://eroomrent.in/login.php?rid=243");
		driver.findElement(By.name("txtEmail")).sendKeys("qwertyyuiop@gmail.com");
		driver.findElement(By.name("txtPassword")).sendKeys("asddsa457");
		driver.findElement(By.name("btnsubmit")).click();
		Thread.sleep(2000);
  }
  @Test (priority =8)
  public void f7() {
	  driver.findElement(By.name("btnsubmit")).click();
		driver.switchTo().alert().accept();
		Actions obj1 = new Actions(driver);
		WebElement ele3= driver.findElement(By.partialLinkText("User"));
		obj1.moveToElement(ele3).build().perform();
		driver.findElement(By.linkText("Logout")).click();
  }
  @Test (priority = 9)
  public void f8() {
	  Actions obj2 = new Actions(driver);
	  WebElement ele4 = driver.findElement(By.linkText("Owner-G"));
		obj2.moveToElement(ele4).build().perform();
		driver.findElement(By.partialLinkText("Login")).click();
		driver.findElement(By.name("txtEmail")).sendKeys("himanshusharma0805@gmail.com");
		driver.findElement(By.name("txtPassword")).sendKeys("Anshu@987");
		driver.findElement(By.name("btnsubmit")).click();
  }
  @Test (priority =10)
  public void f9() {
	  driver.findElement(By.linkText("Booking")).click();
		List<WebElement> ele5= driver.findElements(By.xpath("//html/body/div[2]/div/div[2]/center/table/tbody/tr/td[1]"));
		System.out.println("total row of booking After "+ele5.size());				
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
 }

  @AfterTest 
  public void afterTest() {
	  driver.navigate().refresh();;
  }

}
