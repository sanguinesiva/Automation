
public class Autowordpress {
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/sivak/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions act = new Actions(driver);
        driver.navigate().to("http://localhost/wordpress/wp-login.php");
//for Login
                WebElement login = driver.findElement(By.id("user_login"));
        login.sendKeys("siva");
//for Password
        WebElement password = driver.findElement(By.id("user_pass"));
        password.sendKeys("asdf1234");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//For Submit
        WebElement submit = driver.findElement(By.id("wp-submit"));
        act.click(submit).perform();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//for post
        WebElement post = driver.findElement(By.xpath("//*[@id=\"menu-posts\"]/a/div[3]"));
        post.click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//for Add New
        WebElement add = driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[3]/a"));
        add.click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//for CrossBox
        WebElement close = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button"));
        close.click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//For Title
        WebElement title = driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[1]/h1"));
        title.sendKeys("QA Selenium 123 vSQL-\n" +
                "MySQL is a very popular open-source relational database management system (RDBMS).\n" +
                "\n" +
                "What is MySQL?\n" +
                "MySQL is a relational database management system MySQL is open-source MySQL is free MySQL is ideal for both small and large applications MySQL is very fast, reliable, scalable, and easy to use MySQL is cross-platform MySQL is compliant with the ANSI SQL standard MySQL was first released in 1995 MySQL is developed, distributed, and supported by Oracle Corporation MySQL is named after co-founder Monty Widenius's daughter: My\n" +
                "\n" );

        title.sendKeys(Keys.ENTER);

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement docs =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div/div[2]/div[2]/div[3]/div[4]/div/div[2]/div[2]/p[1]"));
        docs.sendKeys("This is subtitle");
 //For Block
        WebElement block = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div[3]/div[3]/div/div[2]/div[2]/p"));
        block.sendKeys("This Is The Test ABC.");
 //For Publish
        WebElement publish = driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div[1]/div/div[1]/div/div[3]/button[3]"));
        publish.click();



    }

}
