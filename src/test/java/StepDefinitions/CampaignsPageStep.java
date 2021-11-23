package StepDefinitions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CampaignsPage;
import pages.LoginPage;


public class CampaignsPageStep {

	CampaignsPage cp;
	static	WebDriver  driver;
//	LoginPage lp;
//	LoginPageStep lp;

	@Then("^user create the multichannel Campaigns$")
	public void user_create_the_multichannel_Campaigns() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		lp=new LoginPage(driver);
//		lp=new LoginPageStep();
		cp=new CampaignsPage(LoginPageStep.driver);

			System.out.println("User Navigate to Multi Channel Campaign Page");
			cp.createCampaigns();
		}
	
	
	@Then("^user enter the Campaigns details on plan tab with \"([^\"]*)\"$")
	public void user_enter_the_Campaigns_details_on_plan_tab_with(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		lp=new LoginPage(driver);
//		lp=new LoginPageStep();
		cp=new CampaignsPage(LoginPageStep.driver);

			System.out.println("User Entering the Capaign Details on plan tab with prospect context");
			cp.enterCampaignDetlsplan(arg1);
		}
	
	@Then("^user enter the Campaigns details on build tab with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_the_Campaigns_details_on_build_tab_with_and(String arg1, String arg2) throws Throwable  {
		cp=new CampaignsPage(LoginPageStep.driver);

			System.out.println("User Entering the Capaign Details on build tab");
			cp.enterBuild(arg1,arg2);
		}
	
	@Then("^user can save the Campaigns$")
	public void user_can_save_the_campaigns() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		lp=new LoginPage(driver);
//		lp=new LoginPageStep();
		cp=new CampaignsPage(LoginPageStep.driver);

			System.out.println("Save the campaigns");
			cp.saveCampaigns();
//			cp.closeDriver();
//			driver.quit();
		}
	@Then("^user can run the Campaigns$")
	public void user_can_run_the_campaigns() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		cp=new CampaignsPage(LoginPageStep.driver);

			System.out.println("Run the campaigns");
			cp.runCampaigns();

		}
	
	@Then("^user can validate the result section$")
	public void user_can_validate_the_result_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		cp=new CampaignsPage(LoginPageStep.driver);

			System.out.println("Validating the result section after Running the campaigns");
			cp.validateResult();

		}
	
	@Then("^user can close the browser$")
	public void user_close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		cp=new CampaignsPage(LoginPageStep.driver);

			System.out.println("close the browser");
			cp.closeDriver();
//			driver.quit();
		}
	
	@Then("user Mark for test in campaigns {string}")
	public void user_Mark_for_test_in_campaigns(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		cp=new CampaignsPage(LoginPageStep.driver);

		System.out.println("Mark for Test");
		cp.markForTest(string);
	    
	}
	@Then("user Load to VNBO in campaigns {string}")
	public void user_Load_to_VNBO_in_campaigns(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		cp=new CampaignsPage(LoginPageStep.driver);

		System.out.println("Load to VNBO");
		cp.loadToVNBO(string);
	    
	}


	}




