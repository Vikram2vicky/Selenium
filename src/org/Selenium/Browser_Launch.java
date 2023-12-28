package org.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Greens_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
//		String pageSource = driver.getPageSource();		
//		System.out.println(pageSource);		
		
		driver.navigate().back();
		
		
		
//		---------------Amazon----------------------
		
		driver.get("https://www.amazon.in/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		driver.close();
		
		
	}

}
