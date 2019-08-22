package org.cts.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("http://toolsqa.com/automation-practice-form/");
		WebElement a = w.findElement(By.id("selenium_commands"));
		Select b = new Select(a);
		b.selectByIndex(1);
		b.selectByIndex(3);
        List<WebElement> li = b.getAllSelectedOptions();
        for (WebElement x : li) {
			String s = x.getText();
			System.out.println(s);
		}
	}

}
