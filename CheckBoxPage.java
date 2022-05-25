package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxPage {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/checkbox.html");

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//div[@class= 'example']/input[@type='checkbox']")).click();

		boolean selected = driver.findElement(By.xpath("//div[@class= 'example'][2]/input[@type='checkbox']"))
				.isSelected();
		System.out.println(selected);

		boolean selected1 = driver.findElement(By.xpath("//div[@class= 'example'][3]/input[@type='checkbox']"))
				.isSelected();
		System.out.println(selected1);

		driver.findElement(By.xpath("//div[@class= 'example'][4]/input[@type='checkbox'][4]")).click();

		boolean selected2 = driver.findElement(By.xpath("//div[@class= 'example'][4]/input[@type='checkbox'][6]"))
				.isSelected();
		System.out.println(selected2);

		driver.close();

	}

}
