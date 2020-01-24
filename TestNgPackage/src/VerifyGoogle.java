

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyGoogle {
	WebDriver driver;
	
	@BeforeTest
	public void startapp() {
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	
		driver.manage().window().maximize();
	}
	
	@Test
	public void checktitle()
	{
		String title=driver.getTitle();
		String expectedtitle="Google";
		Assert.assertEquals(expectedtitle, title);
		System.out.println(title);
	}
	
	@Test(priority=1)
	public void checklogo()
	{
		boolean logo=driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertTrue(logo);
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
}
