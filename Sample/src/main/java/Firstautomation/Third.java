package Firstautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Third {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaitari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");  //open URL in the browser
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Laboratory")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		System.out.println(driver.findElement(By.id("error-message")).getText());
		driver.findElement(By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")).click();
		driver.findElement(By.name("givenName")).sendKeys("Ashwin");
		driver.findElement(By.name("familyName")).sendKeys("Masurkar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='next-button']")).click();
		Select gender=new Select(driver.findElement(By.id("gender-field")));
		gender.selectByIndex(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='next-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("birthdateDay-field")).sendKeys("04");
		Select birth=new Select(driver.findElement(By.id("birthdateMonth-field")));
		birth.selectByVisibleText("November");
		driver.findElement(By.id("birthdateYear-field")).sendKeys("1996");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='next-button']")).click();
		driver.findElement(By.id("address1")).sendKeys("Kothrud");
		driver.findElement(By.id("cityVillage")).sendKeys("Pune");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("postalCode")).sendKeys("411038");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='next-button']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9766188666");
		driver.findElement(By.xpath("//button[@id='next-button']")).click();
		Select relationship=new Select(driver.findElement(By.name("relationship_type")));
		relationship.selectByIndex(3);
		driver.findElement(By.xpath("//input[@placeholder='Person Name']")).sendKeys("XYZ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='next-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("submit")).click();
		
		
		
	}

}
