package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagePage {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Image.html");

		driver.findElement(By.xpath("(//img[contains (@onclick, 'window.location=')])[1]")).click();

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//img[@alt='Images']")).click();

		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
