package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import java.util.Map;

import com.crm.qa.util.TestBase;

import cucumber.api.DataTable;

public class LogsinPage extends TestBase {
	

//Page Factory - OR(Object Repository)
	@FindBy(xpath="//ul[@class='rd-navbar-nav']/a")
	WebElement logbtn;
	
	@FindBy(xpath="//a[contains(@title,'free crm home')]")
	WebElement pageTitle;
	
	@FindBy(xpath="//input[@name='email']")//(name="email")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement passWord;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	@FindBy(xpath="//span[@class='user-display']")
	WebElement validateUserName;

	
	//Initializing the page objects:
	public LogsinPage () throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	//Actions
	public void clickLogBtn() {
    logbtn.click();
	
	}
		
	public String ValidateLoginPageTitle() {
		return driver.getTitle();
	}
	public String pageTitleValidation() {
		String pageid=pageTitle.getText();
		return pageid;
	}
	
	public void credentials(DataTable Credentials) {
		
	for(Map<String, String> data:Credentials.asMaps(String.class, String.class)) {
		userName.sendKeys(data.get("username"));
		passWord.sendKeys(data.get("password"));
		
	}
		
	}
	public void clickToLoginCRM() {
		loginBtn.click();
		wait(3000);
		
	}
	public String loggedInUserName() {
		 String crmUsername= validateUserName.getText();
		 return crmUsername;
	}
	
	
	/*
	 * public HomePage login(String un, String pwd) throws IOException {
	 * username.sendKeys(un); password.sendKeys(pwd); loginBtn.click();
	 * //JavascriptExecutor js=(JavascriptExecutor)driver;
	 * //js.executeScript("arguments[0], click():", loginBtn); return new
	 * HomePage();
	
	} */
	
	public void closeApplication() {
		driver.quit();
	}
}
