package activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity4 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/target-practice");
		
		System.out.println("Title of the page is : " + driver.getTitle());
		
		System.out.println("3rd header on the page is : " +driver.findElement(By.xpath("//h3[contains(text(), '#3')]")).getText());
		
        Color fifthHeaderColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(), '#5')]")).getCssValue("color"));

		System.out.println("Color as RGB : " + fifthHeaderColor.asRgb());
		
		System.out.println("Color as hexcode : " + fifthHeaderColor.asHex());
		
		System.out.println("Purple button and its classes : " + driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class"));
		
		System.out.println("Slate button and its classes : " + driver.findElement(By.xpath("//button[text()='Slate']")).getText());

		
		driver.quit();
	}

}
