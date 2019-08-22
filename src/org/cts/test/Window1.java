package org.cts.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.snapdeal.com/");
		w.manage().window().maximize();
		WebElement a = w.findElement(By.xpath("//input[@name='keyword'][1]"));
		a.sendKeys("iphone 7");
		WebElement b = w.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		b.click();
		WebElement c = w.findElement(By.xpath("//p[text()='Apple iPhone 7 ( 32GB , 2 GB ) Black'][1]"));
		c.click();
		String par = w.getWindowHandle();
		Set<String> all = w.getWindowHandles();
		for (String x : all) {
			if (!x.equals(par)) {
				w.switchTo().window(x);
			}
		}
		WebElement d = w.findElement(By.xpath("//span[text()='add to cart']"));
		d.click();
		WebElement e = w.findElement(By.xpath("//span[text()='Rs. 39,900']"));
		String text = e.getText();
		System.out.println(text);
}
}