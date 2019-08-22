package org.cts.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://retail.onlinesbi.com/retail/login.htm");
		WebElement a = w.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN']"));
		a.click();
		WebElement b = w.findElement(By.id("Button2"));
		b.click();
		Alert c = w.switchTo().alert();
		c.accept();
	}

}
