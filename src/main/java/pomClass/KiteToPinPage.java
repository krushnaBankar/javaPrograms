package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteToPinPage {
	@FindBy(id = "pin")private WebElement Pin;
	@FindBy(xpath = "//button[@type='submit']")public WebElement continueB;
	
    public KiteToPinPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    	
    }
    public void pinpageInfo(String PIN) throws InterruptedException {
    	Thread.sleep(100);
    	Pin.sendKeys(PIN);
    	continueB.click();
    	
    }
}
