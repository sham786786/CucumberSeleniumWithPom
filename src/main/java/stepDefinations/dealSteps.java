package stepDefinations;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.testng.Assert;

import java.io.IOException;

import org.junit.runner.RunWith;

import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.LogsinPage;
import com.crm.qa.util.TestBase;

@RunWith(Cucumber.class)
public class dealSteps extends TestBase {
	DealsPage dealpage;
	LogsinPage loginpage;

	public dealSteps() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@And("^user click on deals$")
	public void user_click_on_deals() throws Throwable {
		dealpage = new DealsPage();
		dealpage.clickDeals();
	}

	@And("^user clicks on Deals New button$")
	public void user_clicks_on_deals_new_button() throws Throwable {
		dealpage.clickNewDealsBtn();
	}

	@And("^enter deals details$")
	public void enter_deals_details(DataTable dealDetails) throws Throwable {
		dealpage.enterDealsDetails(dealDetails);
		}

	/*
	 * @And("^save deals$") public void save_deals() throws Throwable {
	 * dealpage.saveDeals(); }
	 */

	/*
	 * @And("^verify deals submitted$") public void verify_deals_submitted() throws
	 * Throwable { String saveddeals = dealpage.verifyDeals();
	 * Assert.assertEquals("dealsTitle2", saveddeals); }
	 */

	@And("^navigate back on deals$")
	public void navigate_back_on_deals() throws Throwable {
		dealpage.clickDeals();
	}

	@And("^verify deals record displayed$")
	public void verify_deals_record_displayed() throws Throwable {
		String recordedDeals = dealpage.verifyDealsName();
		Assert.assertEquals(recordedDeals, "dealsTitle2");
	}

}
