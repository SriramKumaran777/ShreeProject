package org.cts.test;

import java.awt.List;
import java.io.File;
import java.io.IOException;

import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot4 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();               
		w.get("http://greenstech.in/selenium-course-content.html");
		WebElement a = w.findElement(By.xpath("//a[text()='HTC global services']"));
		a.click();
		String par = w.getWindowHandle();
		Set<String> all = w.getWindowHandles();
		for (String x : all) {
			if (!x.equals(par)) {
				w.switchTo().window(x);
			}
			
		}


		TakesScreenshot t=(TakesScreenshot)w;
		File src = t.getScreenshotAs(OutputType.FILE);
		File desc=new File("C:\\Users\\Vnameit\\Test\\Screenshot\\s5.png");
		FileUtils.copyFile(src, desc);

	}

}
