package org.cts.test;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws AWTException, IOException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("http://www.greenstechnologys.com/");
	w.manage().window().maximize();
	TakesScreenshot t=(TakesScreenshot)w;
	File src=t.getScreenshotAs(OutputType.FILE);
	File desc=new File("C:\\Users\\Vnameit\\Test\\Screenshot\\s.png");
	FileUtils.copyFile(src, desc);
	

			}
}