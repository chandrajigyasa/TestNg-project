import org.testng.annotations.Test;


public class priorityDemo {
	
	@Test
	public void startpp()
	{
		System.out.println("Start Apllication");
		
	}
	@Test(priority=1)
	public void login()
	{
		System.out.println("Login to application");
	}

	@Test
	public void logoff()
	{
		System.out.println("log out of application");
	}
}
