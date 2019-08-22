package org.cts.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("http://toolsqa.com/automation-practice-form/");
		WebElement a = w.findElement(By.id("selenium_commands"));
		Select b = new Select(a);
		List<WebElement> op = b.getOptions();
		for (int i = 0; i < op.size(); i++) {
			String s = op.get(i).getText();
			System.out.println(s);
		}
	}
		
}
