package pompackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AmazonBasePackage.AmazonBaseClass;

public class POMSearch extends AmazonBaseClass{
	
	@FindBy(id="twotabsearchtextbox") WebElement Searchbox;
	WebElement suggetions;
	
	public POMSearch() {
		PageFactory.initElements(driver, this);
	}
	
	public void typeinsearch(String search) {
		Searchbox.sendKeys(search);
	
	List<WebElement> list =driver.findElements(By.xpath("//*[@id=\"nav-flyout-searchAjax\"]/div[2]/decendant::div[@class='s-suggestion-container']"));
	for (int i=0; i<list.size();i++) {
		System.out.println(list.get(i).getText());
		if(list.get(i).getText().contains("String suggest")) {
			list.get(i).click();
			break;
		}
	}
}
	public void selectsuggestion(String suggest) {
		suggetions.click();
	}
	
	@FindBy(xpath="//*[@id=\"search\"]/span[2]/div/h1/div/div[4]/div/div/form") WebElement sort;
	List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"a-popover-2\""));
	List<String> originalList=elements.stream().map(s->s.getText()).collect(Collectors.toList());
	List<String> sortedList=originalList.sorted().collect(Collectors.toList());
	Assert.assertTrue(originalList.equals(sortedList));
	
	public void clicksort(String sortting) {
		sort.click();
	}
	
	
	
}
