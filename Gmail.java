package test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
	
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open Google Mail
		driver.get("http://www.gmail.com");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("ravichandra.maddali@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("Ravi2014");
		driver.findElement(By.id("signIn")).click();
		driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
        driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("naveenb29@gmail.com");
        driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("test email using Selenium Script");
        driver.findElement(By.xpath("//div[contains(text(),'Send')]")).click();
        driver.quit();
	}
	


}