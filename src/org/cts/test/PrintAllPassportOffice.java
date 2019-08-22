package org.cts.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllPassportOffice {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
	WebElement a = w.findElement(By.xpath("//select[@name='dcdrLocation']"));
	Select s = new Select(a);
	List<WebElement> li = s.getOptions();
		for (WebElement x : li) {
			String text = x.getText();
			System.out.println(text);
		}
	}
	
}

