package org.cts.test;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Details {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
     WebElement select= driver.findElement(By.xpath("//a[@href='contact.php']"));
     select.click();
     WebElement Uname= driver.findElement(By.xpath("//input[@type='text'][1]"));
     Uname.sendKeys("Sriram");
     WebElement email= driver.findElement(By.xpath("//input[@type='email'][1]"));
     email.sendKeys("Sriram.k5@cognizant.com");
     WebElement mob= driver.findElement(By.xpath("//input[@id='InputSubject']"));
     mob.sendKeys("8883080622");
     Select dropdown= new Select(driver.findElement(By.xpath("//Select[@name='courses']")));
     dropdown.selectByValue("Selenium");
     Select dropdown1= new Select(driver.findElement(By.xpath("//Select[@name='branch']")));
     dropdown1.selectByValue("OMR");
     Select dropdown2= new Select(driver.findElement(By.xpath("//Select[@name='time']")));
     dropdown2.selectByIndex(1);
     WebElement msg= driver.findElement(By.xpath("//textarea[@class='form-control input-message']"));
     msg.sendKeys("Please share me the fees details and schedule time for the classes");
     WebElement submit= driver.findElement(By.xpath("//button[@id='submit']"));
    submit.click();
     
   
     
	}
}
