package day38;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CaptureScreenShots {

	public static void main(String[] args) throws IOException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		// Using TakesScreenshot--> SDET
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// File target = new
		// File("C:\\Users\\Lenovo\\eclipse-workspace\\SDETSelenium\\ScreenShots\\fullpage.png");
		File target = new File(System.getProperty("user.dir") + "\\ScreenShots\\fullpage1.png");
		source.renameTo(target); //copy source file to target location
		
	}
}
