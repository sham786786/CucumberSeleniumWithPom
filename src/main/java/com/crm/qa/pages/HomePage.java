package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.util.TestBase;

public class HomePage extends TestBase {

	// Page Objects/elements
	@FindBy(xpath = "//span[@class='user-display']")
	WebElement userNameLabel;
	@FindBy(xpath = "//div[@id='main-nav']/a[1]")
	WebElement Home;
	@FindBy(xpath = "//div[@id='main-nav']/a[2]")
	WebElement Calender;
	@FindBy(xpath = "//div[@id='main-nav']/a[3]")
	WebElement Contacts;
	@FindBy(xpath = "//div[@id='main-nav']/a[4]")
	WebElement Companies;

	// Initialiaze the page Objects; OR //Constructor
	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	// Actions
	public boolean verifyDisplayName() {
		return userNameLabel.isDisplayed();
	}
	
	/*
	 * public ContactsPage clickOnContactsLink() throws IOException {
	 * Contacts.click(); return new ContactsPage(); }
	 */
	public void clickOnContactsLink() {
	Contacts.click();
	}

}
