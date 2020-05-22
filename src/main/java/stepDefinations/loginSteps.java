package stepDefinations;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import okhttp3.Credentials;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.testng.Assert;

import com.crm.qa.pages.LogsinPage;
import com.crm.qa.util.TestBase;

@RunWith(Cucumber.class)
public class loginSteps extends TestBase{
	LogsinPage loginpage;

    public loginSteps() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("^user open the browser$")
    public void user_open_the_browser() throws Throwable {
		TestBase.Initialization();
    }

    @When("^user is on login page$")
    public void user_is_on_login_page() throws Throwable {
    	loginpage=new LogsinPage();
    	String loginTitle=loginpage.ValidateLoginPageTitle();
    	Assert.assertEquals("Free CRM #1 cloud software for any business large or small", loginTitle);
    	
    }

    @Then("^user click on Login button$")
    public void user_click_on_login_button() throws Throwable {
    	wait(5000);
    	loginpage.clickLogBtn();
    }

    @And("^user enter username and password$")
    public void user_enter_username_and_password(DataTable dataTable) throws Throwable {
       	loginpage.credentials(dataTable);
    }

    @And("^user clicks Log button$")
    public void user_clicks_log_button() throws Throwable {
    	loginpage.clickToLoginCRM();
    	wait(5000);
    }

    @And("^validate logged in username$")
    public void validate_logged_in_username() throws Throwable {
		
		 String crmUser=loginpage.loggedInUserName();
		 Assert.assertEquals("Shameer Mulla", crmUser);
		
    	//Assert.assertEquals(loginpage.crmUserName, "Shameer Mulla");
    }

    @And("^close application$")
    public void close_application() throws Throwable {
    	loginpage.closeApplication();
    }

}
