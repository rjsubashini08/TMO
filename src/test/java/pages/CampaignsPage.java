package pages;

import cucumber.runtime.junit.Assertions;
import junit.framework.Assert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class  CampaignsPage {
	protected WebDriver driver;

	
	
	private By campaignsCreate=By.xpath("//button[@class='Simple pzhc pzbutton' and contains(text(),'Create')]");
	private By createmultichanelcamp=By.xpath("//body[1]/div[6]/ul[1]/li[1]/a[1]/span[1]/span[1]");
	private By campaignsName=By.xpath("//*[@id=\"pyLabel\"]");
	private By campaignsIssues=By.cssSelector("#IssueClass");
	private By campaignsGroup=By.cssSelector("#GroupClass");
	private By campaignsProgName=By.cssSelector("#CampaignProgramName");
//	private By campaignsContext=By.xpath("(//span[1]/label[1])[3]");
//	private By campaignsContext=By.xpath("//*[@id='EXPAND-OUTERFRAME']/div[2]/div/div[5]/div/div/div/div[1]/div");
	private By campaignsContext=By.xpath("//div[@class='radioTable']/div/span/label[contains(text(),'Customer')]");
	private By campaignsContextdropdown=By.xpath("//select[@id='SelectedSubjectClass']");
	private By campaignsSaveBtn=By.xpath("//button[contains(text(),'Save')]");
	private By campaignsRunBtn=By.xpath("//button[contains(text(),'Run')]");
	private By campaignsConfirmBtn=By.xpath("//button[contains(text(),'Confirm')]");
	private By campaignsFrame=By.xpath("//iframe[@id='PegaGadget2Ifr']");
	private By campaignsDtlsHeader=By.cssSelector("#headerlabel2564");
	private By campaignsbus=By.cssSelector("//label[contains(text(),'Business')]");
	private By campaignsbuild=By.xpath("(//table[1]/tbody[1]/tr[1]/td[2])[3]");
	private By campaignsConfigStrat=By.xpath("(//button[contains(text(),'Configure')])[1]");
	private By campaignsConfigAud=By.xpath("(//button[contains(text(),'Configure')])[2]");
	private By campaignsConfigEngage=By.xpath("(//button[contains(text(),'Configure')])[3]");
	private By campaignsConfigBan=By.xpath("//a[contains(text(),'Configure')]");
	private By campaignsAdd=By.xpath("(//button[contains(text(),'Add')])[1]");
	private By campaignsRemove=By.xpath("(//button[contains(text(),'Remove')])[1]");
	private By campaignsApply=By.xpath("(//button[contains(text(),'Apply')])[1]");
	private By campaignsSchedule=By.xpath("(//input[@type='checkbox'])[1]");
	private By campaignsRecur=By.xpath("(//span/label[contains(text(),'Recurring')])[1]");
//	private By campaignsContext=By.xpath("//div[@class='radioTable']/div/span/label[contains(text(),'Customer')]");
	private By campaignsSearchStrat=By.cssSelector("#pyValue");
	private By SearchBtn=By.xpath("(//span[1]/i[1])[1]");
	private By SetNoOfOccurences=By.xpath("//label[contains(text(),'Set number of occurrences')]");
	private By MarkForTestY=By.xpath("//label[@for='CPGN_TEST_CDY']");
	private By MarkForTestN=By.xpath("//label[@for='CPGN_TEST_CDN']");
	private By MarkForTestNRadio=By.xpath("//input[@id='CPGN_TEST_CDN']");
	private By MarkForTestOn=By.xpath("//div[contains(text(),'Campaign Testing is on')]");
	private By MarkForTestOff=By.xpath("//div[contains(text(),'Campaign testing is off')]");
	private By loadToVNBOY=By.xpath("//label[@for='LOAD_TO_VNBOY']");
	private By loadToVNBON=By.xpath("//label[@for='LOAD_TO_VNBON']");
	private By LoadToVNBONRadio=By.xpath("//input[@id='LOAD_TO_VNBON']");
	private By loadToVNBOOn=By.xpath("//div[contains(text(),'Campaign Run Marked for VNBO Load')]");
	private By loadToVNBOLabel=By.xpath("//div[contains(text(),'Load to VNBO')]");
	private By completebtn=By.xpath("(//span[contains(text(),'Completed')])[1]");
	private By resultAudience=By.xpath("//span[contains(text(),'Audience')]");
	private By resultStrategy=By.xpath("//span[contains(text(),'Strategy')]");
	private By resultInitiated=By.xpath("//span[contains(text(),'Initiated')]");
	private By statusDropDown=By.xpath("//select[@id='WorkStatusFilter']");
	private By viewBtn=By.xpath("//button[contains(text(),'View')]");
	private By campaigns=By.xpath("//a[contains(text(),'AUTOProg389')]");
//	private By loadToVNBOOff=By.xpath("//div[contains(text(),'Campaign testing is off')]");
	WebDriverWait w1;
	public CampaignsPage(WebDriver driver) {
	
		this.driver = driver;
		System.out.println("Title is "+driver.getTitle());
		if(!driver.getTitle().equals("Pega Marketing")) {
			
			throw new IllegalStateException("This is not Pega Marketing Campaign Page. The Current page is "
			+driver.getCurrentUrl());
		}
	}
	
	
	
	
	public void createCampaigns() throws InterruptedException {
//		WebDriverWait w=new WebDriverWait(driver,20);
//		w.until(ExpectedConditions.)
//		String CreateBtn=driver.findElement(campaignsCreate).getText();
//		Assert.assertEquals(CreateBtn, "Create");
//		String frameId = driver.getActiveFrameId(true);
//		WebElement fe=driver.findElement(campaignsCreate);
//		int fs=driver.findElement(By.tagName("iframe")).;
		//for(int )
		w1=new WebDriverWait(driver,30);
		Thread.sleep(10000);
		driver.switchTo().frame("PegaGadget1Ifr");
		w1.until(ExpectedConditions.presenceOfElementLocated(campaignsCreate));
		System.out.println("Create Button dislapyed "+driver.findElement(campaignsCreate).isDisplayed());
		System.out.println("Create Button Name dislapyed as "+driver.findElement(campaignsCreate).getText());
		driver.findElement(campaignsCreate).click();
		driver.findElement(createmultichanelcamp).click();
//		driver.findElement(btn_login).click();
	}
	
	public void enterCampaignDetlsplan(String context) throws InterruptedException {
		WebDriverWait w=new WebDriverWait(driver,30);
		driver.switchTo().defaultContent();
//	driver.switchTo().activeElement().
//		driver.switchTo().frame(driver.findElement(campaignsFrame));
 	driver.switchTo().frame("PegaGadget2Ifr");
// List<WebElement> eleframe=driver.findElements(By.tagName("iframe"));
// int noiframe=eleframe.size();
// System.out.println("Total Numbe rof Frames "+noiframe);
		String h=driver.findElement(campaignsDtlsHeader).getText();
		System.out.println("Header is "+h);
		int min = 200;  
		int max = 400;  
		int b = (int)(Math.random()*(max-min+1)+min);  
		driver.findElement(campaignsName).sendKeys("AUTOCampaign"+b);
		Thread.sleep(2000);
		driver.findElement(campaignsProgName).click();
		/*Customer and Ban level No need of group and issue
		driver.findElement(campaignsIssues).click();
		Thread.sleep(10000);
		Select selIssues=new Select(driver.findElement(campaignsIssues));
		selIssues.selectByVisibleText("Negotiation");
		Thread.sleep(2000);
		w.until(ExpectedConditions.elementToBeClickable(campaignsGroup));
		driver.findElement(campaignsGroup).click();
		Thread.sleep(10000);
		Select selGrp=new Select(driver.findElement(campaignsGroup));
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(campaignsGroup));
		selGrp.selectByVisibleText("Devices");*/
		Thread.sleep(5000);
		w.until(ExpectedConditions.elementToBeClickable(campaignsProgName));
		driver.findElement(campaignsProgName).click();
		Thread.sleep(1000);
		driver.findElement(campaignsProgName).sendKeys("AUTOProg"+b);
		Thread.sleep(2000);
//		driver.navigate().refresh();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(campaignsContext));
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", driver.findElement(campaignsContext));
		Thread.sleep(10000);
		 System.out.println("Clicking for First Time");
		js.executeScript("arguments[0].click();", driver.findElement(campaignsContext));
		Thread.sleep(6000);
		 System.out.println("Clicking for second Time");

        System.out.println("After clicking on Camapigns Context Radio Button");
        w.until(ExpectedConditions.elementToBeClickable(campaignsContextdropdown));
        driver.findElement(campaignsContextdropdown).click();
        Thread.sleep(5000);
		Select s=new Select(driver.findElement(campaignsContextdropdown));
		if(context.equals("Customer"))
		{
		s.selectByVisibleText("Customer");
		System.out.println("After selecting on Customer DropDown");
		}
		else
		{
		s.selectByVisibleText("Ban");	
		 Thread.sleep(6000);
		System.out.println("After selecting on Ban DropDown");
		 w.until(ExpectedConditions.elementToBeClickable(campaignsConfigBan));
		driver.findElement(campaignsConfigBan).click();
		w.until(ExpectedConditions.elementToBeClickable(campaignsAdd));
		driver.findElement(campaignsAdd).click();
		System.out.println("After clicking on Ban Add Button");
		Thread.sleep(20000);
		String btnrem=driver.findElement(campaignsRemove).getText();
		Assert.assertEquals(btnrem, "Remove");
		WebDriverWait w1=new WebDriverWait(driver,20);
		w1.until(ExpectedConditions.presenceOfAllElementsLocatedBy(campaignsApply));
		driver.findElement(campaignsApply).click();
		Thread.sleep(10000);
		}
		
		
	}
	
	public void enterBuild(String arg1,String arg2) throws InterruptedException {
		WebDriverWait w=new WebDriverWait(driver,40);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", driver.findElement(campaignsbuild));
		Thread.sleep(12000);
		driver.findElement(campaignsbuild).click();
		Thread.sleep(2000);
        w.until(ExpectedConditions.elementToBeClickable(campaignsConfigStrat));
		driver.findElement(campaignsConfigStrat).click();
		Thread.sleep(8000);
		 w.until(ExpectedConditions.elementToBeClickable(campaignsSearchStrat));
		driver.findElement(campaignsSearchStrat).sendKeys(arg1);
		Thread.sleep(3000);
		driver.findElement(SearchBtn).click();
		Thread.sleep(5000);
		driver.findElement(campaignsAdd).click();
		System.out.println("After clicking on Strategy Add Button");
		Thread.sleep(20000);
		String btnrem=driver.findElement(campaignsRemove).getText();
		Assert.assertEquals(btnrem, "Remove");
		
		w.until(ExpectedConditions.presenceOfAllElementsLocatedBy(campaignsApply));
		driver.findElement(campaignsApply).click();
		System.out.println("After clicking on Startegy Apply Button");
		Thread.sleep(18000);
		w.until(ExpectedConditions.presenceOfAllElementsLocatedBy(campaignsConfigAud));
		driver.findElement(campaignsConfigAud).click();
		Thread.sleep(1000);
		driver.findElement(campaignsSearchStrat).sendKeys(arg2);
		Thread.sleep(3000);
		driver.findElement(SearchBtn).click();
		Thread.sleep(5000);
		driver.findElement(campaignsAdd).click();
		System.out.println("After clicking on Audience Add Button");
		Thread.sleep(14000);
		String btnrem1=driver.findElement(campaignsRemove).getText();
		Assert.assertEquals(btnrem1, "Remove");
//		WebDriverWait w1=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.elementToBeClickable(campaignsApply));
		driver.findElement(campaignsApply).click();
		Thread.sleep(8000);
		w1=new WebDriverWait(driver,30);
		System.out.println("After clicking on Audience Apply Button");
		w.until(ExpectedConditions.elementToBeClickable(campaignsConfigEngage));
		driver.findElement(campaignsConfigEngage).click();
		System.out.println("After clicking on Engagement Button");
		Thread.sleep(6000);
		w.until(ExpectedConditions.elementToBeClickable(campaignsSchedule));
		driver.findElement(campaignsSchedule).click();
		System.out.println("After CheckIN to Campaigns Schedule BOx");
		Thread.sleep(1000);
		driver.findElement(campaignsRecur).click();
		System.out.println("After click on Recurring check BOX");
		Thread.sleep(6000);
		driver.findElement(SetNoOfOccurences).click();
		Thread.sleep(3000);
		driver.findElement(By.id("pyEndCount")).sendKeys("1");;
		w.until(ExpectedConditions.elementToBeClickable(campaignsApply));
		driver.findElement(campaignsApply).click();
		System.out.println("After clicking on Apply Button");
		Thread.sleep(1000);
	}
	
	
	public void saveCampaigns() throws InterruptedException {
		w1=new WebDriverWait(driver,40);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", driver.findElement(campaignsSaveBtn));
		Thread.sleep(10000);
		w1.until(ExpectedConditions.elementToBeClickable(campaignsSaveBtn));
		driver.findElement(campaignsSaveBtn).click();
		Thread.sleep(12000);
	}
	
	public void runCampaigns() throws InterruptedException {
		w1=new WebDriverWait(driver,40);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", driver.findElement(campaignsRunBtn));
//		Thread.sleep(3000);
		Thread.sleep(5000);
		w1.until(ExpectedConditions.elementToBeClickable(campaignsRunBtn));
		driver.findElement(campaignsRunBtn).click();
		Thread.sleep(10000);
		js1.executeScript("arguments[0].scrollIntoView();", driver.findElement(campaignsConfirmBtn));
		driver.findElement(campaignsConfirmBtn).click();
		Thread.sleep(10000);
	}
	public void searchWrapUpCampaigns() throws InterruptedException {
		w1=new WebDriverWait(driver,40);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", driver.findElement(statusDropDown));
		driver.findElement(statusDropDown).click();
		Select statusdrpdown=new Select(driver.findElement(statusDropDown));
		statusdrpdown.selectByVisibleText("Wrap-Up");
		
		driver.findElement(viewBtn).click();
		Thread.sleep(10000);
		driver.findElement(campaigns).isDisplayed();
		driver.findElement(campaigns).click();
		driver.findElement(resultStrategy).isDisplayed();
		driver.findElement(resultInitiated).isDisplayed();
		Thread.sleep(10000);
	}
	public void validateResult() throws InterruptedException {
		w1=new WebDriverWait(driver,40);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", driver.findElement(completebtn));
		w1.until(ExpectedConditions.elementToBeClickable(completebtn));
		driver.findElement(completebtn).click();
		driver.findElement(completebtn).click();
		Thread.sleep(10000);
		driver.findElement(resultAudience).isDisplayed();
		driver.findElement(resultStrategy).isDisplayed();
		driver.findElement(resultInitiated).isDisplayed();
		Thread.sleep(10000);
	}
	public void markForTest(String arg1) throws InterruptedException {
		w1=new WebDriverWait(driver,40);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("PegaGadget2Ifr");
		String h=driver.findElement(campaignsDtlsHeader).getText();
		System.out.println("Header is "+h);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", driver.findElement(MarkForTestY));
		Thread.sleep(5000);
		
		/**By Default MarkForTest should be N */
		boolean s=driver.findElement(MarkForTestNRadio).isSelected();
		System.out.println(s);
		 Assert.assertTrue(s);
		 System.out.println("Mark for Test as N is selected By default");
		 
		/*Mark for Test Radio Button select as "Y"
		1.Validate "Campaign Testing is on" display right side
		2.Validate Load to VNBO radio label will disappear */

		if(arg1.equals("Y"))
		{
		w1.until(ExpectedConditions.elementToBeClickable(MarkForTestY));
		driver.findElement(MarkForTestY).click();
		Thread.sleep(8000);
		driver.findElement(MarkForTestOn).isDisplayed();
		String ValMarkTestOn=driver.findElement(MarkForTestOn).getText();
		Assert.assertEquals(ValMarkTestOn, "Campaign Testing is on");
		System.out.println("Mark for Test as Y displayed Campaign Testing is on");
		Thread.sleep(8000);
		Assert.assertFalse(driver.findElement(loadToVNBOLabel).isDisplayed());
		System.out.println("Mark for Test as Y disappears the Load to VNBO");
		}
		/*Mark for Test Radio Button select as "N"
		1.Validate "Campaign testing is off" display right side
		2.Validate Load to VNBO radio button will remains and display */
		else if(arg1.equals("N"))
		{
			w1.until(ExpectedConditions.elementToBeClickable(MarkForTestN));
			driver.findElement(MarkForTestN).click();
			Thread.sleep(8000);
			driver.findElement(MarkForTestOff).isDisplayed();
			String ValMarkTestOn=driver.findElement(MarkForTestOff).getText();
			Assert.assertEquals(ValMarkTestOn, "Campaign testing is off");
			System.out.println("Mark for Test as N displayed Campaign Testing is off");
			String ValloadToVNBO=driver.findElement(loadToVNBOLabel).getText();
			Assert.assertEquals(ValloadToVNBO, "Load to VNBO");
			System.out.println("Mark for Test as N displayed Load to VNBO");
			}
	}
	
	
	
	public void loadToVNBO(String arg1) throws InterruptedException {
		w1=new WebDriverWait(driver,40);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("PegaGadget2Ifr");
		String h=driver.findElement(campaignsDtlsHeader).getText();
		System.out.println("Header is "+h);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", driver.findElement(MarkForTestY));
		Thread.sleep(5000);
		/**By Default LoadToVNBO should be N */
		boolean s=driver.findElement(LoadToVNBONRadio).isSelected();
		System.out.println(s);
		 Assert.assertTrue(s);
		 System.out.println("Load to VNBO as N is selected By default");
		 /*Load to VNBO Radio Button select as "Y"
			1.Validate "Campaign Run Marked for VNBO Load" display right side
			2.Validate Campaign testing is off display right side*/
		if(arg1.equals("Y"))
		{
		w1.until(ExpectedConditions.elementToBeClickable(loadToVNBOY));
		driver.findElement(loadToVNBOY).click();
		Thread.sleep(8000);
		driver.findElement(loadToVNBOOn).isDisplayed();
		String ValVNBOOn=driver.findElement(loadToVNBOOn).getText();
		Assert.assertEquals(ValVNBOOn, "Campaign Run Marked for VNBO Load");
		System.out.println("Load to VNBO as Y displayed Campaign Run Marked for VNBO Load");
		driver.findElement(MarkForTestOff).isDisplayed();
		String ValMarkTestOn=driver.findElement(MarkForTestOff).getText();
		Assert.assertEquals(ValMarkTestOn, "Campaign testing is off");
		System.out.println("Load to VNBO as Y displayed Campaign testing is off");
		}
		/*Load to VNBO Radio Button select as "N"
		1.Validate "Campaign testing is off" display right side*/
	else
	{
			String ValMarkTestOn=driver.findElement(MarkForTestOff).getText();
			Assert.assertEquals(ValMarkTestOn, "Campaign testing is off");
			System.out.println("Load to VNBO as N displayed Campaign testing is off");
			}
	}
	
	public void closeDriver() {
		driver.quit();
	}
	
}
