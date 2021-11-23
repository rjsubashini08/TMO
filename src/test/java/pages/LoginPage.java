package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class  LoginPage {
	protected WebDriver driver;
	File file = new File("C:/Users/r.b.ramamurthy/eclipse-workspace/TMO_AutomationArtifact/src/test/resources/config/testData.properties");

	private By txt_username = By.xpath("(//input)[2]");
	
	private By txt_password = By.xpath("(//input)[3]");
	
	private By btn_login = By.xpath("(//span[contains(text(),'Log in')])[1]");
	
	private By btn_menu=By.xpath("(//a[1])[1]");
	
	private By btn_plus=By.xpath("//div[2]/div[1]/ul[1]/li[1]/a[1]/span[1]/span[1]");
	
	private By campaigns=By.xpath("(//span[contains(text(),'Campaigns')])[1]");

	
	public LoginPage(WebDriver driver) {
	
		this.driver = driver;
		System.out.println("Title is "+driver.getTitle());
		if(!driver.getTitle().equals("Pega Platform")) {
			
			throw new IllegalStateException("This is not Pega Platform Login Page. The Current page is "
			+driver.getCurrentUrl());
		}
	}
	public Properties loadData() throws IOException {
	    Properties prop = new Properties();
	    FileInputStream fileInput = null;
	    try {
	        fileInput = new FileInputStream(file);
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }

	    // load properties file
	    try {
	        prop.load(fileInput);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return prop;
	}
	
	public void enterUsername(String username) {
		
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLogin() {
		
		driver.findElement(btn_login).click();
	}
	
public void validateHomepage() throws InterruptedException {
	Thread.sleep(8000);
		Actions act=new Actions(driver);
		WebElement webtnPlus=driver.findElement(btn_plus);
		act.moveToElement(webtnPlus).build().perform();
//		driver.findElement(btn_plus).
		Thread.sleep(4000);
		WebElement camp=driver.findElement(campaigns);
		Assert.assertEquals(true,camp.isDisplayed());
		camp.click();
	}
	
	
	public void loginValidUser(String username, String password) {
		
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}
}
