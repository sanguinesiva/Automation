
public class Users {
	 String testCaseName;
	    String username;
	    String password;

	    public Users(String testCaseName,  String username, String password) {
	        this.testCaseName = testCaseName;
	        this.username = username;
	        this.password = password;
	    }

	    void login(){
	        String url = "https://www.imdb.com/";
	        WebDriver driver = new ChromeDriver();
	        driver.get(url);
	        try{
	            System.setProperty("webdriver.chrome.driver","C:/Users/sivak/Downloads/chromedriver.exe");

	            // Sign In Web Element
	            driver.findElement(By.xpath("//*[@id=\"imdbHeader\"]/div[2]/div[5]/a")).click();
	            //
	            driver.findElement(By.xpath("//*[@id=\"signin-options\"]/div/div[1]/a[1]")).click();
	            // Username and Pass Entry
	            driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(this.username);
	            driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(this.password);
	            //
	            driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();

	            String username = driver.findElement(By.xpath("//*[@id=\"imdbHeader\"]/div[2]/div[5]/div/label[2]/div/span")).getText();
	            System.out.println(username);

	            if(!username.isEmpty()){
	                System.out.printf("Test Case Pass\n");
	                writetoFile("Test Case Passed: Name: "+this.testCaseName+",\n");
	                driver.quit();

	            }else{
	                System.out.println("Test Case Failed.\n");
	                writetoFile("Test Case Failed: Name: "+this.testCaseName+",\n");
	                driver.quit();
	            }
	        }catch (Exception ex){
	            System.out.println("Test Case Failed\n");
	            writetoFile("Test Case Failed: Name: "+this.testCaseName+",\n");
	            driver.quit();
	        }
	    }

	    void writetoFile(String message){
	        try {
	            FileWriter myWriter = new FileWriter("alltestcase.csv",true);
	            myWriter.write(message);
	            myWriter.close();
	        } catch (IOException e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	        }
	    }
	    void clearFile(){
	        try {
	            FileWriter myWriter = new FileWriter("alltestcase.csv",false);
	            myWriter.write("");
	            myWriter.close();
	        } catch (IOException e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	        }
	    }

}
