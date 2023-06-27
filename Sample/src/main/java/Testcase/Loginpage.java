package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	public void enterUserName(WebDriver driver, String uname) {
		
		driver.findElement(By.id("username")).sendKeys("uname");
	}
	
public void enterPassword(WebDriver driver, String pass) {
		
		driver.findElement(By.id("password")).sendKeys("pass");
	}

public void enterLocation(WebDriver driver, String loc) {
	
	driver.findElement(By.id(loc)).click();
}

public void clickLoginButton(WebDriver driver) {
	
	driver.findElement(By.id("loginButton")).click();
	
}
	
}
