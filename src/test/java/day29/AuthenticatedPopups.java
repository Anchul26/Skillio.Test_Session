package day29;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AuthenticatedPopups {

	public static void main(String[] args) throws InterruptedException {
		/*RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close(); */
		RemoteWebDriver driver1 = new ChromeDriver();
		//Sytax to pass URL --> https://Usename:Password@URL
		driver1.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver1.manage().window().maximize();
	}
}
