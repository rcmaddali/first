package test;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.junit.Before;

import org.junit.After;
public class GmailTest {

	@Before
	public void setup(){System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
	
	}
	@Test
	public void test() {
		
		WebDriver driver=new ChromeDriver();
		// Open Google Mail
				driver.get("http://www.gmail.com");				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.findElement(By.id("Email")).sendKeys("******");
				driver.findElement(By.id("next")).click();
				driver.findElement(By.id("Passwd")).sendKeys("******");
				driver.findElement(By.id("signIn")).click();
				driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
		        driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("*****");
		        driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("test email using Selenium Script");
		        //driver.findElement(By.xpath("//div[contains(text(),'Send')]")).click();
		
	}

		@After
		public void Complete(){
			WebDriver driver=new ChromeDriver();
			//Quit execution
			driver.quit();
		}
}
