package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import AmazonBasePackage.AmazonBaseClass;

public class POMShoppingcart extends AmazonBaseClass{

	@FindBy(id="nav-cart-count") WebElement Shoppingcart;

public void addtocart(String name) {
	Shoppingcart.sendKeys(name);
	
}}