package WABots;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SilverOak {
	public static void main(String args[]) throws Exception {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 2);
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String datestring = sdf.format(d);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohdi\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress","localhost:9050");
		WebDriver driver = new ChromeDriver(options);
		
		driver.findElement(By.xpath("//*[@id=\"side\"]/div[1]/div/label/div/div[2]")).sendKeys("silver oak bot");
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("menu");
	    Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//span[@data-testid='list-msg-icon'][@data-icon='list-msg-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/span[2]/div[1]/div/div/div/div/div/div/div/div/div[1]/div[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/span[2]/div[1]/div/div/div/div/div/div/span/div/div/div/span")).click();
		Thread.sleep(7000);
		System.out.println("project details received");
		driver.findElement(By.xpath("//span[@data-testid='list-msg-icon'][@data-icon='list-msg-icon']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/span[2]/div[1]/div/div/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/span[2]/div[1]/div/div/div/div/div/div/span/div/div/div/span")).click();
		Thread.sleep(10000);
		System.out.println("Amenities received");
		driver.findElement(By.xpath("//span[@data-testid='list-msg-icon'][@data-icon='list-msg-icon']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/span[2]/div[1]/div/div/div/div/div/div/div/div/div[3]/div[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/span[2]/div[1]/div/div/div/div/div/div/span/div/div/div/span")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@title='Type a message'][@role='textbox']")).sendKeys("Test");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@title='Type a message'][@role='textbox']")).sendKeys("Testsignup@gmail.com");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//div[@class='_1U18t'])[last()-1]")).click();
		Thread.sleep(8000);
		 driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys(datestring);
		    r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("1");
		    r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("0000000000");
	    r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[@class='_31pvq'][@role='button'])[3]")).click();
		Thread.sleep(10000);
		System.out.println("Surronding development received");
		Thread.sleep(10000);
		
	}

}
