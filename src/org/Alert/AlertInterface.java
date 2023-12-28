package org.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInterface {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Greens_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement ok = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		ok.click();		
		Alert pa = driver.switchTo().alert();
		pa.accept();
		
		WebElement alertOk = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		alertOk.click();
		WebElement btnclick = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		btnclick.click();
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
		
		WebElement AltwitText = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		AltwitText.click();
		WebElement btn2 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btn2.click();
		Alert alt3 = driver.switchTo().alert();
		alt3.sendKeys("vikram");
		alt3.accept();
		
		
		
		
		
		
	}

}
