package org.webTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\AdvancedSelenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement table = driver.findElement(By.tagName("table"));
		WebElement thead = table.findElement(By.tagName("thead"));
		WebElement tfoot = thead.findElement(By.tagName("tfoot"));
		WebElement tdata = tfoot.findElement(By.tagName("tr"));
		WebElement tbody = tdata.findElement(By.tagName("tbody"));
		List<WebElement> contents = tbody.findElements(By.tagName("th"));

		
		for(int i=0;i<=contents.size();i++) {
			WebElement index = contents.get(i);
			String text = index.getText();
			System.out.println(text);
		}
	}

}
