import org.testng.annotations.Test;


public class DependsOnMethodsDemo {

	@Test
	public void startapp()
	    {
      System.out.println("Start Apllication");
		
	    }
	@Test(dependsOnMethods="startapp")
	public void login()
	{
		System.out.println("Login to application");
	}

	@Test(dependsOnMethods="login")
	public void logoff()
	{
		System.out.println("log out of application");
	}

	}

