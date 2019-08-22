package org.cts.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("http://www.flipkart.com");
		WebElement close = w.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]"));
		close.click();
		WebElement home = w.findElement(By.xpath("//span[text() ='Home & Furniture']"));
		Actions a = new Actions(w);
		a.moveToElement(home).perform();
		Thread.sleep(2000);
		WebElement chair = w.findElement(By.xpath("//a[text()='Chairs']"));
		chair.click();
		Thread.sleep(2000);
		WebElement select = w.findElement(By.xpath("//a[text()='DZYN Furnitures Leatherette Office Visitor Chair'][1]"));
		select.click();
		Thread.sleep(2000);
		String par=w.getWindowHandle();
		Set<String> all = w.getWindowHandles();
		for (String x: all) {
			if (!x.equals(par)) {
				w.switchTo().window(x);
			}
			
		}
		WebElement go = w.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		go.click();
	}

}
