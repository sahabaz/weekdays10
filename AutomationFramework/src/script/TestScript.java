package script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LoginPage;

public class TestScript extends BaseTest
{
	@Test
	public void validLogin() throws EncryptedDocumentException, IOException
	{
		LoginPage l = new LoginPage(d);
		l.username().sendKeys(Excel.readData("Sheet1", 1, 1));
		l.password().sendKeys(Excel.readData("Sheet1", 2, 1));
		l.login().click();
	}
	
//	@Test
//	public void invalidLogin() throws EncryptedDocumentException, IOException
//	{
//		LoginPage l = new LoginPage(d);
//		l.username().sendKeys(Excel.readData("Sheet1", 1, 1));
//		l.password().sendKeys(Excel.readData("Sheet1", 2, 1));
//		Assert.fail();
//		l.login().click();
//	}
}
