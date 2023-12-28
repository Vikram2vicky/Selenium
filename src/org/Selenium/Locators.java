package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Greens_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("vikram");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("12345");
		
		WebElement clickBtn = driver.findElement(By.name("login"));
		clickBtn.click();
		

		

	}

}
