package StepDefinitions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;


public class LoginPageStep {
	static	WebDriver  driver = null;
	LoginPage l;
@Given("^browser is open$")
public void browser_is_open() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
    System.out.println("  ===  I am inside Browser is open step ===== ");
	
	System.out.println("Inside Step - browser is open");
	
	String projectPath = System.getProperty("user.dir");
	System.out.println("Project path is : "+projectPath);
//	ystem.out.println("Project path is : "+projectPath+"/src/test/java/drivers/chromedriver.exe");

//	ChromeOptions chromeOptions= new ChromeOptions();
//	chromeOptions.setBinary("C:\\Users\\r.b.ramamurthy\\Docsis\\TMO\\src\\test\\resources\\drivers\\chromedriver.exe");
//
//	ChromeDriver driver = new ChromeDriver(chromeOptions);
	
	System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/java/driver/chromedriver.exe");
//	File file = new File("C:/Users/r.b.ramamurthy/Docsis/TMO/src/test/resources/drivers/chromedriver.exe"); 
//	 System.setProperty("webdriver.chrome.driver", file.getAbsolutePath()); 
//	ChromeOptions options = new ChromeOptions();
//	options.addArguments("--headless");
//	options.addArguments("start-maximized");
//	driver = new ChromeDriver(options);

	driver = new ChromeDriver();
//	driver=
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	throw new PendingException();
}

@Given("^user is on login page$")
public void user_is_on_login_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println("User is on Login Page");
	driver.get("https://tvmkg780.test.sprint.com:8443/prweb/wsQEG2c8t5fZ7QCngYvmpc8ZkSwXeESd*/!STANDARD");
	Thread.sleep(10000);
	WebElement logo=driver.findElement(By.xpath("//img"));
    Assert.assertEquals(true,logo.isDisplayed());
			

}
@When("user enters userName and password")
//@When("^user enters \"([^\"]*)\" and password \"([^\"]*)\"$")
//@When("^user enters {string} and password {string}")
//public void user_enters_and_password(String arg1, String arg2) throws Throwable {
public void user_enters_and_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User enters the UserName and Password");
	l=new LoginPage(driver);
//	l.loginValidUser(arg1, arg2);
//	l.enterUsername(arg1);
//	l.enterPassword(arg2);
//	System.out.println(l.loadData().getProperty("userNameVal"));
	l.enterUsername(l.loadData().getProperty("userNameVal"));
//	System.out.println(l.loadData().getProperty("passwordVal"));
	l.enterPassword(l.loadData().getProperty("passwordVal"));
//	System.out.println(l.loadData().getProperty(arg2));
	
}

@When("^User clicks on login$")
public void user_clicks_on_login() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Clicking on Login Button");
	l.clickLogin();
}

@Then("^user is navigated to Home page$")
public void user_is_navigated_to_Home_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User Navigate to Home Page");
	l.validateHomepage();
}



}
