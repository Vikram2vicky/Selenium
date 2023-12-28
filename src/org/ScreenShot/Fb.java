package org.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Fb {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Greens_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc,new File("C:\\Users\\HP\\Desktop\\New folder\\fc.png"));
		System.out.println(sc);
		
	}
	
	

}
