package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement txt=driver.findElement(By.name("q"));
		txt.sendKeys("GreensTechnology");
	}
}
