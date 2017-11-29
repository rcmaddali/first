package com.test.MoneyTransfer;



import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AppTest {
	static WebDriver driver= null;
	@BeforeMethod
	public static void browser(){
		System.setProperty("webdriver.chrome.driver", "/Users/ravimaddali/Desktop/chromedriver");
		 driver= new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.findElement(By.cssSelector("Body")).sendKeys(Keys.COMMAND + "w");
	}
	
@Test
public static void  Xoom()
{
	driver.findElement(By.cssSelector("Body")).sendKeys(Keys.COMMAND + "t");
	driver.get("https://www.xoom.com/");
	driver.findElement(By.cssSelector("Body")).sendKeys(Keys.COMMAND + "w");
}
//	//String selectLinkOpeninNewTab = Keys.chord(Keys.COMMAND,Keys.RETURN); 
//	//driver.findElement(By.linkText("https://xoom.com")).sendKeys(selectLinkOpeninNewTab);
//	//ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//    //driver.switchTo().window(tabs.get(1)); //switches to new tab
//	driver= new ChromeDriver();
//    driver.get("https://www.xoom.com");
//	driver.findElement(By.xpath("//*[@id='picker-selector-1']/span/span/span[1]")).click();
//	Select dropdown = new Select(driver.findElement(By.id("identifier")));
//	dropdown.selectByVisibleText("India ");
//	}
@Test
public static void Transfast() throws InterruptedException {
	driver.findElement(By.cssSelector("Body")).sendKeys(Keys.COMMAND + "t");
	driver.get("https://www.transfast.com/");
	driver.findElement(By.xpath("//input[contains(@class,'searchable-country')]")).sendKeys("India");
	//driver.findElement(By.xpath("//*[contains(@data-id, 'INR')]/@data-id")).click();;
	driver.findElement(By.cssSelector("Body")).sendKeys(Keys.COMMAND + "w");
	//driver.findElement(By.xpath("/html/body/div[2]/header/div/div[2]/div[2]/div/div[1]/div[1]/div/recipient-dropdown/div/ul/li/a/span")).click();;
	//driver.findElement(By.xpath("//span[text()='india']]/ancestor::a[@class='select-country-item']")).click();
	}
@Test
public static void main(){
	driver.findElement(By.cssSelector("Body")).sendKeys(Keys.COMMAND + "t");
	driver.get("https://www.remitly.com/");
	driver.findElement(By.cssSelector("Body")).sendKeys(Keys.COMMAND + "w");
	
}
}
