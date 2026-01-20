package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity13 {
	
	public static void main (String [] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/tables");
		
		System.out.println("Title of the page is : " + driver.getTitle());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Number of rows : " + rows.size());
		
		List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println("Number of cols : " + cols.size());
		
		List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[3]/td"));
        for(WebElement cell : thirdRow) {
            System.out.println("Third row cell values: "+ cell.getText());
        }
		
		WebElement rowcolValue = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
		System.out.println("Second row and cols values are : " + rowcolValue.getText());
		
		driver.quit();
	}

}
