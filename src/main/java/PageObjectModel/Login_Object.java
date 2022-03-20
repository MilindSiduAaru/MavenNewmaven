package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Object {
	public WebDriver driver;
	By UsName=(By.xpath("//input[@id=\"username\"]"));
	By PassW=(By.xpath("//input[@id=\"password\"]"));
	By CLogin=(By.xpath("//input[@id=\"Login\"]"));
	 public Login_Object(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement EnterUName() {
		 return driver.findElement(UsName);
	 }
	 public WebElement EnterUPass() {
		 return driver.findElement(PassW);
	 }
	 public WebElement ClickA() {
		 return driver.findElement(CLogin);
	 }

}
