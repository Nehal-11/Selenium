package testNG;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		WebDriverManager.chromedriver().setup();
		WebDriver oDriver = new ChromeDriver();
		oDriver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		List<WebElement> rows = oDriver.findElements(By.xpath(
				"/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div[4]/table/tbody/tr"));
		String totalRows = String.valueOf((rows.size() + " buildings"));
		String totalRowsinTable = oDriver.findElement(By.xpath(
				"/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div[4]/table/tfoot/tr/td"))
				.getText();
		if (totalRows.equalsIgnoreCase(totalRowsinTable)) {
			System.out.println("rows matches");
		} else {
			System.out.println("rows does not match");
		}
		System.out.println("enter structure name to check: ");
		String userData = scan.nextLine();
		System.out.println("enter height: ");
		String userdataHeight = scan.nextLine();
		String structueHeight = null;
		for (int rowIndex = 1; rowIndex <= rows.size(); rowIndex++) {
			System.out.println(oDriver.findElement(By.xpath(
					"/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div[4]/table/tbody/tr["
							+ rowIndex + "]"))
					.getText());
			String structueName = oDriver.findElement(By.xpath(
					"/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div[4]/table/tbody/tr["
							+ rowIndex + "]/th"))
					.getText();
			if (structueName.equalsIgnoreCase(userData)) {
				structueHeight = oDriver.findElement(By.xpath(
						"/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div[4]/table/tbody/tr["
								+ rowIndex + "]/td[3]"))
						.getText();

			}
		}
		if (userdataHeight.equalsIgnoreCase(structueHeight)) {
			System.out.println("height matches");
		} else {
			System.out.println("height does not match");
		}
		List<WebElement> lastRow = oDriver.findElements(By.xpath(
				"/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div[4]/table/tfoot/tr/td"));
		int LastCount = (1 + lastRow.size());
		System.out.println("enter the count of last row: ");
		int userRowCount = scan.nextInt();

		if (userRowCount == LastCount) {
			System.out.println("last row matched");
		} else {
			System.out.println("last row not matched");
		}

	}

}
