package vickyproject;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class vickyscript {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.id("email"));
		WebElement down = driver.findElement(By.xpath("//a[@title='Browse in Video']"));
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','VICKYABI')", user,login);
		
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red')", user);
		
		js.executeScript("arguments[0].scrollIntoView(true)", down,login);
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView(false)",user,login);
		
		
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\MJ\\eclipse-workspace\\list\\vickyproject\\target\\vickyabi.png");
		FileUtils.copyFile(src, desc);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
