package BDLoginTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LanchBrowser {

	RemoteWebDriver driver;
	webdriver driver test;
	@Test
public void logInTest() 
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
	driver.get("https://pilot.bygglov24.com/");
	String title = driver.getTitle();
	System.out.println(title);
	
	driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("geethasaravanan@asteroidsoft.com");
	driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("qwerty123");
	WebElement CompanyDropdown = driver.findElement(By.xpath("//*[@id=\"ddlCompanyList\"]"));
	Select company = new Select(CompanyDropdown);
	company.selectByVisibleText("Bygglov24");
	WebElement FirstSelectedOption = company.getFirstSelectedOption();
	System.out.println("Selected Drop down value " +FirstSelectedOption);
	driver.findElement(By.xpath("//*[@id=\"signIn\"]")).click();
	
	String Dashboard = driver.getTitle();
	System.out.println(Dashboard);
	//driver.quit();
	
}
//@AfterTest
	//public void tearDown() {
	//	driver.quit();	
	//}
}
