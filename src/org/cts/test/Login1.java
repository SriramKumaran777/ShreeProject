package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.facebook.com/");
		WebElement username=w.findElement(By.xpath("//input[@type='email']"));
		username.sendKeys("7358289360");
		WebElement password=w.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("234567891");
		WebElement button=w.findElement(By.xpath("//input[@value='Log In']"));
		button.click();
		
	}		
		
}
