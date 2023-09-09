package amazontestlayer;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AmazonBasePackage.AmazonBaseClass;
import pompackage.POMSignin;
import testdata.Excelsheet;

public class SigninTests extends AmazonBaseClass {
	
	POMSignin Sign;

	public SigninTests() {
		super();
	}
	
	@BeforeMethod
	public void initsetup() {
		initiate();
		screenshots("Signin");
		Sign=new POMSignin();
	}
	@DataProvider
	public Object[][] Details() throws EncryptedDocumentException, IOException {
		Object result[][]=Excelsheet.readdata("Sheet1");
		return result;
	}
	@Test
	public void Hello() {
		String actual =Sign.verify();
		Assert.assertEquals(actual, "Hello,"+"(Customername)"+"Account & Lists");
	}
	@Test(priority=2, dataProvider="Details")
	public void Signin(String name,String email,String password, String passwordagain) {
		Sign.typecustomername(name);
		Sign.typecustomeremail(email);
		Sign.typepassword(password);
		Sign.typepasswordagain(passwordagain);
		Sign.clickcontinue();
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
