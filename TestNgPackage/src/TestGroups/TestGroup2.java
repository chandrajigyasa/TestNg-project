package TestGroups;

import org.testng.annotations.Test;

public class TestGroup2 {
	@Test(groups={"regression"})
	public void test5()
	{
	System.out.println("Second Regression Test");
	}
	
	@Test(groups={"smoke"})
	public void test6()
	{
	System.out.println(" fourth smoke Test");
	}
	
	@Test(groups={"regression"})
	public void test7()
	{
	System.out.println("Third Regression Test");
	}

	@Test(groups={"regression"})
	public void test8()
	{
	System.out.println("Fourth Regression Test");
	}
	
	
}
