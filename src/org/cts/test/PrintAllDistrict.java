package org.cts.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllDistrict {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://tspsc.gov.in/TSPSCOTR2015/oneTimeRegistration.tspsc");
		WebElement a = w.findElement(By.xpath("//select[@name='dyna(nativeDistrict)']"));
		Select s = new Select(a);
		List<WebElement> op = s.getOptions();
		for (WebElement x : op) {
			String text = x.getText();
			System.out.println(text);
		}
		
		
			
		}
	}


