package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
 public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.facebook.com/");
		WebElement txtuser=w.findElement(By.id("email"));
		txtuser.sendKeys("sriramkumaran777@gmail.com");
		WebElement txtpass=w.findElement(By.name("pass"));
		txtpass.sendKeys("123456789");
		
 }


}
