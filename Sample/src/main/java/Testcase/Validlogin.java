package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Validlogin {

	@Test
	public void checkLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaitari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");  //open URL in the browser
		
		driver.manage().window().maximize();
		
		Loginpage lp= new Loginpage();
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Laboratory")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
	}
}
