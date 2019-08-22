package org.cts.test;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {
	public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.google.co.in/webhp");
	WebElement a = w.findElement(By.xpath("//a[@title='Google apps']"));
	a.click();
	String par = w.getWindowHandle();
	Set<String> all = w.getWindowHandles();
	for (String x : all) {
		if (!x.equals(par)) {
		    w.switchTo().window(x);
		}
		
	}
	WebElement b = w.findElement(By.xpath("//span[text()='Gmail']"));
	b.click();
}
}
