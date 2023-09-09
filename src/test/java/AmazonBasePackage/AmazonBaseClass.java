package AmazonBasePackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import utility.TimeUtils;

public class AmazonBaseClass<FileInputStream> {

	public static Properties prop=new Properties();
	public static WebDriver driver;
	public static Actions action=new Actions(driver);
	
	public AmazonBaseClass() {
		
		try {
		FileInputStream file=new FileInputStream("C:\\Users\\Harini\\eclipse-workspace\\Amazon1.0\\src\\test\\java\\environmentvariables\\Configuration.properties");
	    prop.load(file);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException a) {
			a.printStackTrace();}
		}
		
	public static void initiate() {
		String browsername=prop.getProperty("browser");
		if (browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
		}
	    else if (browsername.equals("Firefox")) {
		    System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		    driver=new FirefoxDriver();
			}
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.navigate().refresh();
		driver.close();
		driver.manage().timeouts().pageLoadTimeout(TimeUtils.timepage, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	
	Actions action1=new Actions(driver);
	action1.moveToElement(driver.findElement(By.id("//*[@id=\"nav-flyout-searchAjax\"]/div[2]/div"))).build().perform();
	

public static void screenshots(String Filename) {
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
	FileUtils.copyFile(file, new File("C:\\Users\\Harini\\eclipse-workspace\\Amazon1.0\\src\\test\\java\\screenshots\\Screenshots" + Filename+".jpg"));
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	}


}
