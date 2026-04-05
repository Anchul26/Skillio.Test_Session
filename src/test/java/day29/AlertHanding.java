package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AlertHanding {

	public static void main(String[] args) throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//Normal Alerts with OK button
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		//Confirmation Alert --> Ok and Cancel button
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		Alert cnfAlert = driver.switchTo().alert();
		String msg = cnfAlert.getText();
		System.out.println("Message on confirmation alert is "+msg);
		//driver.switchTo().alert().dismiss();
		cnfAlert.dismiss();
		//Prompt alert --> Input box, OK and Cancel button
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert prmAlert = driver.switchTo().alert();
		prmAlert.sendKeys("Welcome to Prompt Alert");
		prmAlert.accept();
		
		
	}
}
