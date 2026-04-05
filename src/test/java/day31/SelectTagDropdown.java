package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropdown {

	public static void main(String[] args) throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		WebElement dropCountry = driver.findElement(By.xpath("//select[@id='country']"));
		Select select = new Select(dropCountry);

		// Select option from dropdown
		select.selectByVisibleText("India");
		Thread.sleep(2000);
		select.selectByValue("canada");
		Thread.sleep(2000);
		select.selectByIndex(9);
		
		//Capture all the options from dropdown
		List<WebElement> options = select.getOptions();
		System.out.println("Number of elements in dropdown is: "+options.size());
		//Printing all the options
		System.out.println("Available Dropdown options are: ");
		//for (int i = 0; i < options.size(); i++) {
			//System.out.println(options.get(i).getText());
		//}
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}


		
	}

}
