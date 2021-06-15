package steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import BankAndCashPage.BankCash;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.BrowserFactory;

public class BankStepDef {
	WebDriver driver;
	BankCash bankcash;
	
	@Before
	public void startingBrowser() {
		driver = BrowserFactory.init();
		 bankcash = PageFactory.initElements(driver, BankCash.class);
		
	}
	
	
	@Given("^User is on the techfios login page$")
	public void user_is_on_the_techfios_login_page() throws Throwable {
		
		driver.get("https://techfios.com/billing/?ng=admin/");
	}

	@When("^User enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_and(String name, String passwd) throws Throwable {
		// bankcash = PageFactory.initElements(driver, BankCash.class);
		 bankcash.login_and_password_textbox_field(name, passwd);
	}
	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		bankcash.sigin_on_loginpage();
	}

	@Then("^User should be able to see the dashboard$")
	public void user_should_be_able_to_see_the_dashboard() throws Throwable {
		bankcash.verfiying_dahboard_page();
	}
	@When("^User clicks on bank and cash$")
	public void user_clicks_on_bank_and_cash() throws Throwable {
		bankcash.bank_Cash();
	}

	@When("^User clicks on new account$")
	public void user_clicks_on_new_account() throws Throwable {
		bankcash.newcustomer();
	}
	@When("^User fill up the form entering \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\" and clicks on submit$")
	public void user_fill_up_the_form_entering_and_and_and_and_and_and_and_clicks_on_submit(String acctitle, String desc, int balance, int accnumber, String contactperson, int phonenum, String url) throws Throwable {
		bankcash.account_field(acctitle);
		bankcash.description_field(desc);
		bankcash.balance_field(balance);
		bankcash.acc_num_field(accnumber);
		bankcash.contact_person_field(contactperson);
		bankcash.phone_num_field(phonenum);
		bankcash.url_field(url);
		bankcash.sumbit_field();
	}

	@Then("^User should be able to validate new account created$")
	public void user_should_be_able_to_validate_new_account_created() throws Throwable {
		bankcash.verify_sucessfully_created();
		BrowserFactory.takeScreenShot(driver);
	}
	
	@After
	public  void tearDown() {
		driver.close();
		driver.quit();
	}	

}
