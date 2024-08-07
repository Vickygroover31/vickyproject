package vickyproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Axes {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--start-maximized");
				
		WebDriver driver = new EdgeDriver(option);
		driver.get("https://www.flipkart.com/");
		
		
		WebElement a1 = driver.findElement(By.xpath("//div[starts-with(@class,'H6-NpN _3N4_BX')]/parent::div"));  //Parent
		String t1 = a1.getText();
		System.out.println(t1);
		
		WebElement a2 = driver.findElement(By.xpath("//a[contains(tex(),'_1TOQfO')]/preceding-sibling::img"));    //Preceding-sibling
		String t2 = a2.getText();
		System.out.println(t2);
		
		WebElement a3 = driver.findElement(By.xpath("//a[contains(tex(),'_1TOQfO')]/following-sibling::a"));    //Following-sibling
		String t3 = a3.getText();
		System.out.println(t3);
		
		WebElement a4 = driver.findElement(By.xpath("//a[contains(tex(),'_1TOQfO')]/ancestor::div[@class='_1Us3XD']"));  //Ancestor
		String t4 = a4.getText();
		System.out.println(t4);
		
		
		
	}

}
