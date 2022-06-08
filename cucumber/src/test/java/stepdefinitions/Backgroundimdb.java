package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Backgroundimdb {
	public WebDriver driver;

	@Given("user is on  imdb webpage")
	public void user_is_on_imdb_webpage() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/sivak/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.imdb.com/");
		System.out.println("hi");

	}

	@When("using chrome browser")
	public void using_chrome_browser() throws InterruptedException {
		driver.getTitle();
		Thread.sleep(500);
	}

	@Then("navigates to login page")
	public void navigates_to_login_page() {
		WebElement signin = driver.findElement(By.xpath("//*[@id=\"imdbHeader\"]/div[2]/div[5]/a"));
		signin.click();
	}

	
}
