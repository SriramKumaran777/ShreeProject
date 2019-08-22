package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouse1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement s = w.findElement(By.id("credit2"));
		WebElement d = w.findElement(By.id("bank"));
		Actions a=new Actions(w);
		a.dragAndDrop(s, d).perform();
		WebElement s1 = w.findElement(By.id("fourth"));
		WebElement d1 = w.findElement(By.id("amt7"));
		a.dragAndDrop(s1, d1).perform();
		WebElement s2 = w.findElement(By.id("credit1"));
		WebElement d2 = w.findElement(By.id("loan"));
		a.dragAndDrop(s2,d2).perform();
		WebElement s3 = w.findElement(By.id("fourth"));
		WebElement d3 = w.findElement(By.id("amt8"));
		a.dragAndDrop(s3, d3).perform();
		WebElement perfect = w.findElement(By.id("equal"));
		String p= perfect.getText();
		if(p.equals("Perfect!"))
		{
			System.out.println("Success");
		
	}
	else {
		System.out.println("Not Success");
	}

}
}