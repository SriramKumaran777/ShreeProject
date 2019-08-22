package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver r=new ChromeDriver();
		r.get("http://demo.automationtesting.in/Register.html");
		WebElement name1=r.findElement(By.xpath("//input[@type='text'][1]"));
		name1.sendKeys("Sriram");
		WebElement name2=r.findElement(By.xpath("//input[@ng-model='LastName']"));
		name2.sendKeys("Kumaran");
		WebElement addr=r.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		addr.sendKeys("Kumbakonam");
		WebElement email=r.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("sriramkumaran777@gmail.com");
		WebElement mob=r.findElement(By.xpath("//input[@type='tel']"));
		mob.sendKeys("8883080622");
		WebElement radio=r.findElement(By.xpath("//input[@value='Male']"));
		radio.click();
		WebElement checkbox=r.findElement(By.xpath("//input[@value='Cricket']"));
		checkbox.click();
		/*Select dropdown=new Select(r.findElement(By.xpath("//span[@role='combobox']")));
		dropdown.selectByValue("English");
		Select dropdown1=new Select(r.findElement(By.xpath("//select[@ng-model='Skill']")));
		dropdown1.selectByValue("Support");
		Select dropdown2=new Select(r.findElement(By.xpath("//select[@ng-model='country']")));
		dropdown2.selectByValue("India");
		Select dropdown3=new Select(r.findElement(By.xpath("//select[@ng-model='yearbox']")));
		dropdown3.selectByValue("1994");
		Select dropdown4=new Select(r.findElement(By.xpath("//select[@ng-model='monthbox']")));
		dropdown4.selectByValue("April");
		Select dropdown5=new Select(r.findElement(By.xpath("//select[@ng-model='daybox']")));
		dropdown5.selectByValue("12");*/
		WebElement pwd1=r.findElement(By.xpath("//input[@id='firstpassword']"));
		pwd1.sendKeys("sriram1994");
		WebElement pwd2=r.findElement(By.xpath("//input[@id='secondpassword']"));
		pwd2.sendKeys("sriram1994");
		WebElement submit=r.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		
		
	
	}
}
