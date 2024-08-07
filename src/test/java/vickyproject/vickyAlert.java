package vickyproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class vickyAlert {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		driver.manage().window().maximize();
		
		WebElement simplealert = driver.findElement(By.xpath("//button[@onclick='showAlert()']"));
		simplealert.click();
		Thread.sleep(5000);
		Alert simple = driver.switchTo().alert();
		simple.accept();
		
		WebElement simplealert1 = driver.findElement(By.xpath("//button[@onclick='myMessage()']"));
		simplealert1.click();
		Thread.sleep(8000);
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		WebElement confirm = driver.findElement(By.xpath("//button[@onclick='myDesk()']"));
		confirm.click();
		Thread.sleep(8000);
		Alert confirmationalert = driver.switchTo().alert();
		confirmationalert.accept();
		
		WebElement prompt = driver.findElement(By.xpath("//button[@onclick='myPromp()']"));
		prompt.click();
		Alert promptalert = driver.switchTo().alert();
		Thread.sleep(8000);
		promptalert.sendKeys("VIGNESH");
		Thread.sleep(8000);
		promptalert.accept();
		promptalert.dismiss();
		
	}

}
