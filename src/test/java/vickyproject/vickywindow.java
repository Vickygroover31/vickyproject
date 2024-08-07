package vickyproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class vickywindow {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Realme mobiles",Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[4]")).click();
		
		String window = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		List<String> l1 = new ArrayList<String>(allwindow);
		driver.switchTo().window(l1.get(3));
		WebElement current = driver.findElement(By.xpath("//span[@class='VU-ZEz']"));
		String text = current.getText();
		System.out.println(text);
		
		
	}

}
