package org.cts.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		WebElement a = w.findElement(By.xpath("//label[text()='Passport Office']"));
		a.click();
		WebElement b = w.findElement(By.xpath("//select[@name='dcdrLocation']"));
		Select s = new Select(b);
		s.selectByIndex(8);
		List<WebElement> d = s.getAllSelectedOptions();
		for (WebElement x : d) {
			String text = x.getText();
			System.out.println(text);
		}
		WebElement c = w.findElement(By.xpath("//input[@name='givenName']"));
		c.sendKeys("Soniya");
		WebElement e = w.findElement(By.xpath("//input[@name='surname']"));
		e.sendKeys("Ramesh");
		WebElement f = w.findElement(By.xpath("//input[@name='dob']"));
		f.sendKeys("01/11/1996");
		WebElement g = w.findElement(By.xpath("//input[@name='email']"));
		g.sendKeys("soniyaramesh32@gmail.com");
		WebElement h = w.findElement(By.xpath("//input[@name='emailloginSame']"));
		h.click();
		WebElement i = w.findElement(By.xpath("//input[@name='pwd']"));
		i.sendKeys("Soniya@12");
		WebElement j = w.findElement(By.xpath("//input[@name='confirmPwd']"));
		j.sendKeys("Soniya@12");
		WebElement k = w.findElement(By.xpath("//select[@name='hintQues']"));
		Select s1 = new Select(k);
		s1.selectByIndex(4);
		WebElement l = w.findElement(By.xpath("//input[@name='hintAns']"));
		l.sendKeys("Grill Chicken");
		
		
}
}
