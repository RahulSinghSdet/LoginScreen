package xyz.console.InitializeBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class InitializeBrowser {
	
	WebDriver driver;
	
	public WebDriver InitializeBrowserAndOpenApplicationURL(String browserName) {
		
		String browserName1 = "Safari";
		if (browserName1.equals("Safari")) {
			driver = new SafariDriver();
		}else if(browserName1.equals("Chrome")) {
			driver = new ChromeDriver();
		}else if(browserName1.equals("Firefox")) {
			driver = new FirefoxDriver();
		}else if(browserName1.equals("Edge")) {
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://temp.console.spyne.ai/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		return driver;
	}
}
