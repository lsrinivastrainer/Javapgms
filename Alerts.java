
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//button[@type='submit']")).click(); 
		Thread.sleep(5000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText()); 
		a.accept(); 
		driver.switchTo().defaultContent(); 
		
		driver.findElement(By.id("login1")).sendKeys("vasu"); 
		Thread.sleep(5000);
		driver.quit();


	}

}
