package xyz.contractingDashboardTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import xyz.console.InitializeBrowser.InitializeBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ContinueWithEmail_Login extends InitializeBrowser{

	WebDriver driver;
	
	    @BeforeMethod
	    public void setup() {
		driver = InitializeBrowserAndOpenApplicationURL("Safari");
		}
	
		@AfterMethod
	    public void tearDown() {
		driver.quit();	}

		@Test (priority=1)
		public void VerifyLoginithValidCredential() {
			driver.findElement(By.xpath("//button[normalize-space()='Continue with Email']")).click();
			driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("kamal.chandra@spyne.ai");
			driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
			}
		
		@Test (priority=2)
		public void VerifyWithInvalidEmailCredentials() {			
			driver.findElement(By.xpath("//button[normalize-space()='Continue with Email']")).click();
			driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("zsdfsd");
			driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
			AssertJUnit.assertTrue(driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/section/div/div/div[1]/div[2]/div/form/div[1]/p")).isDisplayed());
			}
		
		@Test (priority=3)
		public void VerifyWithInvalidPasswordCredentials(){
			driver.findElement(By.xpath("//button[normalize-space()='Continue with Email']")).click();
			driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("kamal.chandra@spyne.ai");
			driver.findElement(By.xpath("//button[@id='next']")).click();
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123458576");
			driver.findElement(By.xpath("//button[@id='submit']")).click();
			}
		
		@Test (priority=4)
		public void VerifyWithoutAnyData() {
			driver.findElement(By.xpath("//button[normalize-space()='Continue with Email']")).click();
			driver.findElement(By.xpath("//button[@id='next']")).click();
			}
		
		
}
