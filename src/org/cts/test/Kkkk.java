package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Kkkk {

	public static void main(String[] args) throws InterruptedException {System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("http://demo.guru99.com/test/drag_drop.html");
	WebElement src= w.findElement(By.id("credit2"));
	WebElement des=w.findElement(By.id("bank"));
	Thread.sleep(2000);
	Actions acc= new Actions(w);
	acc.dragAndDrop(src,des).perform();
	
	WebElement src1= w.findElement(By.id("fourth"));
	WebElement des1=w.findElement(By.id("amt7"));
	
	acc.dragAndDrop(src1,des1).perform();
	
	
		

	}

}
