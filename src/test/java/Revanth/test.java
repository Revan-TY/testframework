package Revanth;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class test {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Start()
	{
		driver = new ChromeDriver();
		driver.get("Https://www.facebooc.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterMethod
	public void end()
	{
		driver.quit();
	}

	
	

}
