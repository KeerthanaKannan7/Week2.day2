package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkPage {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Link.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("(//a[text() = 'Go to Home Page'])[1]")).click();

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//img[@alt = 'Link']")).click();

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//a[text() = 'Find where am supposed to go without clicking me?']")).click();

		driver.findElement(By.xpath("//button[text() = 'Go to Home Page']")).click();

		driver.findElement(By.xpath("//img[@alt = 'Link']")).click();

		driver.close();

	}

}
