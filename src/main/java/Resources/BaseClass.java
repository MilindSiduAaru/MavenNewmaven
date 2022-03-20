package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	public WebDriver InitialiseBrowser() throws IOException {
		FileInputStream f1=new FileInputStream("E:\\Selenium Demo\\MavenNewMaven\\src\\main\\java\\Resources\\Data.properties");
		Properties prop=new Properties();
		prop.load(f1);
		String BrName=prop.getProperty("Browser");
		if(BrName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		return driver;
		
	}

}
