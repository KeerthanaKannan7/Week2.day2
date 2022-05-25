package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\keert\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//a[@data-testid = 'open-registration-form-button']")).click();

		driver.findElement(By.xpath("//input[@placeholder = 'First name']")).sendKeys("Keerthana");

		driver.findElement(By.xpath("//input[contains(@name,'last')]")).sendKeys("K");

		driver.findElement(By.xpath("//input[contains(@name,'reg_')]")).sendKeys("9095326910");

		driver.findElement(By.xpath("//input[contains(@autocomplete,'new-')]")).sendKeys("Keerthana15@");

		WebElement SelectingDate = driver.findElement(By.xpath("//select[@name  = 'birthday_day']"));
		Select date = new Select(SelectingDate);
		date.selectByValue("15");

		WebElement SelectingMonth = driver.findElement(By.xpath("//select[@name  = 'birthday_month']"));
		Select Month = new Select(SelectingMonth);
		Month.selectByIndex(3);

		WebElement SelectingYear = driver.findElement(By.xpath("//select[@name  = 'birthday_year']"));
		Select Year = new Select(SelectingYear);
		Year.selectByVisibleText("1997");

		driver.findElement(By.xpath("//label[text() = 'Female']")).click();

		driver.close();

	}

}
