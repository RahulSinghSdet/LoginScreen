package xyz.contractingDashboardTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import xyz.console.InitializeBrowser.InitializeBrowser;

public class Enterprise_Dashboard extends InitializeBrowser {

	WebDriver driver;
	
	    @BeforeMethod
	    public void setup() {
		driver = InitializeBrowserAndOpenApplicationURL("Safari");
		}
	
		@AfterMethod
	    public void tearDown() {
		driver.quit();	
	    }
	    
	    @Test (priority=1)
		public void NavigatetoContracting() {
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton1ds\"]/div/img")).click();	
	    	driver.findElement(By.xpath("//*[@id=\"headerRightContent\"]/div[2]/div[2]/div[2]/div/ul/li[1]")).click();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/section/div/div/div[1]/div/div/div/div[5]/div[2]")).click();
	    	
	    }
}