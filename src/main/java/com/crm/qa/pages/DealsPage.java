package com.crm.qa.pages;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.util.TestBase;

import cucumber.api.DataTable;

public class DealsPage extends TestBase{
	
	//Elements
	@FindBy(xpath="//div[@id='main-nav']/a[5]")
	WebElement Dealslink;
	@FindBy(xpath="//a[@href='/deals/new']")
	WebElement clickNewDealsBtn;
	@FindBy(name="title")
	WebElement inputTitlevalue;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/div")
	WebElement assignTo;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/input")
	WebElement companyName;
	@FindBy(xpath="//div[@name='products']")
	WebElement productName;
	@FindBy(xpath="//input[@name='amount']")
	WebElement inputAmount;
	@FindBy(xpath="//input[@name='probability']")
	WebElement inputProbability;
	@FindBy(xpath="//input[@name='commission']")
	WebElement inputCommision;
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement clickSave;
	@FindBy(xpath="//div[@id='dashboard-toolbar']/div[1]")
	WebElement verifydealSaved;
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]")
	WebElement verifydealSaved2;
	
	public DealsPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
	}
	public void clickDeals() throws InterruptedException {
		Dealslink.click();
		Thread.sleep(3000);

	}
	public void clickNewDealsBtn() {
		clickNewDealsBtn.click();
		wait(3000);
	}
	
	public void enterDealsDetails(DataTable deals) {
		
		for(Map<String, String> data:deals.asMaps(String.class, String.class)) {
			inputTitlevalue.sendKeys(data.get("title"));
			assignTo.sendKeys(data.get("assignedTo"));
			companyName.sendKeys(data.get("company"));
			//productName.sendKeys(data.get("products"));
			inputAmount.sendKeys(data.get("amount"));
			inputCommision.sendKeys(data.get("commission"));
			
			clickSave.click();
			wait(2000);
			
			Dealslink.click();
			wait(4000);
			
			clickNewDealsBtn.click();
		}
		
		/*
		 * inputTitlevalue.sendKeys("Mr"); inputAmount.sendKeys("100");
		 * inputProbability.sendKeys("55"); inputCopmmision.sendKeys("5");
		 */
	}
	
	public void saveDeals() {
		clickSave.click();
		wait(3000);
	}
	public String verifyDeals() {
		String dealsName=verifydealSaved.getText();
		return dealsName;
	}
	public String verifyDealsName() {
		String dealsName=verifydealSaved2.getText();
		return dealsName;
	}

}
