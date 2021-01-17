package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCSS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkabadi\\Desktop\\Drivers all\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//Tag and Id combination
		//driver.findElement(By.cssSelector("#email")).sendKeys("David");
		//driver.findElement(By.cssSelector("input#email")).sendKeys("David");
		
		
		//Tag and Class Combinatiom
		
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("John");
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("John");
		
	   //Tag and Attribute Combinatiom
		
		//driver.findElement(By.cssSelector("[id=email]")).sendKeys("John");
		//driver.findElement(By.cssSelector("input[id=email]")).sendKeys("John");
		
		//Tag Class Attribute Combinatiom
		
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("Email");
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("Pass");
	}

}
