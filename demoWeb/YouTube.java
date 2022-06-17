package demoWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YouTube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver webSearch = new ChromeDriver();
webSearch.get("https://www.google.co.in/");
WebElement search = webSearch.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
search.sendKeys("youtube");
WebElement search3 = webSearch.findElement(By.className("eIPGRd"));
search3.click();
WebElement search4 = webSearch.findElement(By.className("LC20lb MBeuO DKV0Md"));
search4.click();
WebElement search5 = webSearch.findElement(By.xpath("/html/body/div[7]/div/div[10]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div[1]/a/h3" + Keys.ENTER));
search5.click();
	}

}
