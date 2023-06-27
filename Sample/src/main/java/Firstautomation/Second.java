package Firstautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaitari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");  //open URL in the browser
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		
		//driver.findElement(By.name("email")).sendKeys("ashwin"); // enter username
		//driver.findElement(By.name("pass")).sendKeys("ashwin");
		//driver.findElement(By.name("login")).click();

	}

}
