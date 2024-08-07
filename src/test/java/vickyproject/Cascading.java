package vickyproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cascading {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--start-maximized");
		option.addArguments("--disable-notifications");
				
		WebDriver driver = new EdgeDriver(option);
		driver.get("https://www.amazon.com/");
		
		WebElement w1 = driver.findElement(By.cssSelector("div[class='nav-left']>div"));  //IMMEDIATE CHILD

		WebElement w2 = driver.findElement(By.cssSelector("div[class='nav-left'] a"));   //SUB CHILD
		
		WebElement w3 = driver.findElement(By.cssSelector("div#a-page"));       //BY USING ID-#
		
		WebElement w4 = driver.findElement(By.cssSelector("div.nav-left"));   //By Using Class-.
		
		WebElement w5 = driver.findElement(By.cssSelector("span[id=\"nav-link-accountList-nav-line-1\"]"));  //BY using other Attributes
		
		WebElement w6 = driver.findElement(By.cssSelector("span[id*=\"nav-lin\"]"));  //By Using contains-*
		
		WebElement w7 = driver.findElement(By.cssSelector("span[id^=\"nav-link-accountList\"]")); //By Using Starts-with-^
		
		WebElement w8 = driver.findElement(By.cssSelector("span[id$=\"nav-line-1\"]")); //By using ends-with-$
		
		WebElement w9 = driver.findElement(By.cssSelector("div[class='nav-left']>div:nth-of-type(1)")); //By Using Array nth-of-type
		
		WebElement w10 = driver.findElement(By.cssSelector("div[class='nav-left']:last-child")); //By using Last-child
		
		
	}

}
