package org.cts.test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium1 {
public static void main(String[] args) throws AWTException, InterruptedException,AWTException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Test\\driver\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.facebook.com/");
	WebElement txtuser= w.findElement(By.id("email"));
	txtuser.sendKeys("sriramkumaran777@gmail.com");
	Actions acc= new Actions(w);
	acc.doubleClick(txtuser).perform();
    Robot r= new Robot();
   r.keyPress(KeyEvent.VK_CONTROL);
   r.keyRelease(KeyEvent.VK_DOWN);
   r.keyPress(KeyEvent.VK_ENTER);
   r.keyRelease(KeyEvent.VK_ENTER);
   WebElement txtpass =w.findElement(By.id("pass"));
   txtpass.click();
   r.keyPress(KeyEvent.VK_CONTROL);
   r.keyPress(KeyEvent.VK_V);
   r.keyRelease(KeyEvent.VK_CONTROL);
   r.keyRelease(KeyEvent.VK_V);
}
}

