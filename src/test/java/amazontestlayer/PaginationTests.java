package amazontestlayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import AmazonBasePackage.AmazonBaseClass;

public class PaginationTests extends AmazonBaseClass{

	public PaginationTests() {
		super();
	}
	
	@Test
	driver.get(prop.getProperty("pagination url"));
    List <WebElement> namesElements = driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]"));
    List<String> names = new ArrayList<String>();
    for (WebElement namesElement : namesElements) {
    	names.add(namesElement.getText());
    }
String nextButtonClassName = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[67]/div/div/span/a[3]")).getAttribute("class");
	while(!nextButtonClassName.contains("disabled")) {
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[67]/div/div/span/a[3]")).click();
		namesElements = driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]"));
		 for (WebElement namesElement : namesElements) {
		    	names.add(namesElement.getText());
	}
		 nextButtonClassName = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[67]/div/div/span/a[3]")).getAttribute("class");
}
	for (String name:names ) {
		System.out.println(name);
	}
	int totalNames=names.size();
	System.out.println("Total number of Names:" + totalNames);
	String.displayedCount=driver.findElement(By.xpath("//*[@id=\"search\"]/span[2]/div/h1/div/div[1]/div/div/span[1]")).getText.split(" ")[4];
	System.out.println("Total number of displayed names count:" + displayedCount);
	Assert.assertEquals(displayedCount, String.valuOf(totalNames));
	Thread.sleep(5000);

	@AfterMethod
	public void quit() {
		driver.quit();
	}
	
}
}
