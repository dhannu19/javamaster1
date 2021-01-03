package january;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
public class Test1 {
//TC2
	static void staticmethod() {
		System.out.println("Static Method Working");
		System.out.println("=============================");

	}

//TC3
	public void publicmethod() {

		System.out.println("Public Method Working");
		System.out.println("=============================");

	}

//TC4
	public static class Test2 {

		public static void method3() {
			System.out.println("Class2 method Working");
			System.out.println("=============================");
		}

	}

//TC5
	public void valuemethod(int x) {
		System.out.println("Passing Value in method Working" + " " + +x);
		System.out.println("=============================");
	}

//TC6
	public static void datatype() {
		final double PI = 3.14;
		final float a = 1.2f;
		final int b = 10;
		final char c = 'E';
		final boolean d = true;
		final String e = "Fruits";

		System.out.println(PI);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println("=============================");
	}

//TC7 Arraylist
	public static void arraymethod() {
		ArrayList<String> Cars = new ArrayList<String>();
		Cars.add("Toyota");
		Cars.add("Camry");
		Cars.add("BMW");
		Cars.add("Testla");
		Cars.add("Honda");
		System.out.println(Cars);
		System.out.println(Cars.get(2));
		System.out.println(Cars.set(2, "BMWupdated"));
		System.out.println(Cars);
		System.out.println(Cars.remove(2));
		System.out.println(Cars);
		System.out.println(Cars.size());

		Collections.sort(Cars);
		for (int i = 0; i < Cars.size(); i++) {
			System.out.println(Cars.get(i));
		}
		System.out.println("=============================");
	}

	public static void input() {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter a number to add");
		int a = sr.nextInt();
		System.out.println("Enter a number to add");
		int b = sr.nextInt();
		int c = a + b;
		System.out.println("Sum is below");
		System.out.println(c);

	}

	public static void UI() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkabadi\\Desktop\\Drivers all\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://discover-src.com/referenceApp/signin"); WebElement
		 * element = driver.findElement(By.id("email")); element.sendKeys("testuser");
		 * WebElement element1 = driver.findElement(By.id("password"));
		 * element1.sendKeys("Passssksask"); Thread.sleep(5000);
		 */

		driver.get("http://webapps.tekstac.com/Shopify/");
		driver.findElement(By.id("firstname")).sendKeys("Medha1234561");
		driver.findElement(By.id("lastname")).sendKeys("Kabadi123456");
		driver.findElement(By.id("username")).sendKeys("Medha Computer123456");
		driver.findElement(By.id("pass")).sendKeys("152112");
		Select s = new Select(driver.findElement(By.id("selectcity")));
		s.selectByValue("mas");
		WebElement gender = driver.findElement(By.xpath("//input[@value='female']"));
		gender.click();
		driver.findElement(By.id("reg")).click();

		// WebElement element3 =
		// driver.findElement(By.xpath("//*[@id=\"loginPage\"]/div/div[1]/form/button"));
		// element3.submit();
		// WebElement element2 = driver.findElement(By.id("btnSRCCheckout"));
		// element1.submit();

		/*
		 * Thread.sleep(5000); WebElement element = driver.findElement(By.name("q"));
		 * //Thread.sleep(5000); element.sendKeys("Orange"); element.submit();
		 * Thread.sleep(5000); driver.close(); driver.quit();
		 */

	}

//Execution
	public static void main(String[] args) throws InterruptedException {
		// TC1
		System.out.println("Public Main Working");
		System.out.println("=============================");
		// TC2
		staticmethod();
		// TC3
		Test1 obj = new Test1();
		obj.publicmethod();
		// TC4
		Test2.method3();
		// TC5
		obj.valuemethod(25);
		// TC6
		obj.datatype();
		// TC7
		obj.arraymethod();

		// TC8 Exception
		int i = 0, j = 0, k = 0;

		i = 10;
		j = 0;
		try {
			k = i / j;
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println(k);
		System.out.println("=============================");
		/////////////////////////////////////

		// TC9
		// obj.input();

		// TC10
		obj.UI();

	}

}
