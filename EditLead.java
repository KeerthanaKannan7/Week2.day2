package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.xpath("//a[contains (text(), 'CRM/SFA') ]")).click();

		driver.findElement(By.xpath("//a[text() = 'Leads']")).click();

		driver.findElement(By.xpath("//a[text() = 'Find Leads']")).click();

		driver.findElement(By.xpath("//input[@class = ' x-form-text x-form-field ']")).sendKeys("Keerthana");

		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();

		driver.findElement(By.xpath("//a[text() = '11264']")).click();

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//a[text() = 'Edit']")).click();

		driver.findElement(By.xpath("//input[@id= 'updateLeadForm_companyName']")).clear();

		driver.findElement(By.xpath("//input[@id= 'updateLeadForm_companyName']")).sendKeys("TL");

		driver.findElement(By.xpath("//input[@value= 'Update']")).click();

		boolean companyName = driver.findElement(By.xpath("//span[contains (text(), 'TL')]")).isDisplayed();
		System.out.println(companyName);

		driver.close();
	}

}
