package project;

import java.time.Duration;
import java.util.List;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;


public class Activity9 {
	
	WebDriver driver ;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
	}
	
	@Test
	  public void retrieveContacts() {
		  
		  	Actions actions = new Actions(driver);
		  	WebElement username = driver.findElement(By.id("txtUsername"));
			WebElement password = driver.findElement(By.id("txtPassword"));
			username.sendKeys("orange");
			password.sendKeys("orangepassword123");
			WebElement loginButton = driver.findElement(By.name("Submit"));
			loginButton.click();
			driver.findElement(By.id("menu_pim_viewMyDetails")).click();
			actions.sendKeys(Keys.PAGE_DOWN).build().perform();
			driver.findElement(By.xpath("//a[@href='/orangehrm/symfony/web/index.php/pim/viewEmergencyContacts/empNumber/1']")).click();
			List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='emgContactName']//tr")); 
			for (WebElement row : allRows) { 
			    List<WebElement> cells = row.findElements(By.tagName("td")); 
			    	for (WebElement cell : cells) {         
			    		System.out.println(cell.getText());
			    	}
			    	 Assert.assertEquals(row.getSize(),
			                 "No emergency contacts found");
			}
	  }
	  
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
