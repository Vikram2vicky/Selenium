package org.CustomizedLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Greens_"
				+ "Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
//		Element Interact with CssSelector(TagName with Attribute Value of ID)
		WebElement search = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		search.sendKeys("nokia");
		
		
//		Element Interact with CssSelector(TagName with Attribute Value of Class)
		WebElement logoClick = driver.findElement(By.cssSelector("a.nav-logo-link.nav-progressive-attribute"));
		logoClick.click();

	}

}
