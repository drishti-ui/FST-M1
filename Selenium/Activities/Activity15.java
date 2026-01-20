package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		System.out.println("Page title is : " + driver.getTitle());
		
		WebElement fullName = driver.findElement(By.xpath("//input[@placeholder='Full name']"));
		fullName.sendKeys("Selenium");
		
		WebElement emailAddress = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		emailAddress.sendKeys("Sel@activity.com");
		
        WebElement eventDate = driver.findElement(By.xpath("//input[contains(@name, '-event-date-')]"));
		eventDate.sendKeys("2025-12-16");
		
		WebElement details = driver.findElement(By.xpath("//textarea[contains(@name, '-additional-details-')]"));
		details.sendKeys("Not applicable");
		
		WebElement successMessage = driver.findElement(By.xpath("//button[text() = 'Submit']"));
		successMessage.click();
		
		System.out.println("Success message is : " +wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.id("action-confirmation"))).getText());
		
		driver.close();
		
		
	}
}
