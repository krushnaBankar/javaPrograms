package baseClass;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilityClass.UtilityNew;
public class BaseNew {
	protected static WebDriver driver;
  
  public void openApplication() throws IOException {
	 
			 System.setProperty("webdriver.chrome.driver", "G:\\\\9thAprilBatch\\\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get(UtilityNew.readDataFromPropretyFile("URL"));
			UtilityNew.time(driver, 1000);
  }
}
