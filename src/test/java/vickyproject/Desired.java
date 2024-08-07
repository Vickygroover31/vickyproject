package vickyproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Desired {
	public static void main(String[] args) throws Throwable{
	
		WebDriverManager.edgedriver().setup();
		
		EdgeOptions option = new EdgeOptions();
		option.addArguments("start-maximized");
		
		DesiredCapabilities des = new DesiredCapabilities();
		des.setCapability("platform", "Windows 10");
		des.setCapability("version","latest");
		
		option.merge(des);
		
		WebDriver driver = new EdgeDriver(option);
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(5000);
		
		System.out.println("Page Tilte is:"+ driver.getTitle());
		
		driver.quit();
		
		
		
			
		
	}
		
		
		
		
	}
	


