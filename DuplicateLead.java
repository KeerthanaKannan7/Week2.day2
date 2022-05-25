package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		
		driver.findElement(By.xpath("//span[text() = 'Email']")).click();
		
		driver.findElement(By.xpath("//input[@name = 'emailAddress']")).sendKeys("keerthanakannan15497@gmail.com");
		
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		
		driver.findElement(By.xpath("//a[text() = '13057']")).click();
		
		driver.findElement(By.xpath("//a[text() = 'Duplicate Lead']")).click();
		
		System.out.println(driver.getTitle());
		
		if (driver.getTitle().contains("Duplicate")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is incorrect");
		}
		
		driver.findElement(By.xpath("//a[text() = 'Create Lead']")).click();
		
		boolean duplicateName = driver.findElement(By.xpath("//a[@href = '/crmsfa/control/viewLead?partyId=13057']")).isDisplayed();
		System.out.println(duplicateName);
		
		driver.close();
		/*
		17	Close the browser (Do not log out)
		
		*/
	}

}
