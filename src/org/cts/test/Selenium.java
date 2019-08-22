package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("http://www.greenstechnologys.com");
	WebElement t=w.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
	String s=t.getText();
	System.out.println(s);
	WebElement r=w.findElement(By.xpath("//font[contains(text(),'IT industry')]"));	
	String d=r.getText();
	System.out.println(d);
}
}
