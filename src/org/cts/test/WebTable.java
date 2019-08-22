package org.cts.test;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();     
		w.get("http://toolsqa.com/automation-practice-table/");
		List <WebElement> trows = (List<WebElement>) w.findElement(By.tagName("tr"));
		for (int i = 0; i <trows.size(); i++) {
			WebElement t=trows.get(i);
		}
		List <WebElement> t = (List<WebElement>) w.findElement(By.tagName("tr"));
		for (int i = 0; i <trows.size(); i++) {
			WebElement t=trows.get(i);
	}

}
