package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/selects");
		System.out.println("Page title is : " + driver.getTitle());
		
		WebElement select = driver.findElement(By.cssSelector("select.h-80"));
		Select multiSelect = new Select(select);
		
		multiSelect.selectByVisibleText("HTML");
		for (int i = 3;i<=5;i++) {
		multiSelect.selectByIndex(i);
		}
		multiSelect.selectByValue("nodejs");
		List<WebElement> allOptions = multiSelect.getOptions();
		System.out.println("Options in the dropdown : ");
		for (WebElement options : allOptions) {
			System.out.println(options.getText());
		}
		driver.quit();
	}

}
