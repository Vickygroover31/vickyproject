package vickyproject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--start-maximized");
		option.addArguments("--disable-notifications");
				
		WebDriver driver = new EdgeDriver(option);
		driver.get("https://www.makemytrip.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("link"));
		Iterator<WebElement> linksIterator = links.iterator();
		while(linksIterator.hasNext()) {
			WebElement link = linksIterator.next();
			String href = link.getAttribute("href");
			if (href==null || href.isEmpty()) {
				System.out.println("GIVEN LINK IS EMPTY:"+href);	
			}
			else if(!href.startsWith("https://www.makemytrip.com")) {
				System.out.println("GIVEN LINK IS NOT APPLICABLE:"+href);	
			}
			else {
				try {
					HttpURLConnection http = (HttpURLConnection) (new URL(href)).openConnection();
					http.setRequestMethod("HEAD");
					http.connect();
					int responseCode = http.getResponseCode();
					if (responseCode==200) {
						System.out.println("IT IS NOT BROKEN LINK:"+href);
					}
					else {
						System.out.println("BROKEN LINK:"+href);
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				
				}
			
			}
		}
		
	}

}
