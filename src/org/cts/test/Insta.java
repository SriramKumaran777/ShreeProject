package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		WebElement uname=driver.findElement(By.name("username"));
		uname.sendKeys("Sriram");
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("123456");
		
	}

	}
