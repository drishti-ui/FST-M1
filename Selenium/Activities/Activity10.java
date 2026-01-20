package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {
	
	public static void main (String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		Actions builder = new Actions(driver);
		
		driver.get("https://training-support.net/webelements/drag-drop");
		
		System.out.println("Page title is : " + driver.getTitle());
		
		WebElement ball = driver.findElement(By.id("ball"));
		
		WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
		
		WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
		
		builder.clickAndHold(ball).moveToElement(dropzone1).release().perform();
		
		if(dropzone1.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
        	System.out.println("Ball was dropped in Dropzone 1");
		}
		
        builder.clickAndHold(ball).moveToElement(dropzone2).release().perform();
        
        if(dropzone2.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
        	System.out.println("Ball was dropped in Dropzone 2");
        }
		
		}
}
