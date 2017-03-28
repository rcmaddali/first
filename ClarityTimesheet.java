package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Timer;
import java.util.TimerTask;
import org.openqa.selenium.ie.*;;

public class ClarityTimesheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
		
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open Google Mail
		driver.get("clarity.fs.capgemini.com");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("ppm_app")).sendKeys("*****");
		driver.findElement(By.id("ppm_login_password")).sendKeys("*****");
		driver.findElement(By.id("ppm_login_button")).click();
		driver.findElement(By.id("ppm_timesheet")).click();
		/*driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
        driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("*****");
        driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("test email using Selenium Script");
        driver.findElement(By.xpath("//div[contains(text(),'Send')]")).click();*/
        driver.quit();
	}

	}

