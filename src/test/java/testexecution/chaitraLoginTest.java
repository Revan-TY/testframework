package testexecution;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class chaitraLoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void launchdriver()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void testcase01()
	{
		
		WebElement usn=driver.findElement(By.id("email"));
		WebElement psw=driver.findElement(By.id("pass"));
		WebElement btn = driver.findElement(By.name("login"));
		usn.sendKeys("chaitra123@gmail.com");
		psw.sendKeys("admin123");
		btn.click();
		
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle= driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
		
		
	}
	
	@AfterClass
	public void tearDown()
	{
		if(!(driver==null))
		{
			driver.quit();
		}
	}

}
