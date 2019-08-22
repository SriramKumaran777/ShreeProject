package org.cts.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();               
		w.get("http://demo.automationtesting.in/Alerts.html");
		//Simple Alert
		WebElement a = w.findElement(By.xpath("//button[@class='btn btn-danger']"));
		a.click();
		Alert b=w.switchTo().alert();
		b.accept();
		Thread.sleep(2000);
		//Confirm alert
				WebElement c = w.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
				c.click();
				WebElement d = w.findElement(By.xpath("//button[@class='btn btn-primary']"));
				d.click();
				Alert e=w.switchTo().alert();
				e.dismiss();
				WebElement f = w.findElement(By.xpath("//a[@href='#Textbox']"));
				f.click();
				WebElement g = w.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
				g.click();
				Alert h = w.switchTo().alert();
				h.sendKeys("Sriram");
				h.accept();
				
				
				
				
	}

}
