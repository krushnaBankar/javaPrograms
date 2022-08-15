package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteToLoginePage {
	
	@FindBy(id ="userid")private WebElement uId;
	@FindBy(id = "password")private WebElement pass;
	@FindBy(xpath = "//button[@type='submit']")private WebElement ContinueButton;
	
   public KiteToLoginePage(WebDriver driver) {
	   PageFactory.initElements(driver, this);
	   
   }
   public void sendUserId(String Un) {
	   uId.sendKeys(Un);
	
   }
   public void sendPassword(String PWD) {
	   pass.sendKeys(PWD);
		 ContinueButton.click();
   }
}
