package org.frameHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Greens_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		int size = iframes.size();		
		System.out.println(size);
		
		driver.findElement(By.xpath("//input[@class='form-control text-muted']")).sendKeys("123455"+Keys.TAB+Keys.ENTER+Keys.TAB);	
		
		driver.switchTo().defaultContent();
		
//		Thread.sleep(3000);
//		driver.close();
		
	}

}
