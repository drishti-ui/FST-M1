package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20 {
public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println("Page title is : " + driver.getTitle());
		
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert = driver.switchTo().alert();
		System.out.println("Text in the alert : " + promptAlert.getText());
		promptAlert.sendKeys("Awesome!");
		promptAlert.accept();
        System.out.println(driver.findElement(By.id("result")).getText());

		
		driver.quit();
}


}
