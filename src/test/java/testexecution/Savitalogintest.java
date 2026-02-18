package testexecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Savitalogintest {
	

	    WebDriver driver;

	    @BeforeMethod
	    public void setup() {
	       
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @Test
	   public void Searchproduct()
	   {
	    	driver.get("https://www.flipkart.com/");
	    	driver.findElement(By.name("q")).sendKeys("Shoes");
	    }

	    @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }
}


	
