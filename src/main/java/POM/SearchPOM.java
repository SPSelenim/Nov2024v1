package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPOM {

	WebDriver driver = null;
private String First="fname";
private String Last="lname";
private String QA="//a[@name='QA']";

	public SearchPOM(WebDriver driver) {
		this.driver = driver;
	}

	
	private WebElement getFName()
	{
		WebElement ee=null;
		ee=driver.findElement(By.id(First));
		return ee;
	}
	
	
	private WebElement getLName()
	{
		WebElement ee=null;
		ee=driver.findElement(By.id(Last));
		return ee;
	}
	
	private WebElement getQA()
	{
		WebElement ee=null;
		ee=driver.findElement(By.xpath(QA));
		return ee;
	}
	
	public void SendFirstName(String FF)
	{
		getFName().sendKeys(FF);
	}
	
	public void SendLastName(String LL)
	{
		getLName().sendKeys(LL);

	}
	

	public void ClickQA()
	
	{
getQA().click();
	}
	
}
