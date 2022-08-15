package utilityClass;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;




import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;



public class UtilityNew {
  public static String readDataFromPropretyFile(String key) throws IOException {
	  Properties prop= new Properties();
	  FileInputStream myfile=new FileInputStream("C:\\Users\\Krushna\\eclipse-workspace\\9thAprilEvening\\myProperty.properties");
     prop.load(myfile);
      String value = prop.getProperty(key);
      return value;	  
  }
	
  public static void captureScreenShot(WebDriver driver,String TCID) throws IOException {
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File dest=new File("G:\\9thAprilBatch\\ScreenShot\\TC"+TCID+".png");
	 FileHandler.copy(src, dest);
	 Reporter.log("taken screenScreenShot",true);
	  
  }
  public static void time(WebDriver driver,int second) {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(second));
	  
	  
	  
	  
	  
  }
  
}
