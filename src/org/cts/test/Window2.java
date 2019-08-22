package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.homedepot.com/");
	    w.manage().window().maximize();
	    WebElement a = w.findElement(By.xpath("//input[@class='SearchBox__input']"));
	    a.sendKeys("celling fan");
	    WebElement b = w.findElement(By.xpath("//button[@id='headerSearchButton']"));
	    b.click();
	    WebElement c = w.findElement(By.xpath("//img[@src='https://images.homedepot-static.com/productImages/8a4a97e9-0442-4209-8e83-20a618514334/svn/espresso-bronze-home-decorators-collection-ceiling-fans-with-lights-yg493od-eb-64_400_compressed.jpg']"));
	    c.click();
	    WebElement d = w.findElement(By.xpath("//span[text()='Add to Cart']"));
	    d.click();
	    WebElement e = w.findElement(By.xpath("//div[text()='299']"));
	    String text = e.getText();
	    System.out.println(text);
	}
}
