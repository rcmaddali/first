package test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
	
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open Google
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Cheese!");
        element.submit();
	}

}

