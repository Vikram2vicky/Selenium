package org.webTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IPL_Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Greens_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.espncricinfo.com/series/indian-premier-league-2023-1345038/points-table-standings");
		driver.manage().window().maximize();
		
		WebElement tble = driver.findElement(By.tagName("table"));
		WebElement thead = tble.findElement(By.tagName("thead"));
		WebElement trow = thead.findElement(By.tagName("tr"));
		List<WebElement> trows = trow.findElements(By.tagName("th"));
		
		for (int i=0;i<trows.size();i++) {
			WebElement index = trows.get(i);
			String text = index.getText();
			System.out.println(text);
		}
	}

}
