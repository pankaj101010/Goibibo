package Goibibo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectBus {

	public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
driver.get("https://www.goibibo.com/");
driver.findElement(By.xpath("//span[text()='Bus']")).click();
driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
driver.findElement(By.xpath("//input[@id='gi_source']")).sendKeys("Pune");
Robot robot=new Robot();
Thread.sleep(2000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(2000);
driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
driver.findElement(By.xpath("//img[@src='https://gos3.ibcdn.com/tcf_roadblock-1553501027.jpg']"));
driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
driver.switchTo().defaultContent();
robot.keyPress(KeyEvent.VK_TAB);
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='gi_destination']")).sendKeys("Delhi");
Thread.sleep(2000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(2000);
robot.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(2000);
int i=1;
WebElement Calender=driver.findElement(By.xpath("//td[@class='jrdp_calendar_current_day_multi']"));
Calender.click();
driver.findElement(By.xpath("//button[text()='Get Set Go']")).click();;
	}

}
