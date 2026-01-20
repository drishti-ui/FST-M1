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

public class Activity4 {
	
WebDriver driver ;
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	
	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		
	}
	
	@Test
	public void addEmployee() {
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_pim_viewPimModule"))).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("btnAdd")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Dee123");
		driver.findElement(By.id("lastName")).sendKeys("Shree");
		driver.findElement(By.id("btnSave")).click();
		
		driver.navigate().back();
		System.out.println("Current url is : " + driver.getCurrentUrl());
		driver.navigate().back();
		
		WebElement empname = driver.findElement(By.id("empsearch_employee_name_empName"));
		empname.sendKeys("Dee123");
		System.out.println("Empname is  : " + empname.getAttribute("value"));
		Assert.assertEquals(empname.getAttribute("value"), "Dee123");

	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
