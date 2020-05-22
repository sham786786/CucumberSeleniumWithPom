package stepDefinations;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;


import java.io.IOException;

import org.junit.runner.RunWith;
import org.testng.Assert;

import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.LogsinPage;
import com.crm.qa.util.TestBase;

@RunWith(Cucumber.class)

public class contactSteps extends TestBase {
	LogsinPage loginpage;
	ContactsPage contactpage;
	 
	 public contactSteps() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * @Given("^user logs in application$") public void user_logs_in_application()
	 * throws Throwable { TestBase.Initialization(); wait(5000);   	    	
	    }
	  */

	    @And("^user clicks on contacts$")
	    public void user_clicks_on_contacts() throws Throwable {
	    	 contactpage=new ContactsPage();
	    	contactpage.clickContactsMain();
	    }

	    @And("^user click on Contacts new button$")
	    public void user_click_on_contacts_new_button() throws Throwable {
	    	contactpage.clickNewContactsBtn();
	    }

	    @And("^user enters contact details$")
	    public void user_enters_contact_details(DataTable contacts) throws Throwable {
	    
	    contactpage.enterContacts(contacts);
	    
	    	
	    }

	    @And("^click on save$")
	    public void click_on_save() throws Throwable {
	    	contactpage.saveContBtn();
	    }

	    @And("^verify contact saved$")
	    public void verify_contact_saved() throws Throwable {
	    	String contactsNameDetails=contactpage.savedContactName();
	    	Assert.assertEquals("test1 last1", contactsNameDetails);
	    }

	    @And("^user clicks back on contacts$")
	    public void user_clicks_back_on_contacts() throws Throwable {
	    	contactpage.clickContactsMain();
	    }

	    @And("^verify contact record displayed$")
	    public void verify_contact_record_displayed() throws Throwable {
	    	String contactRecordName=contactpage.contactRecordName();
	    	Assert.assertEquals(contactRecordName, "test1 last1");
	    	
	    }

}
