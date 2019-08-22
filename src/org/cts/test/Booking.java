package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement from=driver.findElement(By.id("src"));
		from.sendKeys("Chennai");
		WebElement to=driver.findElement(By.id("dest"));
		to.sendKeys("Kumbakonam");
		
		

	}

}
