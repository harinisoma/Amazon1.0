package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AmazonBasePackage.AmazonBaseClass;

public class POMAddress extends AmazonBaseClass{
	
	@FindBy(xpath="//*[@id=\\\"nav-al-your-account\\\"]/a[1]/span") WebElement clickaccount;
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div > div > div > div.a-column.a-span3 > img") WebElement Youraddr;
    @FindBy(xpath="//*[@id=\"ya-myab-address-add-link\"]/div") WebElement addaddr;
    @FindBy(xpath="//*[@id=\"address-ui-widgets-countryCode\"]/span/span") WebElement addcountry;
    @FindBy(id="address-ui-widgets-enterAddressFullName") WebElement addname;
    @FindBy(id="address-ui-widgets-enterAddressPhoneNumber") WebElement addphone;
    @FindBy(id="address-ui-widgets-enterAddressLine1") WebElement addaddress;
	@FindBy(id="address-ui-widgets-enterAddressCity") WebElement addcity;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-enterAddressStateOrRegion\"]/span/span") WebElement addprovince;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-enterAddressPostalCode\"]") WebElement addzipcode;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input") WebElement addaddrbutton;
	
	public POMAddress() {
		PageFactory.initElements(driver, this);
	}
    
	public void clickyouraccount() {
		clickaccount.click();
		}
	public void clickyouraddr() {
		Youraddr.click();
		}
	public void clickaddaddr() {
		addaddr.click();
	}
	public void clickaddcountry(String country) {
		addcountry.sendKeys(country);
	}
	public void typename(String name) {
		addname.sendKeys(name);
	}
	public void typephone(CharSequence[] addphone2) {
		addphone.sendKeys(addphone2);
	}
	public void typeaddr(String addr) {
		addaddress.sendKeys(addr);
    }
	public void typecity(String city) {
		addcity.sendKeys(city);
	}
	public void typeprovince(String province) {
		addprovince.sendKeys(province);
	}
    public void typrzipcode(String zip) {
    	addzipcode.sendKeys(zip);
    }
    public void clickaddaddress() {
    	addaddrbutton.click();
	}
	
}
