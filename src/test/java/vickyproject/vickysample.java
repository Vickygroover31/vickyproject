package vickyproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class vickysample {
	static WebDriver driver;
	public static void launch( String url) {
		WebDriverManager.edgedriver().setup();
		driver =  new EdgeDriver();
		driver.get(url);	
	}
	public static void max() {
		driver.manage().window().maximize();
	}
	public static void Getpage(String Id) {
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("VIGNESH");
		
	}
	public static void style(String script) {
		WebElement user = driver.findElement(By.id("email"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style',background:yellow;border:2px solid green')", user);
		
		
	}
}
