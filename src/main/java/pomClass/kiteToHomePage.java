package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class kiteToHomePage {
	@FindBy(xpath = "//span[@class='user-id']")public WebElement UID;
	@FindBy(xpath = "//a[@target='_self']")private WebElement LogoutB;
	
public kiteToHomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public String getActualUserId()  {
	String ActualUID = UID.getText();
	return  ActualUID;
	
	
}
public void logoutKiteApp() throws InterruptedException {
	UID.click();
	Thread.sleep(100);
	
}
public void closeAPP() {
	LogoutB.click();
}

}
