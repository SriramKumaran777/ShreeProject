package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("http://www.greenstechnologies.in/selenium-training.php");
		WebElement m= w.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions acc=new Actions(w);
		acc.moveToElement(m).perform();
		Thread.sleep(2000);
		WebElement c=w.findElement(By.xpath("//span[text()='Oracle Training ']"));
		acc.moveToElement(c).perform();
		
		
		
		

	}

}
