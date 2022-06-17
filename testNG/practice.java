package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {

	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver oDriver = new ChromeDriver();
		oDriver.get("https://demoqa.com/automation-practice-form");
		WebElement web1 = oDriver.findElement(By.xpath("(//*[@class=\" mr-sm-2 form-control\"])[1]"));
	web1.sendKeys("nehal");
	}
}
