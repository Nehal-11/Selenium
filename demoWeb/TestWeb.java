package demoWeb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWeb {

	@SuppressWarnings("deprecation")
	@Test
	void rating() throws IOException {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String dir = System.getProperty("user.dir");
		System.out.println(" enter the file name = ");
		String filename = scan.nextLine();
		String filepath = dir + File.separator + filename;
		Properties prop = new Properties();

		FileInputStream stream = new FileInputStream(filepath);

		prop.load(stream);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("popup"))).click();
		driver.findElement(By.name(prop.getProperty("search"))).sendKeys("mobile" + Keys.ENTER);
		List<WebElement> totalRating = driver.findElements(By.xpath(prop.getProperty("rating")));
		List<Float> rating = new ArrayList<Float>();
		for (WebElement temp : totalRating) {

			String text = temp.getText();

			rating.add(Float.parseFloat(text));
		}
		System.out.println("maximum rating = " + Collections.max(rating));

		System.out.println("minimum rating = " + Collections.min(rating));

	}

}
