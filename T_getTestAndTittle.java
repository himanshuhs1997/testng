package TESTNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class T_getTestAndTittle {
	WebDriver driver;

	@Test(priority = 1)
	public void f1() {
		driver.get("https://eroomrent.in/index.php");
	}

	@Test(priority = 2)
	public void f2() {
		WebElement ele = driver.findElement(By.tagName("h1"));
		String s = ele.getText();
		System.out.println(s);
	}

	@Test(priority = 3)
	public void f3() {
		String s = driver.getTitle();
		if (s != "") {
			System.out.println(" tittle is" + s);
		} else {
			System.out.println("not a tittle");
		}
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

}
