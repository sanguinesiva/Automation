import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Imdb {
	public  WebDriver driver;
	 @BeforeMethod
	    public void setUp (){
	            System.setProperty("webdriver.chrome.driver", "C:/Users/sivak/Downloads/chromedriver.exe");
	            WebDriver d = new ChromeDriver();
	            d.get("https://www.imdb.com");

	    }

	    @Test
	    public void testing() {

	       
			String title = driver.getTitle();
	        System.out.println(title);
	    }

	            @Test
	            public void signIn() {
	                WebElement signIn = driver.findElement(By.xpath("//*[@id=\"imdbHeader\"]/div[2]/div[5]/a"));
	                signIn.click();
	            }
	            @Test
	            public void signclick() {
	                WebElement signinwwithIMDB = driver.findElement(By.xpath("//*[@id=\"signin-options\"]/div/div[1]/a[1]"));
	                signinwwithIMDB.click();
	            }
	            @Test public void userName() {
	                //step 3
	                WebElement username = driver.findElement(By.id("ap_email"));
	                username.sendKeys("sanguinesiva@gmail.com");
	            }
	            @Test public void password() {
	                //step 4
	                WebElement password = driver.findElement(By.id("ap_password"));
	                password.sendKeys("xyz@123");
	            }
	            @Test public void clickbutton(){
	            //step 5
	            WebElement signinButton= driver.findElement(By.id("signInSubmit"));
	            signinButton.click();


	    }

	    @AfterMethod
	    public void  titleTest(){
	        driver.quit();

	    }

}
