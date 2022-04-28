package WABots;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CinepolisBookTickets {
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
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("1");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
		System.out.println("Clicked on Book tickets");
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("hyd");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	    System.out.println("Entered city");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("1");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	    System.out.println("Movie Selected");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("2");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	    System.out.println("Cinema selected");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("2");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	    System.out.println("Date selected");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("2");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	    System.out.println("Time selected");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("1");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	    System.out.println("Type of seat selected");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("a3");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	    System.out.println("seat number Entered");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("1");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	    System.out.println("Confirmed ticket");
		Thread.sleep(8000);
		System.out.println("Payment link generated");



	}
}
