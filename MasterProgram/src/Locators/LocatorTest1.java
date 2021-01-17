package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkabadi\\Desktop\\Drivers all\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		
		WebElement searchbox= driver.findElement(By.id("search_query_top"));
		searchbox.sendKeys("T-shirts");
		driver.findElement(By.name("submit_search")).click();
		
		//link text
		//driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		driver.findElement(By.partialLinkText("Chiffon Dress")).click();

	}

}
