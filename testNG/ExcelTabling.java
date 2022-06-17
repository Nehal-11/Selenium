package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelTabling {
void read() throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver oDrive = new ChromeDriver();
	String dir = System.getProperty("user.dir");
	String findPath = System.getProperty("file.seperator");
	String pathFile = dir + findPath + "src" +findPath + "main" + findPath + "java" + findPath + "excelLaunch" + findPath + "excelPath.Properties";
	System.out.println(pathFile);
	FileInputStream input = new FileInputStream(pathFile);
	Properties property = new Properties();
	property.load(input);
	String path = property.getProperty("findPath");
	File oFile = new File(path);
	FileInputStream input2 = new FileInputStream(oFile);
	
	
	
}
public static void main(String[] args) throws Exception {
	ExcelTabling table = new ExcelTabling();
	table.read(); 
}
}
