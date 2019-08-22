package org.cts.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();               
		w.get("http://www.greenstechnologys.com/");
		w.manage().window().maximize();
		WebElement src = w.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
		JavascriptExecutor j=(JavascriptExecutor)w;
		j.executeScript("arguments[0].scrollIntoView(true)", src);
		TakesScreenshot t=(TakesScreenshot)w;
		File s = t.getScreenshotAs(OutputType.FILE);
		File d= new File("C:\\Users\\Vnameit\\Test\\Screenshot\\s1.png");
		FileUtils.copyFile(s, d);
		
	}

}
