package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver oDriver = new ChromeDriver();
		oDriver.get("https://demoqa.com/tool-tips");
		WebElement tool = oDriver.findElement(By.id("toolTipTextField"));
		String toolTip = tool.getAttribute("placeholder");
		System.out.println(toolTip);
	}

}
