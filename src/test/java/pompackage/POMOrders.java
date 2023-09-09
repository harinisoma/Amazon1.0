package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AmazonBasePackage.AmazonBaseClass;

public class POMOrders extends AmazonBaseClass{
	
	@FindBy(css="#a-page > section > div > div.a-section.a-spacing-medium.page-tabs > ul > li.page-tabs__tab.page-tabs__tab--selected") WebElement Orders;
	@FindBy(css="#a-page > section > div > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(2) > a") WebElement Buyagain;
	@FindBy(css="#a-page > section > div > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(3) > a") WebElement Notshipped;
	@FindBy(css="#a-page > section > div > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(4) > a") WebElement Cancelledorders;
	@FindBy(css="#nav_prefetch_yourorders > span") WebElement clickorders;
	
	public POMOrders() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickorders() {
		Orders.click();
	}

	public void clickbuyagain() {
		Buyagain.click();
	}
	public void clickNotShipped() {
		Notshipped.click();
	}
	public void clickcancelledorder() {
		Cancelledorders.click();
	}
	
	public void clickordertab() {
		clickorders.click();
	}
}
