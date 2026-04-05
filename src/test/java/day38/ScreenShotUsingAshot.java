package day38;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScreenShotUsingAshot {

	public static void main(String[] args) {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
	}
}
