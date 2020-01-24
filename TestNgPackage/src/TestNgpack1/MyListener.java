package TestNgpack1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener{


		@Override
		public void onFinish(ITestContext arg0) {
			
		}

		@Override
		public void onStart(ITestContext result) {
			System.out.println("TeST cASE Started"+result.getName());
			
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
//			System.out.println("TeST cASE Failed within successful");

		}

		@Override
		public void onTestFailure(ITestResult result) {
			System.out.println("TeST cASE failed"+result.getName());
			
		}

		@Override
		public void onTestSkipped(ITestResult arg0) {
		
			
		}

		@Override
		public void onTestStart(ITestResult arg0) {
			System.out.println("TeST cASE Started");

		}

		@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("Test case ran Successfully "+result.getName());
		}
		
	}

