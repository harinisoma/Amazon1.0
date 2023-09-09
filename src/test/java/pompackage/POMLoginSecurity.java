package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AmazonBasePackage.AmazonBaseClass;

public class POMLoginSecurity extends AmazonBaseClass{
	
	@FindBy(xpath="//*[@id=\\\"nav-al-your-account\\\"]/a[1]/span") WebElement clickaccount;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[1]/div/div[2]/div[2]/a/div/div/div/div[2]/div/span") WebElement Loginsecurity;
	@FindBy(id="auth-cnep-edit-name-button") WebElement Editname;
	@FindBy(id="auth-cnep-edit-email-button") WebElement Editemail;
	@FindBy(id="auth-cnep-add-phone-button") WebElement Editphone;
	@FindBy(id="auth-cnep-edit-password-button") WebElement Editpass;
	@FindBy(id="auth-cnep-done-button") WebElement clickdone;
	@FindBy(id="ap_customer_name") WebElement newname;
	@FindBy(id="cnep_1C_submit_button") WebElement savenewname;
	@FindBy(xpath="//*[@id=\"cvf-page-content\"]/div/div/div/form/div[1]/div/div[2]/div/input") WebElement editnewemail;
	@FindBy(xpath="//*[@id=\"a-autoid-0\"]/span/input") WebElement savenewemail;
	@FindBy(id="ap_phone_number") WebElement newphone;
	@FindBy(id="auth-continue") WebElement continuenewphone;
	
	public POMLoginSecurity() {
		PageFactory.initElements(driver, this);
	}

	public void typenewname(String name) {
		newname.sendKeys(name);
	}
	public void typenewemail(String email) {
		editnewemail.sendKeys(email);
	}
	public void typenewpass(String pass) {
		newphone.sendKeys(pass);
     }
	public void typenewphone(CharSequence[] phone) {
		newphone.sendKeys(phone);
	}
	public void clickcontinue() {
		clickdone.click();
	}
}
