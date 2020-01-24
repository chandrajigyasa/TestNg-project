package ParallelTestDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class MyParallelDemo {
	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	
	public void startapp(String browser) throws Exception {
		
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","E:\\Softwares Required For Testing Batch\\seleniumGH20software\\geckodriver-v0.26.0-win64\\geckodriver.exe.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else{
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	
	public void login() throws Exception {
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("aishaoberoi@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("123456");
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

		Thread.sleep(3000);
		driver.findElement(By.linkText("Log Out")).click();
	}

	@AfterTest
	public void logoff() {
		driver.quit();
	}
}