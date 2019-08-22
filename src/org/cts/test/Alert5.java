package org.cts.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.sprint.com/");
		WebElement a = w.findElement(By.xpath("//a[@src='/content/dam/sprint/us/en/icons/icon-sign-in.svg']"));
		a.click();
		WebElement b = w.findElement(By.xpath("//button[text()='Submit']"));
		b.click();
		Thread.sleep(2000);
		Alert c = w.switchTo().alert();
		c.accept();
	}

}
