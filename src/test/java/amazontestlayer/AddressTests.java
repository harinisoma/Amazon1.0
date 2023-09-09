package amazontestlayer;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AmazonBasePackage.AmazonBaseClass;
import pompackage.POMAddress;
import pompackage.POMSignin;
import testdata.Excelsheet;

public class AddressTests extends AmazonBaseClass {
	
	POMAddress Addr;

	public AddressTests() {
		super();
	}
	
	@BeforeMethod
	public void initsetup() {
		initiate();
		screenshots("Address");
		Addr=new POMAddress();
	}
	@DataProvider
	public Object[][] Details() throws EncryptedDocumentException, IOException {
		Object result1[][]=Excelsheet.readdata("Sheet2");
		return result1;
	}
	
	@Test
	public void Signin(String addcountry,String addname,int addphone, String addaddress, String addcity, String addprovince, String addzipcode) {
		Addr.clickaddcountry(addcountry);
		Addr.typename(addname);
		Addr.typephone(addphone);
		Addr.typeaddr(addaddress);
		Addr.typecity(addcity);
		Addr.typeprovince(addprovince);
		Addr.typrzipcode(addzipcode);
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}