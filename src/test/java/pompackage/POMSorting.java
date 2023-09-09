package pompackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import AmazonBasePackage.AmazonBaseClass;

public class POMSorting extends AmazonBaseClass{


	List<WebElement> beforeFilterPrice=driver.findElements(By.className("a-price-whole"));
	List<Double> beforeFilterPriceList= new ArrayList<>();
	for(WebElement p : beforeFilterPrice) {
		beforeFilterPriceList.add(Double.valueOf(p.getText().replace("$", "")));
	}
	Select dropdown=new Select(driver.findElement((By.className("a-button-text a-declarative"))));
	dropdown.selectByVisibleText("Price: Low to high");
	List<WebElement> afterFilterPrice= driver.findElements(By.className("a-price-whole"));
	List<Double> afterFilterPriceList= new ArrayList<>();
	for(WebElement p1 : afterFilterPrice) {
		afterFilterPriceList.add(Double.valueOf(p1.getText().replace("$", "")));
	}
	Collections.sort(beforeFilterPriceList);
	Assert.assertEquals(beforeFilterPriceList, afterFilterPriceList);
	
}}
