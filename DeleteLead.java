package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		
		driver.findElement(By.xpath("//span[text() = 'Phone']")).click();
		
		driver.findElement(By.xpath("//input[@name= 'phoneNumber']")).sendKeys("9095326910");
		
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		
		driver.findElement(By.partialLinkText("Keerthana")).click();

		driver.findElement(By.xpath("//a[text() = 'Delete']")).click();
		
		driver.findElement(By.xpath("//a[text() = 'Find Leads']")).click();
		
		//12929
		
		driver.findElement(By.xpath("//input[@name = 'id']")).sendKeys("12929");
		
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		
		boolean message = driver.findElement(By.xpath("//div[text() = 'No records to display']")).isDisplayed();
		System.out.println(message);
		
		driver.close();
		
	}

}
