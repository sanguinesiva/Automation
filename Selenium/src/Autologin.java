
public class Autologin {
	  public static void main(String[] args) throws InterruptedException {
	        String url= "https://www.w3schools.com/";

	        System.setProperty("webdriver.chrome.driver", "C:/Users/sivak/Downloads/chromedriver.exe");
//	        System.setProperty("Webdriver.edge.driver","D:/OneDrive/Documents/msedgedriver.exe");

	        WebDriver d = new ChromeDriver();
	        d.get(url);
	        WebElement login= d.findElement(By.id("w3loginbtn"));
	        login.click();
	        Thread.sleep(1000);
	        WebElement email = d.findElement(By.xpath("//*[@id=\"modalusername\"]"));
	        email.sendKeys("buffalo");
	        WebElement password = d.findElement(By.xpath("//*[@id=\"current-password\"]"));
	        password.sendKeys("fool");
	        WebElement button= d.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[4]/div[1]/button/span"));
	        button.click();

	    }

}
