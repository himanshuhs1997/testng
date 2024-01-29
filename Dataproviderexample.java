package TESTNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class Dataproviderexample {
 
/*
  @DataProvider(name = "test-data")
  public Object[][] dataprovidermethod() {
    return new Object[][] {{ "abc"},{ "xyz" }};
  }
    
    @Test(dataProvider = "test-data")
    public void myTestScript(String data) {
  	  System.out.println(data);
    }
   
  */
//======================================================================
	
	WebDriver driver;
	@DataProvider(name="test-data")
	public Object[][] dataprovidermethod(){
		return new Object[][] {{"java"},{"selenium"}};
	}
	@BeforeMethod
	public void setup() {
		System.out.println("start test");
		System.setProperty("Webdriver.chrome.driver","c://Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@Test(dataProvider="test-data")
	public void myTestScript(String data) {
		System.out.println(data);
		WebElement txtbox = driver.findElement(By.id("APjFqb"));
		txtbox.sendKeys(data);
		txtbox.sendKeys(Keys.ENTER);
	}
}
	
//====================================================================
	
