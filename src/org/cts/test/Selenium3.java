package org.cts.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium3 {
	public static void main(String[] args) throws AWTException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("http://www.greenstechnologys.com/");
		w.manage().window().maximize();
		WebElement a=w.findElement(By.xpath("//p[contains(text(),'leading Training')]"));		
		String s=a.getText();
		System.out.println(s);
		Actions acc = new Actions(w);
		acc.doubleClick(a).perform();
		acc.doubleClick(a).perform();
		acc.contextClick(a).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
}
}
