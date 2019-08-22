package org.cts.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.amazon.IN/");
	w.manage().window().maximize();
	WebElement a = w.findElement(By.id("twotabsearchtextbox"));
	a.sendKeys("iphone X");
	WebElement b = w.findElement(By.xpath("//input[@value='Go']"));
	b.click();
	WebElement c = w.findElement(By.xpath("//span[text()='Apple iPhone X (64GB) - Silver']"));
	c.click();
	String par = w.getWindowHandle();
	Set<String> all = w.getWindowHandles();
	for (String x : all) {
		if (!x.equals(par)) {
			w.switchTo().window(x);
		}
	}
	WebElement d = w.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	d.click();
}
}
