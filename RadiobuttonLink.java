package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadiobuttonLink {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/radio.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id= 'yes']")).click();
		
		boolean selected1 = driver.findElement(By.xpath("(//input[@name = 'news'])[2]")).isSelected();
		System.out.println(selected1);
		
		driver.findElement(By.xpath("(//input[@name = 'news'])[1]")).click();

		boolean selected2 = driver.findElement(By.xpath("(//input[@name = 'age'])[2]")).isSelected();
		System.out.println(selected2);
		
		boolean selected3 = driver.findElement(By.xpath("(//input[@name = 'age'])[3]")).isSelected();
		System.out.println(selected3);
		
		driver.findElement(By.xpath("(//input[@name = 'age'])[3]")).click();
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
