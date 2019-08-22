package org.cts.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop {

	public static void main(String[] args) throws InterruptedException {System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("http://demo.guru99.com/test/drag_drop.html");
	WebElement src= w.findElement(By.id("credit2"));
	WebElement des=w.findElement(By.className("block13 ui-draggable"));
	Thread.sleep(5000);
	Actions acc= new Actions(w);
	acc.dragAndDrop(src,des).perform();
		

	}

}
