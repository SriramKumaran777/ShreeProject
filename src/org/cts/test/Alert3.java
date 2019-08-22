package org.cts.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		WebElement a = w.findElement(By.xpath("//input[@type='submit']"));
		a.click();
		Alert b = w.switchTo().alert();
		b.accept();

	}

}
