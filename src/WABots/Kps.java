package WABots;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Kps {
	public static void main(String args[]) throws Exception {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\mohdi\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress","localhost:9050");
		WebDriver driver = new ChromeDriver(options);
		
		driver.findElement(By.xpath("//*[@id=\"side\"]/div[1]/div/label/div/div[2]")).sendKeys("kps group");
	
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("menu");
	    Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[@class='_1U18t'])[last()-1]")).click();
	
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='_1U18t'])[last()-1]")).click();
	
		Thread.sleep(5000);
		
	
		driver.findElement(By.xpath("(//div[@class='_1U18t'])[last()]")).click();
}
}
