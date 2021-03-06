
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossbrowserTesting {
	WebDriver driver;
	
	/**
	* This function will execute before each Test tag in testng.xml
	* @param browser
	* @throws Exception
	*/
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
	//Check if parameter passed from TestNG is 'firefox'
	if(browser.equalsIgnoreCase("firefox")){
	//create firefox instance
	System.setProperty("webdriver.firefox.driver","C:/Users/sivak/Downloads/geckodriver.exe");
	driver = new FirefoxDriver();
	}
	//Check if parameter passed as 'chrome'
	else if(browser.equalsIgnoreCase("chrome")){
	//set path to chromedriver.exe
	System.setProperty("webdriver.chrome.driver","C:/Users/sivak/Downloads/chromedriver.exe");
	driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("Edge")){
	//set path to Edge.exe
	System.setProperty("webdriver.edge.driver","file:///C:/Users/sivak/Downloads/msedgedriver.exe");
	driver = new EdgeDriver();
	}
	else{
	//If no browser is passed throw exception
	throw new Exception("Incorrect Browser");
	}

	}
	@Test
	public void testParameterWithXML() throws InterruptedException{
	driver.get("https://www.browserstack.com/");
	WebElement Login = driver.findElement(By.linkText("Sign in"));
	//Hit Signin button
	Login.click();
	Thread.sleep(4000);
	WebElement userName = driver.findElement(By.id("user_email_login"));
	//Fill user name
	userName.sendKeys("your email id");
	Thread.sleep(4000);
	//Find password'
	WebElement password = driver.findElement(By.id("user_password"));
	//Fill password
	password.sendKeys("your password");
	Thread.sleep(6000);
	WebElement Signin= driver.findElement(By.id("user_submit"));
	//Hit search button
	Signin.click();
	Thread.sleep(4000);
	assertEquals(false, false)
	}
	

}
