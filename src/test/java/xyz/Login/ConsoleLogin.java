package xyz.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConsoleLogin {
	
	WebDriver driver;
	
   public void Loginflow(){
		driver.findElement(By.xpath("//button[normalize-space()='Continue with Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("kamal.chandra@spyne.ai");
		driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		}

}
