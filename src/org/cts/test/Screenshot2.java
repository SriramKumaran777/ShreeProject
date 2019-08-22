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

public class Screenshot2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();               
		w.get("http://greenstech.in/selenium-course-content.html");
		w.manage().window().maximize();
		WebElement a = w.findElement(By.xpath("//h1[text()='RECENT JOB OPENINGS ']"));
		JavascriptExecutor j=(JavascriptExecutor)w;
		j.executeScript("arguments[0].scrollIntoView(true)", a);
		TakesScreenshot t=(TakesScreenshot)w;
		File Src=t.getScreenshotAs(OutputType.FILE);
		File Desc=new File("C:\\Users\\Vnameit\\Test\\Screenshot\\s6.png");
		FileUtils.copyFile(Src, Desc);
		
		
	}

}
