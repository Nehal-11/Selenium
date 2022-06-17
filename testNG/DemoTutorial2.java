package testNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTutorial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver oDriver = new ChromeDriver();
		String parentWindow = oDriver.getWindowHandle();
		oDriver.get("https://demoqa.com/browser-windows");
		WebElement newTab = oDriver.findElement(By.id("tabButton"));
		newTab.click();
		
	
	
	
	
	
	}

}
