package vickyproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Optiontest {
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--start-maximized");
		option.addArguments("--disable-popups");
		option.addArguments("--disable-notifications");
		//option.addArguments("--headless");
		
		WebDriver driver = new EdgeDriver(option);
		
		driver.get("https://optinmonster.com/types-of-popups-for-your-site/");
	}

}
