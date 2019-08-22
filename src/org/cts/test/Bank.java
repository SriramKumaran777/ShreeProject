package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		WebElement uname=driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		uname.sendKeys("SriramKumaran");
		WebElement pwd=driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		pwd.sendKeys("12345678");
	}

}
