package project;

import java.time.Duration;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;


public class Activity5 {
	
	WebDriver driver ;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


@BeforeClass
public void setUp() {
	driver = new FirefoxDriver();
	driver.get("http://alchemy.hguy.co/orangehrm");
	
}

@Test
public void editUserInfo() {
	  
	  	WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		username.sendKeys("orange");
		password.sendKeys("orangepassword123");
		WebElement loginButton = driver.findElement(By.name("Submit"));
		loginButton.click();
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		driver.findElement(By.id("btnSave")).click();
		WebElement fullName = driver.findElement(By.id("personal_txtEmpFirstName"));
		WebElement lastName = driver.findElement(By.name("personal[txtEmpLastName]"));
		WebElement gender1 = driver.findElement(By.id("personal_optGender_1"));
		WebElement gender2 = driver.findElement(By.id("personal_optGender_2"));
		Select nationality = new Select(driver.findElement(By.name("personal[cmbNation]")));
		WebElement doB = driver.findElement(By.id("personal_DOB"));
		fullName.clear();
		lastName.clear();
		doB.clear();
		fullName.sendKeys("Peter");
		gender1.click();
		nationality.selectByVisibleText("Indian");
		doB.sendKeys("1997-10-05");
		WebElement saveButton = driver.findElement(By.id("btnSave"));
		saveButton.click();
		System.out.println("URL after saving the details is : " + driver.getCurrentUrl());
		//Assert.assertEquals("", null);
}
@AfterClass
public void tearDown() {
	driver.close();
}
}

