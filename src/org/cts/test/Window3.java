package org.cts.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window3 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("http://www.greenstechnologys.com/");
	    w.manage().window().maximize();
	    Thread.sleep(2000);
	    WebElement a = w.findElement(By.xpath("//a[text()='CONTACT US']"));
	    Actions acc = new Actions(w);
	    acc.contextClick(a).perform();
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    String par = w.getWindowHandle();
	    Set<String> all = w.getWindowHandles();
	    for (String x : all) {
			if (!x.equals(par)) {
				w.switchTo().window(x);
			}
		}
	    WebElement b = w.findElement(By.xpath("//p[contains(text(),'No.19,Balamurugan Garden,')]"));
	    String text = b.getText();
	    System.out.println(text);
}
}
