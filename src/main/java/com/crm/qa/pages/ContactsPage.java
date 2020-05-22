package com.crm.qa.pages;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.util.TestBase;

import cucumber.api.DataTable;

public class ContactsPage extends TestBase{

	//Elementss	
	@FindBy(xpath="//div[@id='main-nav']/a[3]")
	WebElement contactsMain;
	@FindBy(xpath="//a[@href='/contacts/new']")
	WebElement clickNewContactsBtn;
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstName;
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastName;
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement emailaddress;
	@FindBy(xpath="//div[@name='category']")
	WebElement category;
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement saveBtn;
	@FindBy(xpath="//div[@id='dashboard-toolbar']/div[1]")
	WebElement createdContact;
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]")
	WebElement contactNameCheck;
	
	@FindBy(xpath="//div[@name='category']")
	WebElement clickCategory;
	@FindBy(xpath="//div[@name='category']/div[2]/div[3]")
	WebElement lookCustomer;
	@FindBy(linkText="Customer")
	WebElement selectCustomer;
	
	//Initialization
	public ContactsPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	
	public void clickContactsMain() {
		contactsMain.click();
		wait(3000);
		
	}
	
	public void clickNewContactsBtn() {
		clickNewContactsBtn.click();
		wait(3000);
		
	}
	
	public void enterContacts(DataTable contactDetails) {
		for(Map<String, String> data:contactDetails.asMaps(String.class, String.class)) {
			firstName.sendKeys(data.get("firstname"));
			lastName.sendKeys(data.get("lastname"));
			emailaddress.sendKeys(data.get("email"));
			clickCategory.click();
			lookCustomer.click();
			//selectCustomer.click();
			wait(3000);
					
		}
	}
	
	public void saveContBtn() {
		saveBtn.click();
		wait(3000);
	}
	public String savedContactName() {
		String savedContact=createdContact.getText();
		return savedContact;
		
	}
	
	public String contactRecordName() {
		String contactsName=contactNameCheck.getText();
		return contactsName;
	}
	
	}
