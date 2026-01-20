package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 {
	
	public static void main ( String [] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/tables");
		System.out.println("Page title is : " +  driver.getTitle());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table//tbody//tr"));
		System.out.println("Number of rows : " + rows.size());
		
		List<WebElement> cols = driver.findElements(By.xpath("//table//tr//th"));
		System.out.println("Number of cols : " + cols.size());
		
		WebElement bookname = driver.findElement(By.xpath("//table//tbody//tr[5]//td[2]"));
		System.out.println("Bookname is : " + bookname.getText());
		
		driver.findElement(By.xpath("//table//tr//th[5]")).click();
		
		WebElement bookname1 = driver.findElement(By.xpath("//table//tbody//tr[5]//td[2]"));
		System.out.println("Bookname after sort is : " + bookname1.getText());
		
		
		
		
		
		
		driver.quit();
	}
}
