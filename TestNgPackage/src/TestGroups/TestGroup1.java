package TestGroups;

import org.testng.annotations.Test;

public class TestGroup1 {
	
	@Test(groups={"smoke"})
	public void test1() {
		System.out.println("First Smoke Test");
	}
	
	@Test(groups={"smoke"})
	public void test2() {
		System.out.println("Second Smoke Test");
	}
	
	@Test(groups={"smoke"})
	public void test3() {
		System.out.println("Third smoke Test");
	}
	
	@Test(groups={"regression"})
	public void test4()
	{
	System.out.println("First regression Test");

	}
}
