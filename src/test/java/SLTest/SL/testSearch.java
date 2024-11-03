package SLTest.SL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.SearchPOM;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testSearch {

	public WebDriver driver = null;

	@BeforeTest
	public void tearUp() {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
	}

	@Test
	public void f() {
try
{
	driver.manage().window().maximize();
SearchPOM ss=new SearchPOM(driver);
ss.SendFirstName("xx1");
ss.SendLastName("yy1");
Thread.sleep(2000);
ss.ClickQA();
	System.out.println("ClickED------------------------>");
}
catch(Exception e)
{
	System.out.println( e.getMessage());
}
	}

	@AfterTest
	public void tearDown() {
driver.quit();
	}

}
