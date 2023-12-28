package org.hotelBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Greens_"
				+ "Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.navigate().to("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("vikram2veera");
		
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("123456");
		
		WebElement loginBtn = driver.findElement(By.id("login"));
		loginBtn.click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select drp1=new Select(location);
		drp1.selectByIndex(2);
		
		WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select htls=new Select(hotels);
		htls.selectByValue("Hotel Cornice");
		
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select rms=new Select(roomType);
		rms.selectByVisibleText("Deluxe");
		
		WebElement noOfRooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select nor=new Select(noOfRooms);
		nor.selectByValue("4");
		
		WebElement checkIN = driver.findElement(By.id("datepick_in"));
		checkIN.sendKeys("18/12/2023");
		
		WebElement checkOut = driver.findElement(By.id("datepick_out"));
		checkOut.sendKeys("19/12/2023");
		
		WebElement adultsPerRoom = driver.findElement(By.id("adult_room"));
		Select apr=new Select(adultsPerRoom);
		apr.selectByVisibleText("3 - Three");
		
		WebElement childrenPerRoom = driver.findElement(By.id("child_room"));
		Select cpr=new Select(childrenPerRoom);
		cpr.selectByIndex(4);
		
		WebElement searchbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		searchbtn.click();
		
		WebElement radioButton = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		radioButton.click();
		
		WebElement continueBtn = driver.findElement(By.id("continue"));
		continueBtn.click();
		
		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.sendKeys("Vikram");
		
		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys("Palanisamy");
		
		WebElement billingAddress = driver.findElement(By.id("address"));
		billingAddress.sendKeys("21-11,gandhinagar,chennai");
		
		WebElement CcNum = driver.findElement(By.id("cc_num"));
		CcNum.sendKeys("62435678432765432");
		
		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select cct=new Select(cctype);
		cct.selectByIndex(3);
		
		WebElement ccExpire = driver.findElement(By.id("cc_exp_month"));
		Select cce=new Select(ccExpire);
		cce.selectByValue("4");
		
		WebElement ccDate = driver.findElement(By.id("cc_exp_year"));
		Select ccd=new Select(ccDate);
		ccd.selectByValue("2019");
		
		WebElement ccvNum = driver.findElement(By.id("cc_cvv"));
		ccvNum.sendKeys("223");
		
		WebElement bookNow = driver.findElement(By.id("book_now"));
		bookNow.click();	
		
	}

}
