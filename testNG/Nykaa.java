package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	@Test
void loginToNykaa() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver oDriver = new ChromeDriver();
	oDriver.get("https://www.google.co.in/");
	oDriver.findElement(By.xpath("//*[@class = \"gLFyf gsfi\"]")).sendKeys("nykaa" + Keys.ENTER);
	Thread.sleep(4000);
	oDriver.findElement(By.xpath("//*[@class = \"CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb\"]")).click();
	Thread.sleep(4000);
	oDriver.findElement(By.id("SearchInputBox")).sendKeys("eyeliner" + Keys.ENTER);
	Thread.sleep(5000);
	oDriver.findElement(By.xpath("(//*[@class=\'css-43m2vm\'])[2]")).click();
	Thread.sleep(5000);
	oDriver.findElement(By.xpath("(//*[@class=\" css-12z4fj0\"])[1]")).click();
	Thread.sleep(4000);
}
}
