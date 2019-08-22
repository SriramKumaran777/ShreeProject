package org.cts.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://paytm.com/");
		WebElement a = w.findElement(By.xpath("//div[text()='Log In/Sign Up']"));
		a.click();
		//Alert b = w.switchTo().alert();
		//b.accept();
	}

}
