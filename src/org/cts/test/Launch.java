package org.cts.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\Vnameit\\Test\\driver\\IEDriverServer.exe");
		WebDriver w=new InternetExplorerDriver();
		w.get("http://www.greenstechnologys.com/selenium-course-content.html");
		String t=w.getTitle();
		System.out.println("Title is "+t);
		String s=w.getCurrentUrl();
		System.out.println("Url is "+s);
	}
}
