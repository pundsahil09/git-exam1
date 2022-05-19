package Automation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UL {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\mindsdet136\\Desktop\\COMPRIHENSIVE\\Q1\\SQ5\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.urbanladder.com/");
		
		
		
		
		// 1) LOGIN 
		
		Actions a = new Actions(driver);
		
		
		a.moveToElement(driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']"))).build().perform();
		
		a.moveToElement(driver.findElement(By.xpath("//a[@class='login-link authentication_popup']"))).click().build().perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name='spree_user[email]'])[2]")).sendKeys("pundsahil09@gmail.com");
		
		driver.findElement(By.xpath("(//input[@name='spree_user[password]'])[3]")).sendKeys("Sahilpund100@");
		
		a.moveToElement(driver.findElement(By.xpath("(//input[@name='commit'])[3]"))).click().build().perform();	
	
		Thread.sleep(3000);
		
	
		
		
	}

}
