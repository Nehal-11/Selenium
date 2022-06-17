package demoWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQA {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver web = new ChromeDriver();
	web.get("https://demoqa.com/");
	WebElement search = web.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]"));
	search.click();
	Thread.sleep(3000);
	WebElement search1 = web.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li"));
	search1.click();
	Thread.sleep(3000);
	WebElement search2 = web.findElement(By.id("firstName"));
	search2.sendKeys("Nehal");
	Thread.sleep(3000);
	WebElement search3 = web.findElement(By.id("lastName"));
	search3.sendKeys("Ruparel");
	WebElement search4 = web.findElement(By.id("userEmail"));
	search4.sendKeys("a@gmail.com");
}
}
