package org.cts.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseOver1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.gettyimages.in/");
		Thread.sleep(2000);
		WebElement s = w.findElement(By.xpath("//a[@class='text-link--sly action--with-emphasis']"));
		s.click();
		String par = w.getWindowHandle();
		Set<String> all = w.getWindowHandles();
		for (String  x: all) {
			if (!x.equals(par)) {
				w.switchTo().window(x);
			}
		}
		Thread.sleep(2000);
		WebElement select = w.findElement(By.xpath("//a[text()='Entertainment']"));
		select.click();
	}	
	
	}


