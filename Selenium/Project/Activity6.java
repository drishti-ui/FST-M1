package project;

import java.time.Duration;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {
	
	WebDriver driver ;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
	}
	@Test
	  public void dirMenu() {
		  
		  	WebElement username = driver.findElement(By.id("txtUsername"));
			WebElement password = driver.findElement(By.id("txtPassword"));
			username.sendKeys("orange");
			password.sendKeys("orangepassword123");
			WebElement loginButton = driver.findElement(By.name("Submit"));
			loginButton.click();
			driver.findElement(By.xpath("//a[@href='/orangehrm/symfony/web/index.php/directory/viewDirectory/reset/1']")).click();
			WebElement header = driver.findElement(By.tagName("h1"));
			System.out.println("Title of the page is : " + header.getText());
			Assert.assertEquals(header.getText(), "Search Directory");
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}


