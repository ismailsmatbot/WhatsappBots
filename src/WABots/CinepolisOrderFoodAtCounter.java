package WABots;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CinepolisOrderFoodAtCounter {
	public static void main(String args[]) throws Exception {
	    System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\mohdi\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress","localhost:9010");
		WebDriver driver = new ChromeDriver(options);
		
		driver.findElement(By.xpath("//*[@id=\"side\"]/div[1]/div/label/div/div[2]")).sendKeys("cinepolis");
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("menu");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("2");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
		System.out.println("Clicked on Order food");
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("hyd");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	    System.out.println("Entered city");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("2");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	    System.out.println("Selected pick up at counter");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("2");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	    System.out.println("cinema selected");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("1");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	    System.out.println("food category selected");
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//span[@data-testid='list-msg-icon'][@data-icon='list-msg-icon'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@data-testid='checkbox-round-passive'][@data-icon='checkbox-round-passive'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/span[2]/div[1]/div/div/div/div/div/div/span/div/div/div/span")).click();
		Thread.sleep(5000);
		System.out.println("selected sub category food");
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("1");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	    System.out.println("quantity selected");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("2");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	    System.out.println("order confirmed");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("no");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("payment link generated");
	}
}
