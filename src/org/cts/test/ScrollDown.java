package org.cts.test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("http://toolsqa.com/");
		WebElement y = w.findElement(By.xpath("//a[text()='ACCEPT']"));
		y.click();
		WebElement a = w.findElement(By.xpath("//p[text()=' for latest updates on QA Events and Tutorials.']"));
		JavascriptExecutor jk=(JavascriptExecutor)w;
		jk.executeScript("arguments[0].scrollIntoView(true)", a);
		

	}

}
