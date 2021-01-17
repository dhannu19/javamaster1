package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkabadi\\Desktop\\Drivers all\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		//Classname
		int Sliders =driver.findElements(By.className("homeslider-container")).size();
		System.out.println(Sliders);
		
		//Tagnames
		   int Links=driver.findElements(By.tagName("a")).size();
		   System.out.println(Links);
		          


	}

}
