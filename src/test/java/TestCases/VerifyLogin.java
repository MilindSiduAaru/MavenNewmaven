package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.Login_Object;
import Resources.BaseClass;

public class VerifyLogin extends BaseClass {
	@Test
	public void Login_Test() throws IOException {
		driver=InitialiseBrowser();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Login_Object LO=new Login_Object(driver);
		LO.EnterUName().sendKeys("Milind1211");
		LO.EnterUPass().sendKeys("Milind#1211");
		LO.ClickA().click();
	}

}
