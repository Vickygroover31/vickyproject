package vickyproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class example {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--start-maximized");
				
		WebDriver driver = new EdgeDriver(option);
		driver.get("https://www.redbus.com/");
		
		WebElement absolute = driver.findElement(By.xpath("/html/body/section/header/div/div//div[2]/div/div/div/div"));  //ABSOLUTE XPATH
		absolute.click();
		
		
		
	}

}
