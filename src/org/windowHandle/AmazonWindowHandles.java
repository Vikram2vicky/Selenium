package org.windowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Greens_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oppo 5g phones"+Keys.ENTER);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[4]")).click();
		
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		
		
		//switching control to new window
		for(String newWindow:allWindows) {
			
			if(!parentWindow.equals(newWindow)) {
				driver.switchTo().window(newWindow);
			}			
		}		
		Thread.sleep(3000);
		driver.findElement(By.id("bylineInfo")).click();

		
		//switching control to parentwindow
		driver.switchTo().window(parentWindow);		
		Thread.sleep(3000);		
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		
		}

	}

