package testNG;


import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	Scanner scan = new Scanner(System.in);
	@Test
void search() {
	WebDriverManager.chromedriver().setup();
	WebDriver oDriver = new ChromeDriver();
	oDriver.get("https://www.google.co.in/");
	oDriver.findElement(By.name("q")).sendKeys("amazon.in" + Keys.ENTER);
	oDriver.findElement(By.xpath("//*[@class=\"CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb\"]")).click();
	oDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone" + Keys.ENTER);
	oDriver.findElement(By.xpath("(//*[@class='a-icon a-icon-extender-expand'])[2]")).click();
	List<WebElement> phone = oDriver.findElements(By.xpath("//*[@id='brandsRefinements']/ul"));
	for (WebElement webElement : phone) {
		String mobbrand = webElement.getText();
		System.out.println("Mobile brands: " +mobbrand);
		System.out.println("Enter brand name: ");
		String brand = scan.next();
		if(mobbrand.contains(brand)) {
			System.out.println("given brand is present");
		break;
		}else {
			System.out.println("not present");
			break;
		}
	}
}
}
