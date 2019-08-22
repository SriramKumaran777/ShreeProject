package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paragraph1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("http://www.greenstechnologies.in/selenium-training.php");
		WebElement r=w.findElement(By.xpath("//p[contains(text(),'Rated')]"));
		String e=r.getText();
		System.out.println(e);
		WebElement t=w.findElement(By.xpath("//p[contains(text(),'Learn')]"));
		String s=t.getText();
		System.out.println(s);


}
}
