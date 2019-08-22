package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("http://www.amazon.iN");
		WebElement category = w.findElement(By.id("nav-shop"));
		Actions a = new Actions(w);
		a.moveToElement(category).perform();
		WebElement Mobile = w.findElement(By.xpath("//span[@data-nav-panelkey=\"PhonesAccessoriesPanel\"]"));
		a.moveToElement(Mobile).perform();
		WebElement powerbank = w.findElement(By.xpath("//span[text()=\"Power Banks\"]"));
		powerbank.click();

	}

}
