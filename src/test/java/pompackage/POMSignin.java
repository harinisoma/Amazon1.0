package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AmazonBasePackage.AmazonBaseClass;

public class POMSignin extends AmazonBaseClass{
	
	@FindBy(css="#ap_customer_name") WebElement Customername;
	@FindBy(id="ap_email") WebElement Customeremail;
	@FindBy(id="ap_password") WebElement Customerpassword;
	@FindBy(id="ap_password_check") WebElement Customerpasswordagain;
	@FindBy(id="continue") WebElement Continuebutton;
	@FindBy(id="cvf-input-code") WebElement otp;
	@FindBy(css="#cvf-submit-otp-button > span > input") WebElement Createaccount;
	@FindBy(xpath="//*[@id=\\\"nav-flyout-ya-newCust\\\"]/a") WebElement startherebutton;
	
	public void clickstarthere() {
	startherebutton.click();
	}
	public POMSignin() {
		PageFactory.initElements(driver, this);
	}

	public void typecustomername(String name) {
         Customername.sendKeys(name);
	}
	public void typecustomeremail(String email) {
		Customeremail.sendKeys(email);
	}
	public void typepassword(String pass) {
        Customerpassword.sendKeys(pass);
     }
	public void typepasswordagain(String passagain) {
        Customerpasswordagain.sendKeys(passagain);
	}
	public void clickcontinue() {
		Continuebutton.click();
	}
	public String verify() {
		return driver.getTitle();
	}
	
	
}
