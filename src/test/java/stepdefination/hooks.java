package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class hooks {
	public static WebDriver driver;
	
@Before
public void bf()
{
	System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");	
	driver = new ChromeDriver();
}
@After
public void af()
{
	 
	driver.quit();
}
}


