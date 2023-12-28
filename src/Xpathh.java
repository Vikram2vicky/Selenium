import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathh {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-"
				+ "workspace\\Greens_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		
//		xpath by Contains 
		WebElement searchField = driver.findElement(By.xpath("//input[contains(@id,'twotabsearch')]"));
		searchField.sendKeys("iphone");

//		xpath by index value
		WebElement mob = driver.findElement(By.xpath("(//a[contains(@class,'nav-a  ')][6])"));
		mob.click();
		
//		xpath by text
		WebElement termsCon = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		termsCon.click();
		
		driver.navigate().back();
		
//		xpath by partial text
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Sell under Amazon')]"));
		link.click();		
		
	}

}
