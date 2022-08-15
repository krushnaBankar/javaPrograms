package testClass;

import org.testng.annotations.Test;

import baseClass.BaseNew;
import utilityClass.UtilityNew;
import pomClass.KiteToLoginePage;
import pomClass.KiteToPinPage;
import pomClass.kiteToHomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
@Listeners(utilityClass.Listener.class)
public class ValidateKiteUsereIdUsinPropretyFile extends BaseNew {
	
	 
	  KiteToLoginePage login;
	 KiteToPinPage pin;
	 kiteToHomePage home;
  @Test
  public void validateKiteUserId() throws IOException {
	  Assert.assertEquals(home.getActualUserId(), UtilityNew.readDataFromPropretyFile("PIN"));
	  Reporter.log("Actual and expected are validated",true);

  }
  @BeforeMethod
  public void logineKiteApp() throws IOException {
	  login.sendUserId(UtilityNew.readDataFromPropretyFile("UN"));
	  login.sendPassword(UtilityNew.readDataFromPropretyFile("PWD"));
	  pin.pinpageInfo(UtilityNew.readDataFromPropretyFile("PIN"));
	  
	 
  }

  @AfterMethod
  public void logoukite() throws InterruptedException {
	  home.logoutKiteApp();
	  Reporter.log("LOgout is done",true);
  }

  @BeforeClass
  public void launchApplication() throws IOException {
	  openApplication();
	   login= new KiteToLoginePage(driver);
	   pin =new KiteToPinPage(driver);
	   home    =new kiteToHomePage(driver);
	  
	  
  }

  @AfterClass
  public void BrowserClose() {
	  home.closeAPP();
  }

}
