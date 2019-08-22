package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paragraph2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("http://www.greenstechnologys.com/");
	WebElement a = w.findElement(By.xpath("//p[@style='text-align:justify; font-size:18px;'][1]"));
	String s=a.getText();
	System.out.println(s);
	}
	

}
