package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CheckboxHandling {

	public static void main(String[] args) throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		// select specific element
		/*
		 * driver.findElement(By.xpath("//input[@id='sunday']")).click();
		 * driver.findElement(By.xpath("//input[@id='saturday']")).click();
		 * driver.findElement(By.xpath("//div[@class='form-group'][4]/div[4]")).click();
		 */
		// select all the elements
		List<WebElement> days = driver.findElements(By.xpath("//div[@class='form-group'][4]/div"));
		// Using Foreach loop
		/*
		 * for (WebElement webElement : days) { webElement.click(); }
		 */
		// Using normal for loop
		/*
		 * for (int i = 0; i < days.size(); i++) { days.get(i).click(); }
		 */

		// Unselect the checkboxes that are selected
		for (int i = 0; i < 3; i++) {
			days.get(i).click();
		}
		Thread.sleep(5000);
		
		for (WebElement webElement : days) {
			if (webElement.isSelected()) {
				webElement.click();
			}
		}

	}
}
