package utilityClass;

import java.io.IOException;


import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import baseClass.BaseNew;

public class Listener extends BaseNew implements ITestListener
{
   public void onTestStart(ITestResult result) {
	   Reporter.log("TC execuation is started"+result.getName(),true);
	
}
   
   public void onTestSuccess(ITestResult result) {
	   Reporter.log("TC  execuation is success"+result.getName(),true);
		
	}
   public void onTestFailure(ITestResult result) {
	try {
		UtilityNew.captureScreenShot(driver,result.getName() );
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
   public void onTestSkipped(ITestResult result) {
	   Reporter.log("TC  execuation is skipped"+result.getName(),true);
   }
	

}
