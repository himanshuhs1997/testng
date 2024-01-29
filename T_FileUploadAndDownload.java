package TESTNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class T_FileUploadAndDownload {
	
	/*
	WebDriver driver;
  @Test (priority =1)
  public void f() {
	  driver.get("http://demo.guru99.com/test/upload/");
  }
  @Test (priority=2)
  public void f1() {
	driver.findElement(By.name("uploadfile_0")).sendKeys("D:\\MY PLAN//D4D 002.jpg");  
  }
  @Test (priority=3)
  public void f2() {
	  driver.findElement(By.name("terms")).click();
	  driver.findElement(By.id("submitbutton")).click();
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

  */
 
 //=====================================================================

	WebDriver driver;
	  @Test (priority =1)
	  public void f() {
		  driver.get("https://eternallybored.org/misc/wget/");
	  }
	  @Test (priority=2)
	  public void f1() {
		WebElement ele =driver.findElement(By.linkText("ZIP"));
		String path = ele.getAttribute("href");
		String wget_command = "cmd /c C:\\wget.exe -P E://d --no-check-certificate"+path;
		try {
			Process exce = Runtime.getRuntime().exec(wget_command);
			int exitval = exce.waitFor();
		}catch(Exception ex){
			System.out.println(ex.getMessage());
}}
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
