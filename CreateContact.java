package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.xpath("//a[contains (text(), 'CRM/SFA') ]")).click();

		driver.findElement(By.xpath("//a[text() = 'Contacts']")).click();

		driver.findElement(By.xpath("//a[text() = 'Create Contact']")).click();

		driver.findElement(By.id("firstNameField")).sendKeys("Keerthana");

		driver.findElement(By.id("lastNameField")).sendKeys("K");

		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("KK");

		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("K");

		driver.findElement(By.xpath("//input[@name = 'departmentName']")).sendKeys("Testing");

		driver.findElement(By.xpath("//textarea[@name = 'description']"))
				.sendKeys("Manual Testing and Automation Testing (Selenium Java)");

		driver.findElement(By.xpath("//input[@id = 'createContactForm_primaryEmail']"))
				.sendKeys("keerthanakannan15497@gmail.com");

		WebElement StateProvince = driver
				.findElement(By.xpath("//select[@id = 'createContactForm_generalStateProvinceGeoId']"));
		Select selectingStateProvince = new Select(StateProvince);
		selectingStateProvince.selectByVisibleText("Indiana");

		driver.findElement(By.xpath("//input[@name = 'submitButton']")).click();

		driver.findElement(By.xpath("//a[text() = 'Edit']")).click();

		driver.findElement(By.xpath("//textarea[@name = 'description']")).clear();

		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("This is Important Notes fiels");

		driver.findElement(By.xpath("//input[@value='Update']")).click();

		System.out.println(driver.getTitle());

	}

}
