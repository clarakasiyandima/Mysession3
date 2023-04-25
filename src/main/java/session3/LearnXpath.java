package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {
	WebDriver driver;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		 driver =  new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
@Test
public void logintest() {
	//element list
	//webelement type
	WebElement USER_NAME_ELEMENT =driver.findElement(By.xpath("//input[@id='username']"));
	WebElement PASSWORD_ELEMENT= driver.findElement(By.xpath("//input[@id='password']"));
	WebElement SIGN_IN_BUTTON_ELEMENT=driver.findElement(By.xpath("//button[@name='login']"));
	//by type
	By USER_NAME_FIELD=By.xpath("//input[@id='password']");
	By USER_PASSWORD_FIELD = By.xpath("//input[@id='password']");
	By SIGN_IN_BUTTON_FIELD = By.xpath("//button[@name='login']");
	
	USER_NAME_ELEMENT.clear();
	USER_NAME_ELEMENT.sendKeys("demo@techfios.com");
	PASSWORD_ELEMENT.sendKeys("abc123");
	SIGN_IN_BUTTON_ELEMENT.click();


	
}
@Test
public void neglogintest() {
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo@techfios.com1234");
}
}
